package com.example.carservice;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Created";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(info, message, duration);
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
    @Override
    protected void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Start activity";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Stop";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(info, message, duration);
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Destroy activity";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(info, message, duration);
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
    @Override
    protected void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Pause activity";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(info, message, duration);
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);
        Context info = getApplicationContext();
        CharSequence message = "Resume activity";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(info, message, duration);
        Toast toast = Toast.makeText(info, message, duration);
        toast.show();
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.i(TAG, "Info");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
}