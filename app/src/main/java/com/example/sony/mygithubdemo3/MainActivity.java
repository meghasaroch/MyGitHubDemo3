package com.example.sony.mygithubdemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;

import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show();

        Log.d("MYMessage","On Create Called");
    }
}
