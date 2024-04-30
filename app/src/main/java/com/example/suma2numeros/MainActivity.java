package com.example.suma2numeros;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evento(View view) {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView resultTextView = findViewById(R.id.resultTextView);

        int num1 = Integer.parseInt(number1.getText().toString());
        int num2 = Integer.parseInt(number2.getText().toString());
        int sum = num1 + num2;
        resultTextView.setText("Resultado: " + sum);
    }
}
