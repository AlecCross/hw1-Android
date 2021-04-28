package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLog;
    final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLog = findViewById(R.id.button);

        buttonLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(MainActivity.this, "buttonLog нажат", Toast.LENGTH_SHORT).show();
                Log.d("MyApp","onClick works");
                Log.d(TAG, "onClick" +" "+  System.currentTimeMillis());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart" +" "+ System.currentTimeMillis());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume" +" "+  System.currentTimeMillis());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause" +" "+ System.currentTimeMillis());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop" +" "+ System.currentTimeMillis());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy" +" "+ System.currentTimeMillis());
    }
}