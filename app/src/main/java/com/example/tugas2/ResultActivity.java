package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewResult, textViewName, textViewNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResult = findViewById(R.id.textViewResult);
        textViewName = findViewById(R.id.textViewName);
        textViewNim = findViewById(R.id.textViewNim);

        double result = getIntent().getDoubleExtra("result", 0);
        String nim = getIntent().getStringExtra("nim");
        String nama = getIntent().getStringExtra("nama");

        textViewResult.setText("Hasil: " + result);
        textViewName.setText("Nama: " + nama);
        textViewNim.setText("NIM: " + nim);
    }
}