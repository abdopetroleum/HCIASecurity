package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.hciasecurity.Logic.GUIHandlers.MultipleChoiceGUI;
import com.example.hciasecurity.Logic.GUIHandlers.SingleChoiceGUI;
import com.example.hciasecurity.Logic.GUIHandlers.TrueFalseGui;
import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.R;

import java.util.List;

public class AllQuestionsAdapter extends LinearAdapter<Question> {
    public AllQuestionsAdapter(Context context, List<Question> questions) {
        super(context, questions);
    }

    @Override
    public View getView(int position, @NonNull ViewGroup parent, Question question) {
        View listItem;
        if(question.getMyType().equals(Question.MyType.MULTIPLE_CHOICE)){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.multible_choice,parent,false);
            MultipleChoiceGUI multipleChoiceGUI=new MultipleChoiceGUI((MultipleChoice) question,listItem);
            multipleChoiceGUI.drawGUI();
            question.attachQuestionGUI(multipleChoiceGUI);
        }else if (question.getMyType().equals(Question.MyType.True_And_False)){
            listItem= LayoutInflater.from(getContext()).inflate(R.layout.true_and_false_question,parent,false);
            TrueFalseGui trueFalseGui=new TrueFalseGui((TrueAndFalse) question,listItem);
            trueFalseGui.drawGUI();
            question.attachQuestionGUI(trueFalseGui);
        }else{
            listItem=LayoutInflater.from(getContext()).inflate(R.layout.single_choice,parent,false);
            SingleChoiceGUI singleChoiceGUI=new SingleChoiceGUI((SingleChoice) question,listItem);
            singleChoiceGUI.drawGUI();
            question.attachQuestionGUI(singleChoiceGUI);
        }
        return listItem;
    }
}
