package com.example.user.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static int computerScore=0, userScore=0; //computer and my score
    TextView uScore,cscore,currentScore;
    ImageView image;
    int tempscore=0;
    Button hold,roll,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView) findViewById(R.id.image);
        uScore= (TextView) findViewById(R.id.yourscore);
        cscore=(TextView) findViewById(R.id.computerscore);
        currentScore=(TextView)findViewById(R.id.t_score);
        hold=(Button)findViewById(R.id.hold);
        roll=(Button)findViewById(R.id.roll);
        reset=(Button)findViewById(R.id.reset);


        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hold();
            }
        });
    }
    public void hold(){

        userScore=userScore+tempscore;
        uScore.setText(String.valueOf(userScore));
        tempscore=0;
        currentScore.setText(String.valueOf(tempscore));

        if(userScore>=100){

            userScore=userScore+tempscore;
            uScore.setText(String.valueOf(userScore));
            tempscore=0;
            reset();
            currentScore.setText("u win");
        }
    }

    public void reset(){
        userScore=0;
        tempscore=0;
        uScore.setText(String.valueOf(userScore));
        currentScore.setText(String.valueOf(tempscore));
    }
    public void roll(){
        Random random = new Random();
        int roll = random.nextInt(6)+1;
        if (roll == 1) {
            image.setImageResource(R.drawable.dice1);
            tempscore = 0;
            currentScore.setText(String.valueOf(tempscore));

        } else if (roll == 2) {
            image.setImageResource(R.drawable.dice2);
            tempscore = tempscore + 2;
            currentScore.setText(String.valueOf(tempscore));
        } else if (roll == 3) {
            image.setImageResource(R.drawable.dice3);
            tempscore = tempscore + 3;
            currentScore.setText(String.valueOf(tempscore));
        } else if (roll == 4) {
            image.setImageResource(R.drawable.dice4);
            tempscore = tempscore + 4;
            currentScore.setText(String.valueOf(tempscore));
        } else if (roll == 5) {
            image.setImageResource(R.drawable.dice5);
            tempscore = tempscore + 5;
            currentScore.setText(String.valueOf(tempscore));
        } else {
            image.setImageResource(R.drawable.dice6);
            tempscore = tempscore + 6;
            currentScore.setText(String.valueOf(tempscore));
        }
    }


}

