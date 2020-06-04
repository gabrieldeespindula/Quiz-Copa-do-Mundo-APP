package com.gabrieldeespindula.quizcopasdomundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonStart = findViewById(R.id.button_start);
        this.mViewHolder.buttonStart = findViewById(R.id.button_credits);

        this.mViewHolder.buttonStart.setOnClickListener();
        this.mViewHolder.buttonCredits.setOnClickListener();

    }

    @Override
    public void onClick(View v) {

    }

    private static class ViewHolder {
        Button buttonStart;
        Button buttonCredits;
    }
}
