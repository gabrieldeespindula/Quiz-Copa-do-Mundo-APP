package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        this.mViewHolder.trueButton = findViewById(R.id.true_button);
        this.mViewHolder.falseButton = findViewById(R.id.false_button);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent questiontwo = new Intent(this, TwoActivity.class);
        if (v.getId() == R.id.true_button) {
            questiontwo.putExtra("correct", 1);
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questiontwo);

    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}

