package com.example.hciasecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hciasecurity.Logic.Adapters.MultipleChoiceAdapter;
import com.example.hciasecurity.Logic.Adapters.SingleChoiceAdapter;
import com.example.hciasecurity.Logic.Adapters.TrueAndFalseAdapter;
import com.example.hciasecurity.Logic.MyQuestions;
import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.Logic.QuestionsFillers;

import java.util.List;

public class Exam extends AppCompatActivity {
    // Questions arrays
    List<SingleChoice> singleChoices;
    List<TrueAndFalse> trueAndFalses;
    List<MultipleChoice> multipleChoices;
    MyQuestions questions=new MyQuestions();
    int userOrder=1;
    //gui vars
    LinearLayout trueAndFalses_layout;
    LinearLayout singleChoices_layout;
    LinearLayout multipleChoices_layout;
    View exam_layout;
    Button submitButton;
    Button showAnswers;
    View scoreLayout;
    Animation fadeIn;
    Animation fadeOut;
    TextView trueAndFalseTitle;
    TextView singleChoiceTitle;
    TextView multipleChoiceTitle;
    QuestionsFillers questionsFillers=new QuestionsFillers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        userOrder=getIntent().getExtras().getInt("userOrder",1);
        initializeView();
        initializeVariables();

    }
    public void initializeView(){
        trueAndFalses_layout=findViewById(R.id.true_false_list);
        singleChoices_layout=findViewById(R.id.mcq_list);
        multipleChoices_layout=findViewById(R.id.mc_list);
        submitButton=findViewById(R.id.button);
        exam_layout=findViewById(R.id.exam_layout);
        scoreLayout=findViewById(R.id.score_layout);
        showAnswers=findViewById(R.id.show_answers);
        trueAndFalseTitle=findViewById(R.id.textView);
        singleChoiceTitle=findViewById(R.id.textView2);
        multipleChoiceTitle=findViewById(R.id.textView3);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConfirmDialog confirmDialog=new ConfirmDialog();
                Bundle bundle=new Bundle();
                bundle.putString("TrueAndFalse",(trueAndFalses!=null)? questions.getAnsweredTrueAndFalse():"");
                bundle.putString("SingleChoices",(singleChoices!=null)? questions.getAnsweredSingleChoice():"");
                bundle.putString("MultipleChoice",(multipleChoices!=null)? questions.getAnsweredMultipleChiuce():"");
                confirmDialog.setArguments(bundle);
                confirmDialog.show(getSupportFragmentManager(),null);
            }
        });
        showAnswers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(Question question:questions){
                    question.mgetQustionGui().drawCorrectAnserFull();
                }


                scoreLayout.animate()
                        .translationY(800)
                        .alpha(0.0f)
                        .setDuration(800)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                exam_layout.setVisibility(View.VISIBLE);
                                scoreLayout.startAnimation(fadeOut);
                                exam_layout.startAnimation(fadeIn);
                                exam_layout.animate()
                                        .translationY(0)
                                        .alpha(1)
                                        .setDuration(800)
                                        .setListener(new AnimatorListenerAdapter() {
                                            @Override
                                            public void onAnimationEnd(Animator animation) {
                                                super.onAnimationEnd(animation);
                                            }
                                        });

                            }
                        });
            }
        });
    }
    public void initializeVariables(){
        QuestionsFillers.initialize();
       if(userOrder==1){
           questions=questionsFillers.getExamQuestions();
           trueAndFalses=questions.getTrueAndFalses();
           singleChoices=questions.getSingleChoices();
           multipleChoices=questions.getMultipleChoices();
           TrueAndFalseAdapter trueAndFalseAdapter=new TrueAndFalseAdapter(this,trueAndFalses);
           trueAndFalseAdapter.fillLayout(trueAndFalses_layout);


           SingleChoiceAdapter singleChoiceAdapter=new SingleChoiceAdapter(this,singleChoices);
           singleChoiceAdapter.fillLayout(singleChoices_layout);


           MultipleChoiceAdapter multipleChoiceAdapter=new MultipleChoiceAdapter(this,multipleChoices);
           multipleChoiceAdapter.fillLayout(multipleChoices_layout);
       }else if(userOrder==2){
           questions=questionsFillers.getLittleExamQuestions();
           trueAndFalses=questions.getTrueAndFalses();
           singleChoices=questions.getSingleChoices();
           multipleChoices=questions.getMultipleChoices();
           TrueAndFalseAdapter trueAndFalseAdapter=new TrueAndFalseAdapter(this,trueAndFalses);
           trueAndFalseAdapter.fillLayout(trueAndFalses_layout);


           SingleChoiceAdapter singleChoiceAdapter=new SingleChoiceAdapter(this,singleChoices);
           singleChoiceAdapter.fillLayout(singleChoices_layout);


           MultipleChoiceAdapter multipleChoiceAdapter=new MultipleChoiceAdapter(this,multipleChoices);
           multipleChoiceAdapter.fillLayout(multipleChoices_layout);
       }else if(userOrder==3){
           questions=questionsFillers.getQuizTrueandFalseQuestions();
           trueAndFalses=questions.getTrueAndFalses();
           singleChoices_layout.setVisibility(View.GONE);
           multipleChoices_layout.setVisibility(View.GONE);
           TrueAndFalseAdapter trueAndFalseAdapter=new TrueAndFalseAdapter(this,trueAndFalses);
           trueAndFalseAdapter.fillLayout(trueAndFalses_layout);
           singleChoiceTitle.setVisibility(View.GONE);
           multipleChoiceTitle.setVisibility(View.GONE);
       }else if(userOrder==4){
           questions=questionsFillers.getQuizSingleChoiceQuestions();
           singleChoices=questions.getSingleChoices();
           trueAndFalses_layout.setVisibility(View.GONE);
           multipleChoices_layout.setVisibility(View.GONE);
           SingleChoiceAdapter singleChoiceAdapter=new SingleChoiceAdapter(this,singleChoices);
           singleChoiceAdapter.fillLayout(singleChoices_layout);
           trueAndFalseTitle.setVisibility(View.GONE);
           multipleChoiceTitle.setVisibility(View.GONE);
       }
       else if(userOrder==5){
           questions=questionsFillers.getQuizMultipleChoiceQuestions();
           multipleChoices=questions.getMultipleChoices();
           singleChoices_layout.setVisibility(View.GONE);
           trueAndFalses_layout.setVisibility(View.GONE);
           MultipleChoiceAdapter multipleChoiceAdapter=new MultipleChoiceAdapter(this,multipleChoices);
           multipleChoiceAdapter.fillLayout(multipleChoices_layout);
           trueAndFalseTitle.setVisibility(View.GONE);
           singleChoiceTitle.setVisibility(View.GONE);
       }


        fadeIn=AnimationUtils.loadAnimation(Exam.this,R.anim.fadein);
        fadeOut=AnimationUtils.loadAnimation(Exam.this,R.anim.fadeout);
    }

    public void onConfirm() {
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final TextView score=findViewById(R.id.score);
                score.startAnimation(AnimationUtils.loadAnimation(Exam.this,R.anim.pendeleum_animation));
                TextView trueAndFalse=findViewById(R.id.true_false_score);
                trueAndFalse.setText(questions.getPointsTrueAndFalse());
                TextView singleChoice=findViewById(R.id.singl_choice_score);
                singleChoice.setText(questions.getPointsSingleChoice());
                TextView multiChoice=findViewById(R.id.multiple_choice_score);
                multiChoice.setText(questions.getPointsMultipleChoice());
                score.setText(questions.getTotalScore());

                submitButton.setVisibility(View.GONE);
                exam_layout.animate()
                        .translationY(-800)
                        .alpha(0.0f)
                        .setDuration(800)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                exam_layout.startAnimation(fadeOut);
                                exam_layout.setVisibility(View.GONE);
                                scoreLayout.startAnimation(fadeIn);
                            }
                        });


            }
        },300);
    }
}