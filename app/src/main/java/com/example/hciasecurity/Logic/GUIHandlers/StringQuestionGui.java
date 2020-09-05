package com.example.hciasecurity.Logic.GUIHandlers;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hciasecurity.Logic.Questions.StringQuestion;
import com.example.hciasecurity.R;

public class StringQuestionGui implements QustionGUI<String> {
    private StringQuestion question;
    private View view;

    public StringQuestionGui(StringQuestion question, View view) {
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
        EditText editText=view.findViewById(R.id.edit_text);
        return editText.getText().toString();
    }

    @Override
    public boolean isAnswered() {
        if (getUserAnswer().equals("")) {
            return false;
        }
        return true;    }

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
