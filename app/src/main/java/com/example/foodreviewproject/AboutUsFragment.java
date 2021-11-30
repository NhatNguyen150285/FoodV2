package com.example.foodreviewproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import mehdi.sakout.aboutpage.AboutPage;



public class AboutUsFragment extends Fragment {

    TextView textView1,textView2,textView3,textView4,textView5,textView6;
    //  Button fbClick;
    ImageButton imageButton, insbtn;
    ImageView imgView;
    private View fView;
    RatingBar ratingBar;

    public AboutUsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fView = inflater.inflate(R.layout.fragment_about_us, container, false);

        ratingBar = fView.findViewById(R.id.ratingBar);
        textView1 = fView.findViewById(R.id.txtView1);
        textView2= fView.findViewById(R.id.txtView2);
        textView3 = fView.findViewById(R.id.txtView3);
        textView4 = fView.findViewById(R.id.txtView4);
        textView5 = fView.findViewById(R.id.txtView5);
        textView6 = fView.findViewById(R.id.txtView6);
        imageButton = fView.findViewById(R.id.fbButton);
        insbtn = fView.findViewById(R.id.insButton);
        imgView = fView.findViewById(R.id.gmailButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FacebookActivity.class);
                startActivity(intent);
            }
        });

        insbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), InstagramActivity.class);
                startActivity(intent);
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Thank you" , Toast.LENGTH_SHORT).show();
            }
        });
        return fView;
    }
}
