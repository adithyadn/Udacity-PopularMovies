package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 4/3/16.
 * {
 * "id": 209131,
 * "name": "Man of Steel Collection",
 * "poster_path": "/oOHKVVQkaDvc5R5vM0NjhZPYfKc.jpg",
 * "backdrop_path": "/csERw2A3XIsGegkzil6UGpyhqfw.jpg"
 * }
 */

public class MovieCollection {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("backdrop_path")
    private String backDropPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public void setBackDropPath(String backDropPath) {
        this.backDropPath = backDropPath;
    }
}
