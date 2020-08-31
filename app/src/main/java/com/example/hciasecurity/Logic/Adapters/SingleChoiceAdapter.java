package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.hciasecurity.Logic.GUIHandlers.SingleChoiceGUI;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.R;

import java.util.ArrayList;
import java.util.List;

public class SingleChoiceAdapter extends LinearAdapter<SingleChoice> {
    public SingleChoiceAdapter(Context context, List<SingleChoice> questions) {
        super(context, questions);
    }
    @Override
    public View getView(int position, @NonNull ViewGroup parent, SingleChoice question) {
        View listItem=LayoutInflater.from(getContext()).inflate(R.layout.single_choice,parent,false);
        SingleChoiceGUI singleChoiceGUI=new SingleChoiceGUI((SingleChoice) question,listItem);
        singleChoiceGUI.drawGUI();
        question.attachQuestionGUI(singleChoiceGUI);
        return listItem;
    }
}
