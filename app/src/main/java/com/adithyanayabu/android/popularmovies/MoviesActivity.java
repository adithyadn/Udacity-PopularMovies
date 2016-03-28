package com.adithyanayabu.android.popularmovies;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by adithyanayabu1 on 3/16/16.
 */
public class MoviesActivity extends Activity {

    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        if (findViewById(R.id.movie_detail_container) != null) {
            // The detail container view will be present only in the large-screen layouts
            // (res/layout-sw600dp). If this view is present, then the activity should be
            // in two-pane mode.
            mTwoPane = true;
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            if (savedInstanceState == null) {
                /*getSupportFragmentManager().beginTransaction()
                        .replace(R.id.weather_detail_container, new DetailFragment(), DETAILFRAGMENT_TAG)
                        .commit();*/

                getFragmentManager().beginTransaction().replace(R.id.movie_detail_container, new MovieDetailFragment(), "DMTAG").commit();
            }
        }

    }
}
