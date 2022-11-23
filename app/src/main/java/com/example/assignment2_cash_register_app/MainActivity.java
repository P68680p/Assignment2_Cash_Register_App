package com.example.assignment2_cash_register_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String quant = "";
    String prod = "";

    TextView prodTypeText;
    TextView quantText;
    TextView resultText;
    Button n0;
    Button n1;
    Button n2;
    Button n3;
    Button n4;
    Button n5;
    Button n6;
    Button n7;
    Button n8;
    Button n9;
    Button clearBut;
    Button buyBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Cash Register App", "Activity Created");

        prodTypeText = findViewById(R.id.showProductType);
        quantText = findViewById(R.id.showQuantity);
        resultText = findViewById(R.id.showTotalHint);
        n0 = findViewById(R.id.num0);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        n3 = findViewById(R.id.num3);
        n4 = findViewById(R.id.num4);
        n5 = findViewById(R.id.num5);
        n6 = findViewById(R.id.num6);
        n7 = findViewById(R.id.num7);
        n8 = findViewById(R.id.num8);
        n9 = findViewById(R.id.num9);
        clearBut = findViewById(R.id.clearBut);
        buyBut = findViewById(R.id.buyButton);

        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        clearBut.setOnClickListener(this);
        buyBut.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clearBut:
                quant = "";
                prod = "";
                prodTypeText.setText(prod);
                quantText.setText(quant);
                break;
            case R.id.buyButton:

                break;
            default:
                quant += ((Button) view).getText().toString();
                quantText.setText(quant);
        }
    }
}