package com.example.hciasecurity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.hciasecurity.Logic.Adapters.AllQuestionsAdapter;
import com.example.hciasecurity.Logic.Adapters.LinearAdapter;
import com.example.hciasecurity.Logic.MyQuestions;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.QuestionsFillers;

public class AllQuestgionsActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    MyQuestions questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_questgions);
        initializeView();
        initializeVars();
        AllQuestionsAdapter allQuestionsAdapter=new AllQuestionsAdapter(AllQuestgionsActivity.this,questions);
        allQuestionsAdapter.isForAll=true;
        allQuestionsAdapter.fillLayout(linearLayout);
        for(Question question:questions){
            question.mgetQustionGui().drawCorrectAnswer();
        }
    }
    void initializeView(){
        linearLayout=findViewById(R.id.linear_layout);
    }
    void initializeVars(){
        questions=QuestionsFillers.getAllQueations();
    }
}