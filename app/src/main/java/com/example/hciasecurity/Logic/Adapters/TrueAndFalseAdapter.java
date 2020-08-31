package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.hciasecurity.Logic.GUIHandlers.TrueFalseGui;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.R;

import java.util.ArrayList;
import java.util.List;

public class TrueAndFalseAdapter extends LinearAdapter<TrueAndFalse> {

    public TrueAndFalseAdapter(Context context, List<TrueAndFalse> trueAndFalses) {
        super(context, trueAndFalses);
    }

    @Override
    public View getView(int position, @NonNull ViewGroup parent, TrueAndFalse trueAndFalse) {
        View listItem= LayoutInflater.from(getContext()).inflate(R.layout.true_and_false_question,parent,false);
        TrueFalseGui trueFalseGui=new TrueFalseGui(trueAndFalse,listItem);
        trueFalseGui.drawGUI();
        trueAndFalse.attachQuestionGUI(trueFalseGui);
        return listItem;
    }
}
