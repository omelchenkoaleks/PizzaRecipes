package com.omelchenkoaleks.pizzarecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {
    ArrayList<PizzaRecipeItem> mPizzaRecipeItems;

    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems) {
        mPizzaRecipeItems = pizzaRecipeItems;
    }

    public static class PizzaRecipeViewHolder extends RecyclerView.ViewHolder {
        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            pizzaImageView = itemView.findViewById(R.id.pizza_image_view);
            title = itemView.findViewById(R.id.title_text_view);
            description = itemView.findViewById(R.id.description_text_view);
        }
    }

    @NonNull
    @Override
    public PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.pizza_recipe_item, parent, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder holder, int position) {
        PizzaRecipeItem pizzaRecipeItem = mPizzaRecipeItems.get(position);
        holder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageResource());
        holder.title.setText(pizzaRecipeItem.getTitle());
        holder.description.setText(pizzaRecipeItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return mPizzaRecipeItems.size();
    }
}
