package com.example.burgerjoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseDrinks extends AppCompatActivity {

    TextView TvBurger;
    Button btnCola, btnSoda, btnMalibu, btnWater;
    String burger;
    double cola = 0.99, soda = 0.99, malibu = 2.50, water = 0.49;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_drinks);

        TvBurger = findViewById(R.id.TvBurger);
        btnCola = findViewById(R.id.btnCola);
        btnSoda = findViewById(R.id.btnSoda);
        btnMalibu = findViewById(R.id.btnMalibu);
        btnWater = findViewById(R.id.btnWater);

        final double cheese = getIntent().getDoubleExtra("cheese",0.00);
        final double chicken = getIntent().getDoubleExtra("chicken",0.00);
        final double egg = getIntent().getDoubleExtra("egg",0.00);

        if (cheese != 0.00)
        {
            TvBurger.setText("Burger : Classic Cheese Burger");

            btnCola.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("cheese",cheese);
                    intent.putExtra("cola",cola);
                    startActivity(intent);

                }
            });

            btnSoda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("cheese",cheese);
                    intent.putExtra("soda",soda);
                    startActivity(intent);

                }
            });

            btnMalibu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("cheese",cheese);
                    intent.putExtra("malibu",malibu);
                    startActivity(intent);

                }
            });

            btnWater.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("cheese",cheese);
                    intent.putExtra("water",water);
                    startActivity(intent);

                }
            });
        }
        if (chicken != 0.00)
        {
            TvBurger.setText("Burger : Standard Chicken Burger");

            btnCola.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("chicken",chicken);
                    intent.putExtra("cola",cola);
                    startActivity(intent);

                }
            });

            btnSoda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("chicken",chicken);
                    intent.putExtra("soda",soda);
                    startActivity(intent);

                }
            });

            btnMalibu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("chicken",chicken);
                    intent.putExtra("malibu",malibu);
                    startActivity(intent);

                }
            });

            btnWater.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("chicken",chicken);
                    intent.putExtra("water",water);
                    startActivity(intent);

                }
            });
        }
        if (egg != 0.00)
        {
            TvBurger.setText("Burger : Genuine Egg Burger");

            btnCola.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("egg",egg);
                    intent.putExtra("cola",cola);
                    startActivity(intent);

                }
            });

            btnSoda.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("egg",egg);
                    intent.putExtra("soda",soda);
                    startActivity(intent);

                }
            });

            btnMalibu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("egg",egg);
                    intent.putExtra("malibu",malibu);
                    startActivity(intent);

                }
            });

            btnWater.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(ChooseDrinks.this,com.example.burgerjoint.Checkout.class);
                    intent.putExtra("egg",egg);
                    intent.putExtra("water",water);
                    startActivity(intent);

                }
            });
        }
    }
}
