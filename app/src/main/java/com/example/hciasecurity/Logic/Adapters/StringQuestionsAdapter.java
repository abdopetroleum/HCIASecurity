package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.hciasecurity.Logic.GUIHandlers.StringQuestionGui;
import com.example.hciasecurity.Logic.GUIHandlers.TrueFalseGui;
import com.example.hciasecurity.Logic.Questions.StringQuestion;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.R;

import java.util.List;

public class StringQuestionsAdapter extends LinearAdapter<StringQuestion> {

    public StringQuestionsAdapter(Context context, List<StringQuestion> stringQuestions) {
        super(context, stringQuestions);
    }

    @Override
    public View getView(int position, @NonNull ViewGroup parent, StringQuestion stringQuestion) {
        View listItem= LayoutInflater.from(getContext()).inflate(R.layout.string_question,parent,false);
        StringQuestionGui stringQuestionGui=new StringQuestionGui(stringQuestion,listItem);
        stringQuestionGui.drawGUI();
        stringQuestion.attachQuestionGUI(stringQuestionGui);
        return listItem;
    }
}
