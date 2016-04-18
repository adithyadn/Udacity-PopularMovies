package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 4/3/16.
 * {
 * "id": 28,
 * "name": "Action"
 * }
 */
public class Genre {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;

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
}
