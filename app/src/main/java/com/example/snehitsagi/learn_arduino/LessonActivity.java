package com.example.snehitsagi.learn_arduino;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

/**
 * Created by anuragmaravi on 29/12/16.
 */

public class LessonActivity extends AppCompatActivity {
    TextView textViewLesson1;
    TextView textViewLesson2;
    TextView textViewLesson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        textViewLesson1 = (TextView) findViewById(R.id.textViewLesson1);
        textViewLesson1.setText(getIntent().getStringExtra("Lesson"));

        textViewLesson2 = (TextView) findViewById(R.id.textViewLesson2);
        textViewLesson2.setText(getIntent().getStringExtra("LessonNo"));

        textViewLesson3 = (TextView) findViewById(R.id.textViewLesson3);
        Typeface Alice = Typeface.createFromAsset(getAssets(),"fonts/Alice-Regular.ttf");
        textViewLesson3.setTypeface(Alice);
        textViewLesson3.setText(getIntent().getStringExtra("LessonContent"));


        //
    }
}
