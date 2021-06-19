package com.example.neweramay2021;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    private Button btnPlus, btnMinus, btnMakeOrder;
    private CheckBox checkCream, checkCookie, checkChocolate;
    private TextView tvAmount, tvResult;

    private int amount = 1;
    private int basePrice = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        findViews();
        setListeners();
    }

    private void findViews(){
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMakeOrder = findViewById(R.id.btnMakeOrder);
        checkCream = findViewById(R.id.checkCream);
        checkCookie = findViewById(R.id.checkCookie);
        checkChocolate = findViewById(R.id.checkChocolate);
        tvAmount = findViewById(R.id.tvAmount);
        tvResult = findViewById(R.id.tvResult);

    }

    private void setListeners(){
        btnPlus.setOnClickListener(view -> {
            amount++;
            tvAmount.setText(Integer.toString(amount));
        });

        btnMinus.setOnClickListener(view -> {
            if (amount != 1){
                amount--;
                tvAmount.setText(Integer.toString(amount));
            }
        });

        btnMakeOrder.setOnClickListener(view -> {
            int price = basePrice;
            if (checkCream.isChecked()){
                price += 1;
            }

            if (checkCookie.isChecked()){
                price += 2;
            }

            if (checkChocolate.isChecked()){
                price += 3;
            }

            price = price * amount;

            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(OrderActivity.this);
            dialogBuilder.setMessage("Your order is complete! The total price is $" + Integer.toString(price));
            dialogBuilder.setNeutralButton("ok",null);
            dialogBuilder.create().show();
        });
    }
}