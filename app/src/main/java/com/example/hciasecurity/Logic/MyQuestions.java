package com.example.hciasecurity.Logic;

import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MyQuestions extends ArrayList<Question> {
   private List<TrueAndFalse> trueAndFalses=new ArrayList<>();
   private List<SingleChoice> singleChoices=new ArrayList<>();
   private List<MultipleChoice> multipleChoices=new ArrayList<>();
    public String getTotalScore (){
            int x=0;
            int y=0;
            for(Question question:this){
                x=x+question.mgetDesevedPoints();
                y=y+question.getPoints();
            }
        return x+"/\n"+y;
    }

    public List<TrueAndFalse> getTrueAndFalses() {
        return trueAndFalses;
    }

    public void setTrueAndFalses(List<TrueAndFalse> trueAndFalses) {
        addAll(trueAndFalses);
        this.trueAndFalses = trueAndFalses;
    }

    public List<SingleChoice> getSingleChoices() {
        return singleChoices;
    }

    public void setSingleChoices(List<SingleChoice> singleChoices) {
        addAll(singleChoices);
        this.singleChoices = singleChoices;
    }

    public List<MultipleChoice> getMultipleChoices() {
        return multipleChoices;
    }

    public void setMultipleChoices(List<MultipleChoice> multipleChoices) {
        addAll(multipleChoices);
        this.multipleChoices = multipleChoices;
    }
    public String getAnsweredTrueAndFalse(){
        int x=0;
        for(Question question:trueAndFalses){
            if(question.mgetQustionGui().isAnswered()){
                x++;
            }
        }
        return x+" / "+trueAndFalses.size();
    }
    public String getAnsweredSingleChoice(){
        int x=0;
        for(Question question:singleChoices){
            if(question.mgetQustionGui().isAnswered()){
                x++;
            }
        }
        return x+" / "+singleChoices.size();
    }
    public String getAnsweredMultipleChiuce(){
        int x=0;
        for(Question question:multipleChoices){
            if(question.mgetQustionGui().isAnswered()){
                x++;
            }
        }
        return x+" / "+multipleChoices.size();
    }

    public String getPointsTrueAndFalse(){
        int x=0;
        int y=0;
        for(Question question:trueAndFalses){
           y=y+question.getPoints();
           x+=question.mgetDesevedPoints();

        }
        return x+" / "+y;
    }
    public String getPointsSingleChoice(){
        int x=0;
        int y=0;
        for(Question question:singleChoices){
            y=y+question.getPoints();
            x+=question.mgetDesevedPoints();

        }
        return x+" / "+y;
    }
    public String getPointsMultipleChoice(){
        int x=0;
        int y=0;
        for(Question question:multipleChoices){
            y=y+question.getPoints();
            x+=question.mgetDesevedPoints();

        }
        return x+" / "+y;
    }
}
