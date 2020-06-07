package com.gabrieldeespindula.quizcopasdomundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        this.mViewHolder.textResult = findViewById(R.id.text_result);

        getCorrect();

    }

    public void getCorrect(){
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        String value = String.valueOf(extras.getString("five"));
        this.mViewHolder.textResult.setText(String.format("%s %s %s", "Result: ", value, "/5"));
    }

    private static class ViewHolder {
        TextView textResult;
    }
}
