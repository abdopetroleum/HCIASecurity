package com.example.hciasecurity.Logic.GUIHandlers;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.R;

import java.util.LinkedList;

public class MultipleChoiceGUI implements QustionGUI<LinkedList<String>> {
    private MultipleChoice question;
    private View view;
    private CheckBox[] checkBoxes;
    public MultipleChoiceGUI(MultipleChoice question, View view) {
        this.question = question;
        this.view = view;
    }

    @Override
    public void drawGUI() {
        TextView myQuestion =(TextView) view.findViewById(R.id.question);
        LinearLayout linearLayout=view.findViewById(R.id.choices);
        myQuestion.setText(question.getQuestion());
        LinkedList<String> answers=question.mgetAll_answers();
        checkBoxes = new CheckBox[answers.size()];
        for(int i=0; i<answers.size(); i++){
            checkBoxes[i] =(CheckBox) View.inflate(view.getContext(),R.layout.my_check,null);
            checkBoxes[i].setText(((char)(65+i))+". "+answers.get(i));
            checkBoxes[i].setId(i + 1000);
            linearLayout.addView(checkBoxes[i]);
        }

    }

    @Override
    public LinkedList<String> getUserAnswer() {
        LinkedList<String> userAnswers=new LinkedList<String>();
        for(CheckBox checkBox:checkBoxes) {
            if(checkBox.isChecked()){
                userAnswers.push(checkBox.getText().toString().substring(3));
            }
        }

        return userAnswers;
    }
    @Override
    public boolean isAnswered() {
        if (getUserAnswer().size()==0) {
            return false;
        }
        return true;
    }

    @Override
    public void drawCorrectAnswer() {
        TextView textView=view.findViewById(R.id.correct_answer);
        textView.setVisibility(View.VISIBLE);
        for(CheckBox checkBox:checkBoxes){
            if(question.mgetCorrect_answer().contains(checkBox.getText().toString().substring(3))){
                textView.setText(textView.getText()+" " +checkBox.getText().toString().substring(0,2));
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
