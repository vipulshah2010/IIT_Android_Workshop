package vipshah.com.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("Result");

        TextView resultTextView =
                findViewById(R.id.resultTextView);


        Bundle bundle = getIntent().getExtras();
        int answer = bundle.getInt("key_answer");

        if (answer >= 100) {
            resultTextView.setText(R.string.success);
        } else {
            resultTextView.setText(R.string.failed);
        }
    }
}
