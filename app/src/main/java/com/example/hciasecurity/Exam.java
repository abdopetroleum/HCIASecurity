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
import com.example.hciasecurity.Logic.Adapters.StringQuestionsAdapter;
import com.example.hciasecurity.Logic.Adapters.TrueAndFalseAdapter;
import com.example.hciasecurity.Logic.MyQuestions;
import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.Logic.Questions.StringQuestion;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;
import com.example.hciasecurity.Logic.QuestionsFillers;

import java.util.List;

public class Exam extends AppCompatActivity {
    // Questions arrays
    List<SingleChoice> singleChoices;
    List<TrueAndFalse> trueAndFalses;
    List<MultipleChoice> multipleChoices;
    List<StringQuestion> stringQuestions;
    MyQuestions questions=new MyQuestions();
    int userOrder=1;
    //gui vars
    LinearLayout trueAndFalses_layout;
    LinearLayout singleChoices_layout;
    LinearLayout multipleChoices_layout;
    LinearLayout stringQuestions_layout;
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
        stringQuestions_layout=findViewById(R.id.string_list);
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
                bundle.putString("StringScore",(stringQuestions!=null)? questions.getAnsweredStringQuestions():"");
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

           questions=questionsFillers.getExamQuestions();
           trueAndFalses=questions.getTrueAndFalses();
           singleChoices=questions.getSingleChoices();
           multipleChoices=questions.getMultipleChoices();
           stringQuestions=questions.getStringQuestions();

           TrueAndFalseAdapter trueAndFalseAdapter=new TrueAndFalseAdapter(this,trueAndFalses);
           trueAndFalseAdapter.fillLayout(trueAndFalses_layout);

           SingleChoiceAdapter singleChoiceAdapter=new SingleChoiceAdapter(this,singleChoices);
           singleChoiceAdapter.fillLayout(singleChoices_layout);


           MultipleChoiceAdapter multipleChoiceAdapter=new MultipleChoiceAdapter(this,multipleChoices);
           multipleChoiceAdapter.fillLayout(multipleChoices_layout);
           StringQuestionsAdapter stringQuestionsAdapter=new StringQuestionsAdapter(this,stringQuestions);
           stringQuestionsAdapter.fillLayout(stringQuestions_layout);


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
                TextView stringQuestions=findViewById(R.id.string_score);
                stringQuestions.setText(questions.getPointsStringQuestions());
                score.setText(questions.getTotalScore());
                Toast.makeText(Exam.this, "Your score is "+questions.getTotalScore(), Toast.LENGTH_SHORT).show();
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