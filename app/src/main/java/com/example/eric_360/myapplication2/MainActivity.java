package com.example.eric_360.myapplication2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View createdView = super.onCreateView(name, context, attrs);
        return createdView;
    }
}
