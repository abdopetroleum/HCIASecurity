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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeView();
        mainView.startAnimation(AnimationUtils.loadAnimation(this,R.anim.lefttoright));
    }
    public void initializeView() {
        mainView = findViewById(R.id.my_layout);
        QuestionsFillers.initialize();
        completeExam = findViewById(R.id.center);

        completeExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Bundle bundle
                        = new Bundle();
                bundle.putInt("userOrder", 1);
                Intent intent = new Intent(MainActivity2.this, Exam.class);
                intent.putExtras(bundle);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity2.this).toBundle());
            }
        });
    }
}