package com.example.administrator.annotationapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.Router;

@Router("main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
