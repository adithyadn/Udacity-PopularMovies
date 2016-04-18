package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 4/3/16.
 * {
 * "iso_3166_1": "US",
 * "name": "United States of America"
 * }
 */
public class Country {

    @JsonProperty("iso_3166_1")
    private String countryCode;
    @JsonProperty("name")
    private String name;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
