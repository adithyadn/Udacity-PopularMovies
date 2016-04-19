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
    List<String> posterURL = new ArrayList();
    private final static String BASE_URL = "http://image.tmdb.org/t/p/";

    public ImageAdapter(Context c, MovieListResponse movieListResponse) {
        mContext = c;
        response = movieListResponse;
    }

    public int getCount() {
        return response.getResults().size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        MovieImageView imageView;
        if (convertView == null) {
            imageView = new MovieImageView(mContext);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (MovieImageView) convertView;
        }

        posterURL = getPosterURLs(response);

        Picasso.with(mContext).setLoggingEnabled(true);
        Picasso.with(mContext).load(BASE_URL + mContext.getString(R.string.poster_dimen)
                + posterURL.get(position)).fit().error(R.drawable.sample_0).into(imageView);

        return imageView;
    }

    public List<String> getPosterURLs(MovieListResponse movieListResponse) {
        List<String> posterURL = new ArrayList<>();
        for (MovieSummary summary : movieListResponse.getResults()) {
            posterURL.add(summary.getPosterPath());
        }
        return posterURL;
    }


}