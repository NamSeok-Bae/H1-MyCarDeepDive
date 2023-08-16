import { Outlet, Route, Routes } from 'react-router-dom';
import Header from '@/Components/Header';
import LandingPage from '@/Pages/LandingPage';
import RecommendPage from './Pages/RecommendationPage';
import QuestionPage from './Pages/RecommendationPage/QuestionPage';
import ResultPage from './Pages/RecommendationPage/ResultPage';
import TrimSelectionPage from './Pages/TrimSelectionPage';
import ColorSelectionPage from './Pages/ColorSelectionPage';
import OptionSelectitonPage from './Pages/OptionSelectitonPage';
import RecommendationPage from '@/Pages/RecommendationPage';
import TrimSelectionPage from './Pages/TrimSelectionPage';
import MyCarResultPage from './Pages/MyCarResultPage';

function App() {
  return (
    <div>
      <Header />
      <Routes>
        <Route path='/' element={<LandingPage />} />
        <Route path='/recommend' element={<RecommendPage />}>
          <Route path='question/:step' element={<QuestionPage />} />
          <Route path='result/:step' element={<ResultPage />} />
        </Route>
        <Route path='/select' element={<Outlet />}>
          <Route path='trim' element={<TrimSelectionPage />} />
          <Route path='color' element={<ColorSelectionPage />} />
          <Route path='option' element={<OptionSelectitonPage />} />
        </Route>

        <Route path='/mycar/result' element={<MyCarResultPage />} />
      </Routes>
    </div>
  );
}

export default App;
