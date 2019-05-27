package com.omelchenkoaleks.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza1,
                Utils.PIZZA_1_TITLE,
                Utils.PIZZA_1_DESCRIPTION,
                Utils.PIZZA_1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza2,
                Utils.PIZZA_2_TITLE,
                Utils.PIZZA_2_DESCRIPTION,
                Utils.PIZZA_2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza3,
                Utils.PIZZA_3_TITLE,
                Utils.PIZZA_3_DESCRIPTION,
                Utils.PIZZA_3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza4,
                Utils.PIZZA_4_TITLE,
                Utils.PIZZA_4_DESCRIPTION,
                Utils.PIZZA_4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza5,
                Utils.PIZZA_5_TITLE,
                Utils.PIZZA_5_DESCRIPTION,
                Utils.PIZZA_5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza6,
                Utils.PIZZA_6_TITLE,
                Utils.PIZZA_6_DESCRIPTION,
                Utils.PIZZA_6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza7,
                Utils.PIZZA_7_TITLE,
                Utils.PIZZA_7_DESCRIPTION,
                Utils.PIZZA_7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza8,
                Utils.PIZZA_8_TITLE,
                Utils.PIZZA_8_DESCRIPTION,
                Utils.PIZZA_8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza9,
                Utils.PIZZA_9_TITLE,
                Utils.PIZZA_9_DESCRIPTION,
                Utils.PIZZA_9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza10,
                Utils.PIZZA_10_TITLE,
                Utils.PIZZA_10_DESCRIPTION,
                Utils.PIZZA_10_RECIPE));

        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }
}
