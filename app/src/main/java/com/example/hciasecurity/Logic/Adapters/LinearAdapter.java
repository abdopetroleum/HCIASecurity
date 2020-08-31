package com.example.hciasecurity.Logic.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.QuestionsFillers;
import com.example.hciasecurity.R;

import java.util.ArrayList;
import java.util.List;

public abstract class LinearAdapter<Question> {
    private Context context;
    private List<Question> questions;
    public boolean isForAll=false;
    public LinearAdapter(Context context, List<Question> questions) {
        this.context=context;
        this.questions=questions;
    }
    public void fillLayout(LinearLayout linearLayout){
        for (int i=0; i<questions.size();i++){
            Question question=questions.get(i);
            View view=getView(i,linearLayout,question);
            if(isForAll){
                if(i==0){
                    TextView textView=view.findViewById(R.id.chapter_name);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(QuestionsFillers.chapterNames[21]);
                }else if(((com.example.hciasecurity.Logic.Questions.Question)question).mgetChapterNumber()
                !=((com.example.hciasecurity.Logic.Questions.Question)questions.get(i-1)).mgetChapterNumber()){
                    TextView textView=view.findViewById(R.id.chapter_name);
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(QuestionsFillers.chapterNames[((com.example.hciasecurity.Logic.Questions.Question)question).mgetChapterNumber()]);
                }
            }
            linearLayout.addView(view);
        }
        isForAll=false;
    }
    public abstract View getView(int position, ViewGroup parent,Question question);

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


}
