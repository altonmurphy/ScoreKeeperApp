package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;
    int teamBScore;
    int teamAfoul;
    int teamBfoul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void twoPointTeamA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void freeThrowTeamA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void resetTeamA(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void twoPointTeamB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowTeamB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }


    public void resetTeamB(View view) {
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }
    public void resetTeamAll(View view) {
        teamAScore = 0;
        teamBScore = 0;
        teamAfoul=0;
        teamBfoul=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        displayFoulTeamA(teamAfoul);
        displayFoulTeamB(teamBfoul);
    }
    /**
     * Displays current number of fouls for Team A.
     */
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void foulTeamA(View view) {
        teamAfoul = teamAfoul + 1;
        displayFoulTeamA(teamAfoul);
    }

    /**
     * Displays current number of fouls for Team B.
     */
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void foulTeamB(View view) {
        teamBfoul = teamBfoul + 1;
        displayFoulTeamB(teamBfoul);
    }
}
