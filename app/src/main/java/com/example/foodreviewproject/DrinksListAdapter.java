package com.example.foodreviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DrinksListAdapter extends ArrayAdapter<Drinks> {

    public DrinksListAdapter(Context context, ArrayList<Drinks> drinksArrayList){

        super(context, R.layout.drinks_list_item, drinksArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Drinks drinks = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.drinks_list_item, parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.drinks_img);
        TextView name = convertView.findViewById(R.id.drinks_name);
        TextView price = convertView.findViewById(R.id.drinks_price);

        imageView.setImageResource(drinks.imageId);
        name.setText(drinks.drinks_name);
        price.setText(drinks.drinks_price);

        return convertView;
    }
}
