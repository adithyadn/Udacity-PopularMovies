package com.adithyanayabu.android.popularmovies.util;

import android.net.Uri;
import android.util.Log;

import com.squareup.picasso.Picasso;

/**
 * Created by adithyanayabu1 on 3/27/16.
 */
public class PicassoListener implements Picasso.Listener {
    @Override
    public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {

        Log.e("ERROR", "onImageLoadFailed: ", exception);
    }
}
