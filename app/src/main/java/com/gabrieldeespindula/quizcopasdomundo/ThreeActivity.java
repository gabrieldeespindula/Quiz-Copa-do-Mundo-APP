package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        this.mViewHolder.trueButton = findViewById(R.id.true_three);
        this.mViewHolder.falseButton = findViewById(R.id.false_three);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent questionfour = new Intent(this, FourActivity.class);
        if (v.getId() == R.id.true_three) {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questionfour);

    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}

