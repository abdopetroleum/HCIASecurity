package com.example.hciasecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.hciasecurity.Logic.QuestionsFillers;

public class MainActivity2 extends AppCompatActivity {
    View mainView;
    Button completeExam;
    Button smallExam;
    Button TrueOrFalseQiz;
    Button SCQuiz;
    Button MCQuiz;
    Button showAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeView();
        mainView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.lefttoright));
    }
    public void initializeView(){
        mainView=findViewById(R.id.my_layout);
        QuestionsFillers.initialize();
        completeExam=findViewById(R.id.center);
        smallExam=findViewById(R.id.small_exam);
        TrueOrFalseQiz=findViewById(R.id.t_fQuiz);
        SCQuiz=findViewById(R.id.sc_quiz);
        MCQuiz=findViewById(R.id.mc_quiz);
        showAll=findViewById(R.id.all_questions);
        completeExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        =new Bundle();
                bundle.putInt("userOrder",1);
                Intent intent=new Intent(MainActivity2.this,Exam.class);
                intent.putExtras(bundle);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
        smallExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        =new Bundle();
                bundle.putInt("userOrder",2);
                Intent intent=new Intent(MainActivity2.this,Exam.class);
                intent.putExtras(bundle);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
        TrueOrFalseQiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        =new Bundle();
                bundle.putInt("userOrder",3);
                Intent intent=new Intent(MainActivity2.this,Exam.class);
                intent.putExtras(bundle);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
        SCQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        =new Bundle();
                bundle.putInt("userOrder",4);
                Intent intent=new Intent(MainActivity2.this,Exam.class);
                intent.putExtras(bundle);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
        MCQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        =new Bundle();
                bundle.putInt("userOrder",5);
                Intent intent=new Intent(MainActivity2.this,Exam.class);
                intent.putExtras(bundle);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,AllQuestgionsActivity.class);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
    }
}