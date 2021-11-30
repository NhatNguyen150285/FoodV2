package com.example.foodreviewproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class CategoriesFragment extends Fragment {

    private View cView;

    GridView gridView;
    ArrayList<DanhMuc> arrayList1;
    GridAdapter gridAdapter;


    public CategoriesFragment() {




        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        cView =inflater.inflate(R.layout.fragment_categories, container, false);

        // Inflate the layout for this fragment


        gridView =  (GridView) cView.findViewById(R.id.gridView);

        arrayList1 = new ArrayList<>();

        arrayList1.add(new DanhMuc("Thức uống", R.drawable.thuc_uong));
        arrayList1.add(new DanhMuc("Thức ăn", R.drawable.thuc_an));
        arrayList1.add(new DanhMuc("Thức ăn nhanh", R.drawable.fastfood));
        arrayList1.add(new DanhMuc("Món chay", R.drawable.organicfood));

        gridAdapter = new GridAdapter(getContext(), R.layout.grid_row, arrayList1);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {

                    startActivity(new Intent(getContext(), DrinksListActivity.class));

                } else if (position == 1) {

                    startActivity(new Intent(getContext(), FoodListActivity.class));

                } else if (position == 2) {

                    startActivity(new Intent(getContext(), FastFoodListActivity.class));

                } else {


                    startActivity(new Intent(getContext(), OrganicListActivity.class));

                }
            }

        });

        return cView;
    }
}