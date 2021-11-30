package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.foodreviewproject.databinding.ActivityDrinksDetailsBinding;

public class DrinksDetailsActivity extends AppCompatActivity {

    ActivityDrinksDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrinksDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if( intent != null ){

            String  name = intent.getStringExtra("name");
            String price = intent.getStringExtra("price");
            String stocks = intent.getStringExtra("stocks");
            int imageid = intent.getIntExtra("imageid", R.drawable.coca);

            binding.detailsName.setText(name);
            binding.detailsPrice.setText(price);
            binding.detailsStocks.setText(stocks);
            binding.detailsImg.setImageResource(imageid);

        }

    }
}