package com.example.hciasecurity.Logic.GUIHandlers;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.R;

public class TrueFalseGui implements QustionGUI<String> {
    private TrueAndFalse question;
    private View view;

    public TrueFalseGui(TrueAndFalse question, View view) {
        this.question = question;
        this.view = view;
    }

    @Override
    public void drawGUI() {
        TextView myQuestion =(TextView) view.findViewById(R.id.question);
        myQuestion.setText(question.getQuestion());
    }

    @Override
    public String getUserAnswer() {
        RadioGroup radioGroup=view.findViewById(R.id.radioGroup);
        RadioButton radioButton=view.findViewById(radioGroup.getCheckedRadioButtonId());
        if(radioButton==null){
            return "";
        }
        return radioButton.getText().toString();
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
        textView.setText(question.getCorrect_answer());
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
