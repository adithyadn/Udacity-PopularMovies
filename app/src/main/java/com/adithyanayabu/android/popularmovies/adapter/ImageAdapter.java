package com.adithyanayabu.android.popularmovies.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.adithyanayabu.android.popularmovies.R;
import com.adithyanayabu.android.popularmovies.model.MovieListResponse;
import com.adithyanayabu.android.popularmovies.model.MovieSummary;
import com.adithyanayabu.android.popularmovies.ui.MovieImageView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adithyanayabu1 on 3/17/16.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private MovieListResponse response;
    private final static String BASE_URL = "http://image.tmdb.org/t/p/";

    public ImageAdapter(Context c, MovieListResponse movieListResponse) {
        mContext = c;
        response = movieListResponse;
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
        if (response == null) {
            Picasso.with(mContext).setLoggingEnabled(true);
            Picasso.with(mContext).load(mThumbIds[position]).fit().error(R.drawable.sample_0).into(imageView);
            return imageView;
        }

        List<String> posterURL = getPosterURLs(response);

        Picasso.with(mContext).setLoggingEnabled(true);
        Picasso.with(mContext).load(BASE_URL + mContext.getString(R.string.poster_dimen)
                + posterURL.get(position)).fit().error(R.drawable.sample_0).into(imageView);

        //imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public List<String> getPosterURLs(MovieListResponse movieListResponse) {
        List<String> posterURL = new ArrayList<>();
        for (MovieSummary summary : movieListResponse.getResults()) {
            posterURL.add(summary.getPosterPath());
        }
        return posterURL;
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

}