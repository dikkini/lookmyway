package com.lookmyway.activity.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by haribo on 03.06.13.
 */
public class FuturicaBoldTextView extends TextView {
    private Context mContext;

    public FuturicaBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public FuturicaBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public FuturicaBoldTextView(Context context) {
        super(context);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(mContext.getAssets(), "fonts/a_Futurica ExtraBold.ttf");
        setTypeface(tf ,1);
    }
}