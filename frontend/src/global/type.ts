import { ReactNode } from 'react';

export interface RadioProps {
  name: string;
  value: string;
  onChangeHandler: (e: React.ChangeEvent<HTMLInputElement>) => void;
}

export interface QuestionStepProps {
  step: string;
}

export interface LifeStyleRadioProps {
  onChangeHandler: (e: React.ChangeEvent<HTMLInputElement>) => void;
  setShowLifeStyleModal: React.Dispatch<React.SetStateAction<boolean>>;
  data: {
    value: string;
    tags: string[];
    description: string;
    profileImage: string;
  };
}

export interface WrapperProps {
  children: ReactNode;
}
