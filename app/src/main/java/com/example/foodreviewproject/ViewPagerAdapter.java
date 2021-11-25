package com.example.foodreviewproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();

            case 1:
                return new CategoriesFragment();

            case 2:
                return new HistoryFragment();

            case 3:
                return new AboutUsFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
