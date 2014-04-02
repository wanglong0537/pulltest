package com.kingsoft.email.widget.pullToRefresh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public class ListViewFrame extends FrameLayout {

    public ListViewFrame(Context context) {
	super(context);
    }
    @Override
    public void addView(View child) {
	if(child instanceof FrameLayout){
	    return;
	}
        // TODO Auto-generated method stub
        super.addView(child);
    }
    @Override
    public void addView(View child, int index,
            android.view.ViewGroup.LayoutParams params) {
	if(child instanceof FrameLayout){
	    return;
	}
        super.addView(child, index, params);
    }
    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
	if(child instanceof FrameLayout){
	    return;
	}
        // TODO Auto-generated method stub
        super.addView(child, params);
    }

}
