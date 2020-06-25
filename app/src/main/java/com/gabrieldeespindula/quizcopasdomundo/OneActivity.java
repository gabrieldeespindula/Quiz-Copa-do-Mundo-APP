package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        this.mViewHolder.trueButton = findViewById(R.id.true_button);
        this.mViewHolder.falseButton = findViewById(R.id.false_button);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent questiontwo = new Intent(this, TwoActivity.class);
        if (v.getId() == R.id.true_button) {
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
            questiontwo.putExtra("one", "1");
        } else {
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
            questiontwo.putExtra("one", "0");
        }
        startActivity(questiontwo);
    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}
