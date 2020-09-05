package com.example.hciasecurity.Logic.Questions;

import java.util.LinkedList;

public class StringQuestion extends Question<String,Object>{
    {
        setMyType(MyType.StringQuestion);
        setPoints(15);
    }

    public StringQuestion(String question, String correct_answer ) {
        super(question, correct_answer,null,0 );
    }
    // firebase setters and getters
    public void setCorrect_answer(String correct_answer) {
        this.correct_answer=correct_answer;
    }

    public String getCorrect_answer() {
        return this.correct_answer;
    }
    @Override
    public boolean isCorrect(String s) {
        return mgetCorrect_answer().toLowerCase().trim().contains(s.toLowerCase().trim());
    }

    @Override
    public LinkedList<String> mgetAll_answers() {
        return null;
    }
}
