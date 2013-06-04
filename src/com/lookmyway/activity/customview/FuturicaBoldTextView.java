package com.lookmyway.activity.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by haribo on 03.06.13.
 */
public class FuturicaBoldTextView extends TextView {

    public FuturicaBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FuturicaBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FuturicaBoldTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Context context = getContext();
        assert context != null;
        Typeface tf = Typeface.createFromAsset(context.getAssets(), "fonts/a_Futurica ExtraBold.ttf");
        setTypeface(tf ,1);
    }

}