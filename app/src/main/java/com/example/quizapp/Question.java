package com.example.quizapp;

public class Question {
    public String mQuestions[] ={
            "Which Surah of Quran has Bismillah twice?",
            "Prophet Muhammad (PBUH) belonged to which family?",
            "In the beginning, to which Arab tribe Prophet Muhammad (PBUH) worked as a shepherd?",
            "Which Prophet is called the “Father of Muslims”?",
            "Which Prophet was able to talk with animals and jinns?",
            "The holy book Zabur (or Zaboor) was revealed by Allah to",
            "The holy book Injeel (or Gospel) was revealed by Allah to",
            "Which companion of Prophet (PBUH) was awarded with the title of “The sold of Allah”?",
            "Which companion of Prophet (PBUH) was awarded with the title of “The lion of Allah”?",
            "What was the name of Imam Bukhari (R.A)?",
            " ",

    };

    public String mChoices [][] = {
            {"An-Nahal", "An-Namal", "Al-Ahzaab", "An-Noor"},
            {"Hashami", "Quraishi", "Makki", "Madni"},
            {"Banu Saad", "Banu Asad", "Banu Ummayya", "Banu Makhzoom"},
            {"Prophet Adam (A.S)", "Prophet Ibraheem (A.S)", "Prophet Ismaeel (A.S)", "Prophet Sulaiman (A.S)"},
            {"Prophet Adam (A.S)", "Prophet Ibraheem (A.S)", "Prophet Sulaiman (A.S)", "Prophet Daniyal (A.S)"},
            {"Prophet Ibraheem (A.S)", "Prophet Dawood (A.S)", "Prophet Moosa (A.S)", "Prophet Essa (A.S)"},
            {"Prophet Ibraheem (A.S)", "Prophet Dawood (A.S)", "Prophet Moosa (A.S)", "Prophet Essa (A.S)"},
            {"Abu Bakr Siddique (R.A)", "Umar Farooque (R.A)", "Ali Al-Murtaza (R.A)", "Khalid bin Waleed (R.A)"},
            {"Umar Farooque (R.A)", "Ali Al-Murtaza (R.A)", "Hamza bin Abdul Mattalib (R.A)", "Khalid bin Waleed (R.A)"},
            {"Muhammad bin Ismaeel", "Muhammad Ismaeel", "Muhammad Ibraheem", "Ismaeel bin Ibraheem"},
            {" "," "," "," "},

    };

    public String mCorrectAnswers [] = { "An-Namal", "Hashami", "Banu Saad", "Prophet Ibraheem (A.S)", "Prophet Sulaiman (A.S)", "Prophet Dawood (A.S)", "Prophet Essa (A.S)", "Khalid bin Waleed (R.A)", "Hamza bin Abdul Mattalib (R.A)", "Muhammad bin Ismaeel"," "};

    public String getQuestion (int a){
        String Question = mQuestions[a];
        return Question;
    }

    public String getChoice1 (int a){
        String Choices = mChoices[a][0];
        return Choices;
    }

    public String getChoice2 (int a){
        String Choices = mChoices[a][1];
        return Choices;
    }

    public String getChoice3 (int a){
        String Choices = mChoices[a][2];
        return Choices;
    }

    public String getChoice4 (int a){
        String Choices = mChoices[a][3];
        return Choices;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
