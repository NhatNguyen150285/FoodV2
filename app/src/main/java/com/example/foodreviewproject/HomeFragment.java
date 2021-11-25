package com.example.foodreviewproject;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RatingBar;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    CardView cardView;

    private View sView;
    String s1[], s2[];
    int images[] = {R.drawable.bunbo,R.drawable.banhtrangtron,R.drawable.comchien,R.drawable.miudon,R.drawable.padthai,R.drawable.spagetti};



    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    sView = inflater.inflate(R.layout.fragment_home, container, false);


        String[] food_list = getResources().getStringArray(R.array.food_list);

        AutoCompleteTextView editText = sView.findViewById(R.id.autoTV);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, food_list);
        editText.setAdapter(adapter);
        recyclerView = sView.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        s1 = getResources().getStringArray(R.array.food_list);
        s2 = getResources().getStringArray(R.array.description);


        RecyclerViewAdapter recyclerViewAdapter =   new RecyclerViewAdapter(getContext(),s1 , s2 ,images);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        return sView;


    }
}