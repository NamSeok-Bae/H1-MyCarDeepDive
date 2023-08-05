import OptionItem from './OptionItem';

interface RecommendCarOptionProps {
  title: string;
  optionData: {
    image: string;
    name: string;
    price: string;
    description: string;
  }[];
}

function RecommendCarOption({ title, optionData }: RecommendCarOptionProps) {
  return (
    <>
      <div className='font-caption1-regular text-grey-300 mb-[6px]'>
        {title}
      </div>
      <div className='flex justify-between gap-4'>
        {optionData.map(item => (
          <OptionItem
            image={item.image}
            name={item.name}
            price={item.price}
            description={item.description}
          />
        ))}
      </div>
    </>
  );
}

export default RecommendCarOption;
