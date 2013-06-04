package com.lookmyway.activity;

/**
 * Created by haribo on 03.06.13.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lookmyway.activity.common.Constants;

public class FragmentsPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    /**
     * Constructor of the class
     */
    public FragmentsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * This method will be invoked when a page is requested to create
     */
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new Fragment();
        Bundle data = new Bundle();
        switch (position) {
            case 0:
                data.putInt("currentPage", Constants.MY_FRIENDS_FRAGMENT_PAGE);
                fragment = new MyFriends();
                fragment.setArguments(data);
                return fragment;
            case 1:
            case 2:
            default:
                break;
        }

        return fragment;
    }

    /**
     * Returns the number of pages
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}