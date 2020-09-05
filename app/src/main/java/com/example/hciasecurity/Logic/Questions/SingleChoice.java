package com.example.hciasecurity.Logic.Questions;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SingleChoice extends Question<String, LinkedList<String>> {
    {
        setMyType(MyType.SINGLE_CHOICE);
        setPoints(15);
    }
    public SingleChoice() {

    }
    public SingleChoice(String question, String correct_answer, LinkedList<String> wrong_answer, int chapterNumber) {
        super(question, correct_answer, wrong_answer, chapterNumber);
    }
    // firebase setters and getters
    public void setCorrect_answer(String correct_answer) {
        this.correct_answer=correct_answer;
    }



    public String getCorrect_answer() {
        return this.correct_answer;
    }

    public ArrayList<Object> getWrong_answer() {
        ArrayList<Object> my_array=new ArrayList<Object>();
        my_array.addAll(this.mgetWrong_answer());
        return my_array;
    }

    public void setWrong_answer(ArrayList<Object> wrong_answer) {
       LinkedList<String> strings=new LinkedList<>();
       for(Object o:wrong_answer){
           strings.push((String) o);
       }
       this.wrong_answer=strings;
    }
    @Override
    public boolean isCorrect(String s) {

        return getCorrect_answer().toLowerCase().contains(s.toLowerCase())&&(!s.equals(""));
    }
   @Override
    public LinkedList<String> mgetAll_answers() {
        LinkedList<String> answers=new LinkedList<String>();
        answers.addAll(mgetWrong_answer());
        answers.push(getCorrect_answer());
        Collections.shuffle(answers);
        return answers;
    }
}
