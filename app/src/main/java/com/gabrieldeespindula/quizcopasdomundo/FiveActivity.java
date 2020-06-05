package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FiveActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);


        this.mViewHolder.trueButton = findViewById(R.id.true_five);
        this.mViewHolder.falseButton = findViewById(R.id.false_five);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent questionfinal = new Intent(this, FinalActivity.class);
        if (v.getId() == R.id.true_three) {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            CorrectConstants.five = 1;
        } else {
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questionfinal);
    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}

