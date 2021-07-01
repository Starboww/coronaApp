package com.example.register_login.Pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.register_login.PagerFragment.FragmentA;
import com.example.register_login.PagerFragment.FragmentB;
import com.example.register_login.PagerFragment.FragmentC;

public class ViewPager extends FragmentPagerAdapter {
    public ViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {


        switch (position)
        {
            case 0: return  new FragmentA();
            case 1: return  new FragmentB();
            case 2: return  new FragmentC();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
