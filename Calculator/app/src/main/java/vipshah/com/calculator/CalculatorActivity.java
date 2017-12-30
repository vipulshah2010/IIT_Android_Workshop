package vipshah.com.calculator;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {

    private EditText number1Text;
    private EditText number2Text;
    private Button addButton;
    private Button resetButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // Create the reference to layout widgets

        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        addButton = findViewById(R.id.addButton);
        resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1Text.setText("");
                number2Text.setText("");
                number1Text.requestFocus();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = number1Text.getText().toString();
                String num2 = number2Text.getText().toString();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int answer = n1 + n2;

                displayAlertMessage(answer);
            }
        });
    }

    private void displayAlertMessage(int answer) {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);

        builder.setTitle("Answer");
        builder.setMessage("Answer is " + answer);
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", null);
        builder.setNegativeButton("No", null);
        builder.setNeutralButton("Cancel", null);
        builder.show();
    }

}
