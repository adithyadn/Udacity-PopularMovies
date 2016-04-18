package com.adithyanayabu.android.popularmovies.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.adithyanayabu.android.popularmovies.R;
import com.adithyanayabu.android.popularmovies.api.MovieDBApiHelper;
import com.adithyanayabu.android.popularmovies.model.MovieDetail;
import com.adithyanayabu.android.popularmovies.model.MovieSummary;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by adithyanayabu1 on 3/19/16.
 */
public class MovieDetailFragment extends Fragment implements Callback<MovieDetail> {

    private TextView title;
    private TextView year;
    private TextView rating;
    private TextView overview;
    private ImageView banner;
    private MovieDetail movieDetail;
    private TextView duration;
    private View rootView;
    private TextView tagLine;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.movies_detail, container, false);
        Bundle movieBundle = getArguments();
        if (movieBundle != null) {
            MovieSummary summary = movieBundle.getParcelable("MOVIE_ID");
            MovieDBApiHelper apiHelper = new MovieDBApiHelper();

            Call<MovieDetail> movieDetailCall = apiHelper.getApiHelper().movieDetail(summary.getId(), MovieDBApiHelper.API_KEY);
            movieDetailCall.enqueue(this);

        }


        return rootView;
    }

    private void inflateMovieDetailView(View rootView, MovieDetail movieDetail) {
        title = (TextView) rootView.findViewById(R.id.movie_title_tv);
        year = (TextView) rootView.findViewById(R.id.movie_year_tv);
        rating = (TextView) rootView.findViewById(R.id.movie_rating_tv);
        overview = (TextView) rootView.findViewById(R.id.movie_overview_tv);
        banner = (ImageView) rootView.findViewById(R.id.banner);
        duration = (TextView) rootView.findViewById(R.id.movie_duration_tv);
        tagLine = (TextView) rootView.findViewById(R.id.movie_tagline_tv);

        title.setText(movieDetail.getTitle());
        year.setText(movieDetail.getReleaseDate().substring(0, 4));
        rating.setText(String.valueOf(movieDetail.getVoteAverage()) + " / 10.0");
        overview.setText(movieDetail.getOverview());
        duration.setText(movieDetail.getRuntime() + " min");
        tagLine.setText(movieDetail.getTagLine());
        Picasso.with(rootView.getContext()).load("http://image.tmdb.org/t/p/w780"
                + movieDetail.getBackDropPath()).fit().into(banner);
    }


    @Override
    public void onResponse(Call<MovieDetail> call, Response<MovieDetail> response) {
        this.movieDetail = response.body();
        inflateMovieDetailView(rootView, movieDetail);
    }

    @Override
    public void onFailure(Call<MovieDetail> call, Throwable t) {
        this.movieDetail = new MovieDetail();
    }
}
