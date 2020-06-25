package com.gabrieldeespindula.quizcopasdomundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);


        this.mViewHolder.trueButton = findViewById(R.id.true_button);
        this.mViewHolder.falseButton = findViewById(R.id.false_button);
        this.mViewHolder.question = findViewById(R.id.question);

        this.mViewHolder.question.setText(R.string.second_question);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    public Double Correct(){
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String value = extras.getString("one");
        assert value != null;
        return Double.valueOf(value);
    }

    @Override
    public void onClick(View v) {
        Intent questionthree = new Intent(this, ThreeActivity.class);
        if (v.getId() == R.id.true_button) {
            String string_value = String.valueOf(Correct());
            questionthree.putExtra("two", string_value);
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
        } else {
            Double value_double = Correct() + 1;
            String string_value = String.valueOf(value_double);
            questionthree.putExtra("two", string_value);
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questionthree);

    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
        TextView question;
    }
}

