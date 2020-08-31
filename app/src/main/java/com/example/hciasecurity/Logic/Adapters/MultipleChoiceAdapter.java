package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.hciasecurity.Logic.GUIHandlers.MultipleChoiceGUI;
import com.example.hciasecurity.Logic.GUIHandlers.SingleChoiceGUI;
import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.R;

import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceAdapter extends LinearAdapter<MultipleChoice> {
    public MultipleChoiceAdapter(Context context, List<MultipleChoice> questions) {
        super(context, questions);
    }
    @Override
    public View getView(int position, @NonNull ViewGroup parent, MultipleChoice question) {
        View listItem=LayoutInflater.from(getContext()).inflate(R.layout.multible_choice,parent,false);
        MultipleChoiceGUI multipleChoiceGUI=new MultipleChoiceGUI((MultipleChoice) question,listItem);
        multipleChoiceGUI.drawGUI();
        question.attachQuestionGUI(multipleChoiceGUI);
        return listItem;
    }
}
