package com.example.burgerjoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChooseBurger extends AppCompatActivity {

    Button btn2, btn3, btn4, btn5, btn6, btn7;

    double cheese = 5.99;
    double chicken = 6.50;
    double egg = 4.99;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_burger);

        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseBurger.this,com.example.burgerjoint.ChooseDrinks.class);
                intent.putExtra("cheese",cheese);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseBurger.this,com.example.burgerjoint.ChooseDrinks.class);
                intent.putExtra("chicken",chicken);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ChooseBurger.this,"Sorry! Not available right now.",Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ChooseBurger.this,"Sorry! Not available right now",Toast.LENGTH_SHORT).show();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChooseBurger.this,com.example.burgerjoint.ChooseDrinks.class);
                intent.putExtra("egg",egg);
                startActivity(intent);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ChooseBurger.this,"Sorry! Not available right now",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
