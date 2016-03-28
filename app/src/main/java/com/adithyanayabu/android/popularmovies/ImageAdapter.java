package com.adithyanayabu.android.popularmovies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by adithyanayabu1 on 3/17/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        MovieImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new MovieImageView(mContext);
            //imageView.setLayoutParams(new GridView.LayoutParams(600, 900));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(1, 1, 1, 1);
        } else {
            imageView = (MovieImageView) convertView;
        }

        Picasso.with(mContext).load(mThumbIds[position]).fit().into(imageView);
        //imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private String[] mThumbIds = {
            "https://upload.wikimedia.org/wikipedia/en/7/71/Phantom_Hindi_Poster.jpg", "http://movie.likenepal.com/wp-content/uploads/sites/11/2016/01/Direct-Ishq-movie.jpg",
            "http://www.deathbymovies.com/wp-content/uploads/2014/03/planet-of-the-apes-movie-poster-600x900.jpg", "http://www.telugustates.com/sitebuildercontent/sitebuilderpictures/yentha-vaadu-gaanie/ajith-yentha-vaadu-gaani-poster-1.jpg",
            "http://movie.likenepal.com/wp-content/uploads/sites/11/2016/01/Direct-Ishq-movie.jpg", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png",
            "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"
    };

    /*private Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };*/
}