package com.example.firstip.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.firstip.models.Business;
import com.example.firstip.ui.NewDetailFragment;

import java.util.List;

public class NewPagerAdapter extends FragmentPagerAdapter {

    private List<Business> mNews;

    public NewPagerAdapter(FragmentManager fm, List<Business> news) {
        super(fm);
        mNews = news;
    }

    @Override
    public Fragment getItem(int position) {
        return NewDetailFragment.newInstance(mNews.get(position));
    }

    @Override
    public int getCount() {
        return mNews.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mNews.get(position).getName();
    }

}
