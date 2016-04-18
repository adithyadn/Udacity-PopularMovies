package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 3/27/16.
 */
public class ProductionCompany {
    @JsonProperty("name")
    private String companyName;
    @JsonProperty("id")
    private int companyId;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
