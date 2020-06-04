package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.buttonStart = findViewById(R.id.button_start);
        this.mViewHolder.buttonCredits = findViewById(R.id.button_credits);

        this.mViewHolder.buttonStart.setOnClickListener(this);
        this.mViewHolder.buttonCredits.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_start){
            Intent question_one = new Intent(this, OneActivity.class);
            startActivity(question_one);
        } else if (v.getId() == R.id.button_credits){
            Toast.makeText(this, "Just Gabriel de Espindula", Toast.LENGTH_LONG).show();
        }
    }

    private static class ViewHolder {
        Button buttonStart;
        Button buttonCredits;
    }
}