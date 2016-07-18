package com.owlab.calendartestr3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by ernest on 7/17/16.
 */
public class VScrollView extends ScrollView {

    public VScrollView(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
    }

    public VScrollView(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
    }

    public VScrollView(Context ctx) {
        super(ctx);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return false;
    }
}
