package com.owlab.calendartestr3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/**
 * Created by ernest on 7/17/16.
 */
public class HScrollView extends HorizontalScrollView {

    public HScrollView(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
    }

    public HScrollView(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
    }

    public HScrollView(Context ctx) {
        super(ctx);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return false;
    }
}
