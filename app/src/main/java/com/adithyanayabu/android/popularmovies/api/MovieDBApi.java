package com.adithyanayabu.android.popularmovies.api;

import com.adithyanayabu.android.popularmovies.model.MovieDetail;
import com.adithyanayabu.android.popularmovies.model.MovieListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by adithyanayabu1 on 4/2/16.
 */
public interface MovieDBApi {

    @GET("popular")
    Call<MovieListResponse> popularMovies(@Query("api_key") String apiKey);

    @GET("top_rated")
    Call<MovieListResponse> topRatedMovies(@Query("api_key") String apiKey);

    @GET("{movieId}")
    Call<MovieDetail> movieDetail(@Path("movieId") int movieId, @Query("api_key") String apiKey);
}
