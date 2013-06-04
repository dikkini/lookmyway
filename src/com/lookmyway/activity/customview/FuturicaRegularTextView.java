package com.lookmyway.activity.customview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by haribo on 03.06.13.
 */
public class FuturicaRegularTextView extends TextView {
    private Context mContext;

    public FuturicaRegularTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public FuturicaRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public FuturicaRegularTextView(Context context) {
        super(context);
        this.mContext = context;
        if(!isInEditMode()) {
            init();
        }
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(mContext.getAssets(), "fonts/a_Futurica Regular.ttf");
        setTypeface(tf ,1);
    }
}