package com.cosmicy.cosmi.c51_viewscroll;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by cosmi on 2016/2/24.
 */
public class CyView extends View {

    private int lastX;
    private int lastY;

    public CyView(Context context) {
        super(context);
        initView();
    }

    public CyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        setBackgroundColor(Color.CYAN);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                //记录触摸点
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //偏移量
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                //在当前基础上加上偏移量
                layout(getLeft() + offsetX, getTop() + offsetY, getRight() + offsetX, getBottom() + offsetY);
                break;

        }
        return true;
    }
}
