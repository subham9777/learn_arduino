package com.example.snehitsagi.learn_arduino;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by anuragmaravi on 29/12/16.
 */

public class LessonActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("Lesson"));
        //
    }
}
