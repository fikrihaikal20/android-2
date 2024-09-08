package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber1, inputNumber2;
    private RadioGroup radioGroup;
    private Button buttonHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        radioGroup = findViewById(R.id.radioGroup);
        buttonHitung = findViewById(R.id.buttonHitung);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(inputNumber1.getText().toString());
                double num2 = Double.parseDouble(inputNumber2.getText().toString());
                double result = 0;
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.radioAdd) {
                    result = num1 + num2;
                } else if (selectedId == R.id.radioSubtract) {
                    result = num1 - num2;
                } else if (selectedId == R.id.radioMultiply) {
                    result = num1 * num2;
                } else if (selectedId == R.id.radioDivide) {
                    result = num1 / num2;
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("result", result);
                intent.putExtra("nim", "225150401111030");
                intent.putExtra("nama", "Muhammad Fikri Haikal Anhali");
                startActivity(intent);
            }
        });
    }
}