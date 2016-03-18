package com.example.student.black.lab_03courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int mScoreA = 0;
    int mScoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private void displayA() {
    //    TextView score = (TextView) findViewById(R.id.scoreA);
    //    score.setText(String.valueOf(mScoreA));
    }


    public void twopointsA(View view) {
        mScoreA += 2;
        displayA();

    }


    public void threepointsA(View view) {
        mScoreA += 3;
        displayA();
    }

    public void freeshotA(View view) {
        mScoreA += 1;
        displayA();
    }

    public void reset(View view) {
        mScoreA = 0;
        mScoreB = 0;
        displayA();
        displayB();
    }

    private void displayB() {
     //   TextView score = (TextView) findViewById(R.id.scoreB);
     //   score.setText(String.valueOf(mScoreB));
    }


    public void twopointsB(View view) {
        mScoreB += 2;
        displayB();

    }


    public void threepointsB(View view) {
        mScoreB += 3;
        displayB();
    }

    public void freeshotB(View view) {
        mScoreB += 1;
        displayB();
    }


}
