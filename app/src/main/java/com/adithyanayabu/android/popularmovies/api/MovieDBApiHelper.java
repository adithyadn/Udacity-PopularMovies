package com.adithyanayabu.android.popularmovies.api;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by adithyanayabu1 on 4/16/16.
 */
public class MovieDBApiHelper {

    private MovieDBApi apiHelper;
    public static String API_KEY = "API_KEY";
    public MovieDBApiHelper() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/movie/")
                .addConverterFactory(JacksonConverterFactory.create())

                .build();
        apiHelper = retrofit.create(MovieDBApi.class);

    }

    public MovieDBApi getApiHelper() {
        return apiHelper;
    }

    public void setApiHelper(MovieDBApi apiHelper) {
        this.apiHelper = apiHelper;
    }
}
