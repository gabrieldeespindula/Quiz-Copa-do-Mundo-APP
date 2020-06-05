package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);


        this.mViewHolder.trueButton = findViewById(R.id.true_four);
        this.mViewHolder.falseButton = findViewById(R.id.false_four);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent questionfive = new Intent(this, FiveActivity.class);
        if (v.getId() == R.id.true_three) {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            CorrectConstants.four = 1;
        } else {
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questionfive);
    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}

