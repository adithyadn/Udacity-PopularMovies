package com.adithyanayabu.android.popularmovies.ui;

import android.app.Activity;
import android.os.Bundle;

import com.adithyanayabu.android.popularmovies.R;

public class MovieDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        if (savedInstanceState == null) {

            Bundle bundle = new Bundle();
            bundle.putParcelable("MOVIE_ID", getIntent().getParcelableExtra("MOVIE_ID"));

            MovieDetailFragment fragment = new MovieDetailFragment();
            fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.movie_detail_container, fragment, "DMTAG").commit();
        }

    }
}
