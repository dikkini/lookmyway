package com.lookmyway.activity;

/**
 * Created by haribo on 03.06.13.
 */
import android.os.Bundle;

public class TabSwipeTest extends TabSwipe {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addTab( "Tab 1", TestFragment.class, TestFragment.createBundle( "Fragment 1") );
        addTab( "Tab 2", TestFragment.class, TestFragment.createBundle( "Fragment 2") );
        addTab( "Tab 3", TestFragment.class, TestFragment.createBundle( "Fragment 3") );
        addTab( "Tab 3", TestFragment.class, TestFragment.createBundle( "Fragment 4") );
        addTab( "Tab 3", TestFragment.class, TestFragment.createBundle( "Fragment 5") );
        addTab( "Tab 3", TestFragment.class, TestFragment.createBundle( "Fragment 6") );
        addTab( "Tab 3", TestFragment.class, TestFragment.createBundle( "Fragment 7") );
    }
}