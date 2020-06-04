package com.gabrieldeespindula.quizcopasdomundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class OneActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        this.mViewHolder.trueButton = findViewById(R.id.true_button);
        this.mViewHolder.trueButton = findViewById(R.id.false_button);

    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}
