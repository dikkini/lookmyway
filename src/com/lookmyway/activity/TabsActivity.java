package com.lookmyway.activity;

/**
 * Created by haribo on 03.06.13.
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.lookmyway.R;

public class TabsActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Getting a reference to the ViewPager defined the layout file */
        ViewPager pager = (ViewPager) findViewById(R.id.pager);

        /** Getting fragment manager */
        FragmentManager fm = getSupportFragmentManager();

        /** Instantiating FragmentPagerAdapter */
        FragmentsPagerAdapter pagerAdapter = new FragmentsPagerAdapter(fm);

        /** Setting the pagerAdapter to the pager object */
        pager.setAdapter(pagerAdapter);

    }
}