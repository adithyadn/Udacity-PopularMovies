package com.adithyanayabu.android.popularmovies.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.adithyanayabu.android.popularmovies.R;
import com.adithyanayabu.android.popularmovies.model.MovieSummary;

/**
 * Created by adithyanayabu1 on 3/16/16.
 */
public class MoviesActivity extends Activity implements MoviesFragment.MovieDetailCallBack {

    public static boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        if (findViewById(R.id.movie_detail_container) != null) {
            mTwoPane = true;
            if (savedInstanceState == null) {
                getFragmentManager().beginTransaction().replace(R.id.movie_detail_container, new MovieDetailFragment(), "DMTAG").commit();
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        MoviesFragment fragment = (MoviesFragment) getFragmentManager().findFragmentById(R.id.fragment_movies);
        fragment.makeMovieListWebserviceCall(fragment.apiHelper, item.getTitle().toString());
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void requestMovieDetail(MovieSummary summary) {
        if (mTwoPane) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("MOVIE_ID", summary);

            MovieDetailFragment fragment = new MovieDetailFragment();
            fragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .replace(R.id.movie_detail_container, fragment, "MV_DETAIL")
                    .commit();
        } else {
            Intent intent = new Intent(this, MovieDetailActivity.class)
                    .putExtra("MOVIE_ID", summary);
            startActivity(intent);
        }
    }


}
