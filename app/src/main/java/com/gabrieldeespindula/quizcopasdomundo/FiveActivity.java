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
        setContentView(R.layout.activity_questions);


        this.mViewHolder.trueButton = findViewById(R.id.true_button);
        this.mViewHolder.falseButton = findViewById(R.id.false_button);

        this.mViewHolder.trueButton.setOnClickListener(this);
        this.mViewHolder.falseButton.setOnClickListener(this);

    }

    public Double Correct(){
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String value = extras.getString("four");
        assert value != null;
        return Double.valueOf(value);
    }

    @Override
    public void onClick(View v) {
        Intent questionfinal = new Intent(this, FinalActivity.class);
        if (v.getId() == R.id.true_button) {
            Double value_double = Correct() + 1;
            String string_value = String.valueOf(value_double);
            questionfinal.putExtra("five", string_value);
            Toast.makeText(this,"Right!", Toast.LENGTH_SHORT).show();
        } else {
            String string_value = String.valueOf(Correct());
            questionfinal.putExtra("five", string_value);
            Toast.makeText(this,"Wrong!", Toast.LENGTH_SHORT).show();
        }
        startActivity(questionfinal);
    }

    private static class ViewHolder{
        Button trueButton;
        Button falseButton;
    }
}

