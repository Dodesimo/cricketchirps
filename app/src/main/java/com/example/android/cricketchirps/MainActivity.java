package com.example.android.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button calcTemp;
    TextView results;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.etInput);
        calcTemp = findViewById(R.id.btCalcTemp);
        results = findViewById(R.id.tvResult);

        results.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.0");

        calcTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = input.getText().toString().trim();

                int numberForCalc =  Integer.parseInt(number);

                double chirps = numberForCalc/3.0 + 4;

                String text = "Based on the chirps, the temperature outside is: " + formatter.format(chirps) + " degrees Celsius";
                results.setText(text);

                results.setVisibility(View.VISIBLE);
            }
        });


    }

}
