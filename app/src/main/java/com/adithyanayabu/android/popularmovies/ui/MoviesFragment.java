package com.adithyanayabu.android.popularmovies.ui;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.adithyanayabu.android.popularmovies.R;
import com.adithyanayabu.android.popularmovies.adapter.ImageAdapter;
import com.adithyanayabu.android.popularmovies.api.MovieDBApiHelper;
import com.adithyanayabu.android.popularmovies.model.MovieListResponse;
import com.adithyanayabu.android.popularmovies.model.MovieSummary;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by adithyanayabu1 on 3/16/16.
 */
public class MoviesFragment extends Fragment implements Callback<MovieListResponse> {

    private MovieListResponse movieListResponse;
    private GridView gridView;
    MovieDBApiHelper apiHelper = new MovieDBApiHelper();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {

        Bundle bundle = getArguments();

        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.movies_list, container, false);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        makeMovieListWebserviceCall(apiHelper, getString(R.string.popular_movies));

        gridView = (GridView) rootView.findViewById(R.id.movies_gridview);
        Log.w("GridView", "Adapter Set");

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ((MovieDetailCallBack) getActivity()).requestMovieDetail(movieListResponse.getResults().get(position));
            }
        });

        return rootView;
    }

    public void makeMovieListWebserviceCall(MovieDBApiHelper apiHelper, String searchType) {
        Call<MovieListResponse> call;
        if (searchType.equals(getString(R.string.top_rated_movies))) {
            call = apiHelper.getApiHelper().topRatedMovies(MovieDBApiHelper.API_KEY);
        } else {
            call = apiHelper.getApiHelper().popularMovies(MovieDBApiHelper.API_KEY);
        }

        call.enqueue(this);
    }


    @Override
    public void onResponse(Call<MovieListResponse> call, Response<MovieListResponse> response) {
        Log.w("RETROFIT", "Service Responded");
        this.movieListResponse = response.body();
        gridView.setAdapter(new ImageAdapter(getActivity().getApplicationContext(), movieListResponse));

    }

    @Override
    public void onFailure(Call<MovieListResponse> call, Throwable t) {
        this.movieListResponse = new MovieListResponse();
    }

    public interface MovieDetailCallBack {
        void requestMovieDetail(MovieSummary summary);
    }


}
