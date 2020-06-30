package com.example.burgerjoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class Checkout extends AppCompatActivity {

    TextView TvBurgerFinal, TvBurgerPrice, TvDrinks, TvDrinksPrice, TvTotalPrice;
    Button btnOrder;
    DecimalFormat formatter = new DecimalFormat("#0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        TvBurgerFinal = findViewById(R.id.TvBurgerFinal);
        TvBurgerPrice = findViewById(R.id.TvBurgerPrice);
        TvDrinks = findViewById(R.id.TvDrinks);
        TvDrinksPrice = findViewById(R.id.TvDrinksPrice);
        TvTotalPrice = findViewById(R.id.TvTotalPrice);
        btnOrder = findViewById(R.id.btnOrder);

        double cheese = getIntent().getDoubleExtra("cheese", 0.00);
        double chicken = getIntent().getDoubleExtra("chicken", 0.00);
        double egg = getIntent().getDoubleExtra("egg", 0.00);
        double cola = getIntent().getDoubleExtra("cola", 0.00);
        double soda = getIntent().getDoubleExtra("soda", 0.00);
        double malibu = getIntent().getDoubleExtra("malibu", 0.00);
        double water = getIntent().getDoubleExtra("water", 0.00);

        if (cheese != 0.00) {
            TvBurgerFinal.setText("Classic Cheese Burger");
            TvBurgerPrice.setText("$" + formatter.format(cheese));
        }
        if (chicken != 0.00) {
            TvBurgerFinal.setText("Standard Chicken Burger");
            TvBurgerPrice.setText("$" + formatter.format(chicken));
        }
        if (egg != 0.00) {
            TvBurgerFinal.setText("Genuine Egg Burger");
            TvBurgerPrice.setText("$" + formatter.format(egg));
        }
        if (cola != 0.00)
        {
            TvDrinks.setText("Cola in Can");
            TvDrinksPrice.setText("$" + formatter.format(cola));
        }
        if (soda != 0.00)
        {
            TvDrinks.setText("Soda");
            TvDrinksPrice.setText("$" + formatter.format(soda));
        }
        if (malibu != 0.00)
        {
            TvDrinks.setText("Malibu Shake");
            TvDrinksPrice.setText("$" + formatter.format(malibu));
        }
        if (water != 0.00)
        {
            TvDrinks.setText("Mineral Water");
            TvDrinksPrice.setText("$" + formatter.format(water));
        }

        double total = cheese + chicken + egg + cola + soda + malibu + water;
        TvTotalPrice.setText("$" + formatter.format(total));

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Checkout.this,com.example.burgerjoint.FinalScreen.class);
                startActivity(intent);
            }
        });
    }
}
