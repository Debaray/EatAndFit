package com.example.debar.eatandfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DietChart extends AppCompatActivity {
    TextView food;
    String f = "rice 100 gm-129 cal\n" +
            "brown rice 100g-111 cal\n" +
            "bread 100g-266 cal\n" +
            "brown bread 100g 256 cal\n" +
            "noodles-138 cal\n" +
            "pasta-131 cal\n" +
            "cheese-402 cal\n" +
            "one egg(boiled)- 78 cal\n"+
            "one egg(fried)  90 cal\n" +
            " fish 100g-206  cal\n" +
            "chicken -(100g) 239   cal\n" +
            "duck -337(100g) cal\n" +
            "beef-250(100g) cal\n" +
            "lamb- 294(100g) cal\n" +
            "oil -120(1tbsp) cal\n" +
            "vagetable-65(100g) cal\n" +
            "banana-89(100g) cal\n" +
            "apple-52 cal\n" +
            "avocados-160 cal\n" +
            "coconut-354 cal\n" +
            "grapes-67 cal\n" +
            "papayas-43 cal\n" +
            "watermelon-30 cal\n" +
            "steawberries-33 cal\n" +
            "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_chart);
        food = (TextView) findViewById(R.id.food_Text);

        food.setText(f);
    }
}
