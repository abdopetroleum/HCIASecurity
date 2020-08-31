package com.example.hciasecurity.Logic.GUIHandlers;

import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.R;

import java.util.LinkedList;

public class SingleChoiceGUI implements QustionGUI<String> {
    private SingleChoice question;
    private View view;
    private boolean first_Time=true;
    RadioButton[] rb;
    public SingleChoiceGUI(SingleChoice question, View view) {
        this.question = question;
        this.view = view;
    }

    @Override
    public void drawGUI() {
        if (first_Time){
        TextView myQuestion =(TextView) view.findViewById(R.id.question);
        myQuestion.setText(question.getQuestion());
        LinkedList<String> answers=question.mgetAll_answers();
        rb = new RadioButton[answers.size()];
        RadioGroup rg = view.findViewById(R.id.radioGroup);
        for(int i=0; i<answers.size(); i++){
            rb[i] =(RadioButton) View.inflate(view.getContext(),R.layout.my_radio,null);
            rb[i].setText(((char)(65+i))+". "+answers.get(i));
            rb[i].setId(i + 1000);
            rg.addView(rb[i]);
        }
        first_Time=false;
        }
    }

    @Override
    public String getUserAnswer() {
        RadioGroup radioGroup=view.findViewById(R.id.radioGroup);
        RadioButton radioButton=view.findViewById(radioGroup.getCheckedRadioButtonId());
        if(radioButton==null){
            return "";
        }
        return radioButton.getText().toString().substring(3);
    }

    @Override
    public boolean isAnswered() {
        if (getUserAnswer().equals("")) {
            return false;
        }
        return true;
    }

    @Override
    public void drawCorrectAnswer() {
        TextView textView=view.findViewById(R.id.correct_answer);
        textView.setVisibility(View.VISIBLE);
        for(RadioButton radioButton:rb){
            if(question.isCorrect(radioButton.getText().toString().substring(3))){
                textView.setText(radioButton.getText().toString().substring(0,2));
            }
        }
    }

    @Override
    public void drawCorrectAnserFull() {
        if(question.isCorrect(getUserAnswer())){
            view.setBackgroundResource(R.drawable.correctanswer);
        }else {
            drawCorrectAnswer();
            view.setBackgroundResource(R.drawable.wrong_answer);
        }
    }
}
