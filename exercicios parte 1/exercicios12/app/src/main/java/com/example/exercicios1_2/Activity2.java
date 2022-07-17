package com.example.exercicios1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ed1 = (TextView) findViewById(R.id.textView);
        String dato = getIntent().getStringExtra("data");
        ed1.setText(dato);
    }
}