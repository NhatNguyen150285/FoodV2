package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.foodreviewproject.databinding.ActivityDrinksListBinding;


import java.util.ArrayList;

public class DrinksListActivity extends AppCompatActivity {

    ActivityDrinksListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinksListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.coca, R.drawable.trasua, R.drawable.coffee};

        String[] name = {"Coca Cola", " Tra Sua", "Coffee"};

        String[] price = {"10.000d", "20.000d", "15.000d"};

        String[] stocks = {"Con hang", "Con hang", "Con hang"};

        ArrayList<Drinks> drinksArrayList = new ArrayList<>();

        for(int i = 0; i < imageId.length;i++){

            Drinks drinks = new Drinks(name[i], price[i], stocks[i], imageId[i]);
            drinksArrayList.add(drinks);

        }

        DrinksListAdapter listAdapter = new DrinksListAdapter(DrinksListActivity.this, drinksArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(DrinksListActivity.this, DrinksDetailsActivity.class);
                i.putExtra("name", name[position]);
                i.putExtra("price", price[position]);
                i.putExtra("stocks", stocks[position]);
                i.putExtra("imageid", imageId[position]);
                startActivity(i);

            }
        });
    }

}