package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA, scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointer(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointer(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrow(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void threePointerB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointerB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
