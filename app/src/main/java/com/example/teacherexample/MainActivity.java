package com.example.teacherexample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MainActivity extends AppCompatActivity {
    String tag="EVH_Demo: ";
    long start;
    long elapsedTimeMillis;
    String elapsedPreviousEvent = "";
    public String displayElapsedTime(String previousEvent, Long timeConsumed) {
        String textToBeDisplayed = String.format("The elapsed time of previous %s event was %s milliseconds" , previousEvent, timeConsumed);
        return textToBeDisplayed;
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        start = System.currentTimeMillis();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elapsedPreviousEvent = "OnCreate";


    }
    protected void onStart() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onStart();

        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "OnStart now");
        ///

        ///
        elapsedPreviousEvent = "OnStart";
    }
    protected void onRestart() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onRestart();
        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "onRestart now");
        ///


        ///
        elapsedPreviousEvent = "OnRestart";


    }
    protected void onResume() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onResume();
        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "onResume now");
        ///

        ///
        elapsedPreviousEvent = "OnResume";
    }
    protected void onPause() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onPause();
        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "onPause now");
        ///

        ///
        elapsedPreviousEvent = "OnPause";

    }
    protected void onStop() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onStop();
        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "OnStop now");
        ///

        //
        elapsedPreviousEvent = "OnStop";


    }
    protected void onDestroy() {
        elapsedTimeMillis = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        super.onDestroy();
        Log.d(tag, tag + displayElapsedTime(elapsedPreviousEvent,elapsedTimeMillis));
        Log.d(tag, tag + "onDestroy now");
        ///

        ///
        elapsedPreviousEvent = "OnDestroy";
    }


}