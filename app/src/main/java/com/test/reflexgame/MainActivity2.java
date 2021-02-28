package com.test.reflexgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView txtTimer, txtScore, txtIndex, txt0, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;

    private CountDownTimer countDownTimer;

    private long timeLeftInMilliseconds = 30000;

    private boolean timerRunning;

    private Integer score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();

        //define textviews
        txtTimer = findViewById(R.id.txtTimer);
        txtScore = findViewById(R.id.txtScore);
        txtIndex = findViewById(R.id.txtIndex);

        //define textviews
        txt0 = findViewById(R.id.txt0);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);

        paintButton();

        txt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt0.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt0.setBackgroundColor(Color.RED);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }
            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt1.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt1.setBackgroundColor(Color.CYAN);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt2.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt2.setBackgroundColor(Color.MAGENTA);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt3.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt3.setBackgroundColor(R.string.textview3);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }

            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt4.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt4.setBackgroundColor(Color.BLUE);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }

            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt5.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt5.setBackgroundColor(Color.LTGRAY);
                    paintButton();
                }else{

                    openDialog();
                    stopTimer();
                }

            }
        });

        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt6.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt6.setBackgroundColor(Color.YELLOW);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }
            }
        });

        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt7.getBackground()).getColor();

                if (color== Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt7.setBackgroundColor(Color.GREEN);
                    paintButton();
                }else{
                    openDialog();
                    stopTimer();
                }
            }
        });

        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)txt8.getBackground()).getColor();

                if (color == Color.BLACK){
                    if (timerRunning){

                    }else{
                        startStop();
                        updateTimer();
                    }
                    score++;
                    txtScore.setText("Score : "+ score);

                    txt8.setBackgroundColor(Color.DKGRAY);
                    paintButton();
                }else{

                    openDialog();
                    stopTimer();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();

        stopTimer();
    }

    private void startTimer()
    {
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds,1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliseconds = l;
                updateTimer();
            }

            @Override
            public void onFinish() {
                stopTimer();
                openDialog();
            }
        }.start();
    }

    private void openDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Information")
                .setMessage("Game is Finished!")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(MainActivity2.this,MainActivity.class);
                        startActivity(i);
                    }
                });
        builder.create();
        builder.show();
    }

    private void updateTimer() {
        int minutes = (int) (timeLeftInMilliseconds / 600000);

        int seconds = (int) (timeLeftInMilliseconds % 600000) / 1000;

        String timeLeftText;

        timeLeftText = "" + minutes;
        timeLeftText += ":";

        if (seconds < 10) timeLeftText += "0";

        timeLeftText += seconds;

        txtTimer.setText(timeLeftText);
    }

    private void startStop() {
        if (timerRunning){
            stopTimer();
        }else{
            startTimer();
        }
    }

    private void stopTimer() {
        countDownTimer.cancel();
        timerRunning = false;
    }

    private void paintButton() {

        Random r = new Random();

        int randomNumber = r.nextInt(9); // random number 0 between 9.

        txtIndex.setText("index : " + randomNumber); // write random number to textview. For test.

        switch (randomNumber){
            case 0:
                txt0.setBackgroundColor(Color.BLACK);
                break;
            case 1:
                txt1.setBackgroundColor(Color.BLACK);
                break;
            case 2:
                txt2.setBackgroundColor(Color.BLACK);
                break;
            case 3:
                txt3.setBackgroundColor(Color.BLACK);
                break;
            case 4:
                txt4.setBackgroundColor(Color.BLACK);
                break;
            case 5:
                txt5.setBackgroundColor(Color.BLACK);
                break;
            case 6:
                txt6.setBackgroundColor(Color.BLACK);
                break;
            case 7:
                txt7.setBackgroundColor(Color.BLACK);
                break;
            case 8:
                txt8.setBackgroundColor(Color.BLACK);
                break;

        }
    }
}