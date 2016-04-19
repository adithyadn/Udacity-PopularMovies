package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 4/3/16.
 * {
 "iso_639_1": "en",
 "name": "English"
 }
 */
public class Language {
    @JsonProperty("iso_639_1")
    private String languageCode;
    @JsonProperty("name")
    private String name;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
