package com.adithyanayabu.android.popularmovies.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by adithyanayabu1 on 3/19/16.
 */
public class MovieImageView extends ImageView {
    public MovieImageView(Context context) {
        super(context);
    }

    public MovieImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MovieImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

}
