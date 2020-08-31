package com.example.hciasecurity.Logic.Questions;

import androidx.annotation.Nullable;

import com.example.hciasecurity.Logic.GUIHandlers.QustionGUI;

import java.io.Serializable;
import java.util.LinkedList;

public abstract class Question<T,D>implements Serializable ,Comparable<Question> {
    public enum MyType{
        SINGLE_CHOICE,
        True_And_False,
        MULTIPLE_CHOICE
    }
    private String img_url;
    protected MyType myType;
    private int points;
    private int chapterNumber;
    private int defualtPriority=5;

    public int mgetChapterNumber() {
        return chapterNumber;
    }

    public void msetChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    private int priority;
    private String question;
    protected T correct_answer;
    protected D wrong_answer;

    public Question( String question, T correct_answer, D wrong_answer,int chapterNumber) {
        this.chapterNumber = chapterNumber;
        this.question = question;
        this.correct_answer = correct_answer;
        this.wrong_answer = wrong_answer;
    }

    public Question() {
    }

    private QustionGUI<T> qustionGui;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public MyType getMyType() {
        return myType;
    }

    public void setMyType(MyType myType) {
        this.myType = myType;
    }

    public T mgetCorrect_answer() {
        return correct_answer;
    }

    public void msetCorrect_answer(T correct_answer) {
        this.correct_answer = correct_answer;
    }

    public D mgetWrong_answer() {
        return wrong_answer;
    }

    public QustionGUI mgetQustionGui() {
        return qustionGui;
    }

    public void attachQuestionGUI(QustionGUI qustionGui) {
        this.qustionGui = qustionGui;
    }

    public void msetWrong_answer(D wrong_answer) {
        this.wrong_answer = wrong_answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDefualtPriority() {
        return defualtPriority;
    }

    public void setDefualtPriority(int defualtPriority) {
        this.defualtPriority = defualtPriority;
    }


    public int mgetPriority() {
        return priority;
    }

    public void msetPriority(int priority) {
        this.priority = priority;
    }
    public int mgetDesevedPoints(){
      T t=  qustionGui.getUserAnswer();
      if (isCorrect(t)){
          return points;
      }else {
          return 0;
      }
    };

    public abstract boolean isCorrect(T t);
    public abstract LinkedList<String> mgetAll_answers();

    @Override
    public int compareTo(Question question) {
         if(mgetChapterNumber()>question.mgetChapterNumber()) {
            return -11;
        }else if(mgetChapterNumber()<question.mgetChapterNumber()){
            return 1;
        }
        return 0;
    }
}
