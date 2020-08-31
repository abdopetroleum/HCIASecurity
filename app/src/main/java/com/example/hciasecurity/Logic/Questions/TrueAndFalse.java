package com.example.hciasecurity.Logic.Questions;

import java.util.Collections;
import java.util.LinkedList;

public class TrueAndFalse extends Question<String, String> {
    {
        setMyType(MyType.True_And_False);
    }
    public TrueAndFalse() {
        setPoints(15);
    }

    public TrueAndFalse(String question, boolean correct_answer, int chapterNumber) {
        super(question, String.valueOf(correct_answer), String.valueOf(!correct_answer), chapterNumber);
        setPoints(15);
    }

    // firebase setters and getters
    public void setCorrect_answer(String correct_answer) {
        this.correct_answer=correct_answer;
        if(correct_answer.equalsIgnoreCase("True")){
            msetWrong_answer("False");
        }else{
            msetWrong_answer("True");
        }
    }



    public String getCorrect_answer() {
        return this.correct_answer;
    }

    @Override
    public boolean isCorrect(String s) {
        return getCorrect_answer().equalsIgnoreCase(s);
    }

    @Override
    public LinkedList<String> mgetAll_answers() {
        LinkedList<String> answers=new LinkedList<String>();
        answers.push(mgetCorrect_answer());
        answers.push(mgetWrong_answer());
        Collections.shuffle(answers);
        return answers;
    }
}
