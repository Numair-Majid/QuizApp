package com.example.quizapp;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.quizapp.MainActivity;
import com.example.quizapp.Question;
import com.example.quizapp.R;

public class quizquestions extends AppCompatActivity  {
    Button answer1, answer2, answer3, answer4;
    TextView score, question;
    private Question mQuestions = new Question();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    int i=0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizquestions);


        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score : " + mScore);
        checkend();
        updateQuestion(i++);

        answer1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);

                }
                checkend();
                updateQuestion(i++);
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);
                }
                checkend();
                updateQuestion(i++);
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);

                }
                checkend();
                updateQuestion(i++);
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score : " + mScore);

                }
                checkend();
                updateQuestion(i++);
            }
        });
    }
    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void checkend(){
        if(i >= mQuestionsLength-1) {
            new AlertDialog.Builder(this)
                    .setTitle("Final Score")
                    .setMessage("Correct Answers: "+ mScore)
                    .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            i=0;
                            mScore=0;
                            Intent i = new Intent(quizquestions.this, MainActivity.class);
                            startActivity(i);
                        }
                    })


                    .setNegativeButton("Quit",new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }
    }
}

