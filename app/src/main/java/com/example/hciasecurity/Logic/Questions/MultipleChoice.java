package com.example.hciasecurity.Logic.Questions;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MultipleChoice extends Question<LinkedList<String>, LinkedList<String>> {
    {
        setMyType(MyType.MULTIPLE_CHOICE);
    }
    public MultipleChoice(){
        setPoints(20);
    }
    public MultipleChoice(String question, LinkedList<String> correct_answer, LinkedList<String> wrong_answer, int chapterNumber) {
        super(question, correct_answer, wrong_answer, chapterNumber);
        setPoints(20);

    }

    // firebase setters and getters
    public ArrayList<Object> getCorrect_answer() {
        ArrayList<Object> my_array=new ArrayList<Object>();
        my_array.addAll(this.mgetWrong_answer());
        return my_array;
    }

    public void setCorrect_answer(ArrayList<Object> correct_answer) {
        LinkedList<String> strings=new LinkedList<>();
        for(Object o:correct_answer){
            strings.push((String) o);
        }
        this.correct_answer=strings;
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
    public boolean isCorrect(LinkedList<String> strings) {
        for (String s:strings){
            if(!mgetCorrect_answer().contains(s)){
                return false;
            }
        }

        return strings.size()==mgetCorrect_answer().size();
    }

    @Override
    public LinkedList<String> mgetAll_answers() {
        LinkedList<String> answers=new LinkedList<String>();
        answers.addAll(mgetCorrect_answer());
        answers.addAll(mgetWrong_answer());
        Collections.shuffle(answers);
        Log.e("me",answers.size()+"");
        return answers;
    }
}
