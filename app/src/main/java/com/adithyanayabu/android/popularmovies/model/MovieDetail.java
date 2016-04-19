package com.adithyanayabu.android.popularmovies.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by adithyanayabu1 on 4/3/16.
 * {
 "adult": false,
 "backdrop_path": "/vsjBeMPZtyB7yNsYY56XYxifaQZ.jpg",
 "belongs_to_collection": {
 "id": 209131,
 "name": "Man of Steel Collection",
 "poster_path": "/oOHKVVQkaDvc5R5vM0NjhZPYfKc.jpg",
 "backdrop_path": "/csERw2A3XIsGegkzil6UGpyhqfw.jpg"
 },
 "budget": 250000000,
 "genres": [
 {
 "id": 28,
 "name": "Action"
 },
 {
 "id": 12,
 "name": "Adventure"
 },
 {
 "id": 14,
 "name": "Fantasy"
 },
 {
 "id": 878,
 "name": "Science Fiction"
 }
 ],
 "homepage": "http://www.batmanvsupermandawnofjustice.com/",
 "id": 209112,
 "imdb_id": "tt2975590",
 "original_language": "en",
 "original_title": "Batman v Superman: Dawn of Justice",
 "overview": "Fearing the actions of a god-like Super Hero left unchecked, Gotham City’s own formidable, forceful vigilante takes on Metropolis’s most revered, modern-day savior, while the world wrestles with what sort of hero it really needs. And with Batman and Superman at war with one another, a new threat quickly arises, putting mankind in greater danger than it’s ever known before.",
 "popularity": 70.318854,
 "poster_path": "/6bCplVkhowCjTHXWv49UjRPn0eK.jpg",
 "production_companies": [
 {
 "name": "Warner Bros. Pictures",
 "id": 174
 },
 {
 "name": "Atlas Entertainment",
 "id": 507
 },
 {
 "name": "DC Entertainment",
 "id": 9993
 },
 {
 "name": "Cruel & Unusual Films",
 "id": 9995
 },
 {
 "name": "RatPac-Dune Entertainment",
 "id": 41624
 }
 ],
 "production_countries": [
 {
 "iso_3166_1": "US",
 "name": "United States of America"
 }
 ],
 "release_date": "2016-03-23",
 "revenue": 166000000,
 "runtime": 151,
 "spoken_languages": [
 {
 "iso_639_1": "en",
 "name": "English"
 }
 ],
 "status": "Released",
 "tagline": "Justice or revenge",
 "title": "Batman v Superman: Dawn of Justice",
 "video": false,
 "vote_average": 5.9,
 "vote_count": 985
 }
 *
 *
 */
public class MovieDetail {

    @JsonProperty("adult")
    private boolean isAdult;
    @JsonProperty("backdrop_path")
    private String backDropPath;
    @JsonProperty("belongs_to_collection")
    private MovieCollection collection;
    @JsonProperty("budget")
    private Long budget;
    @JsonProperty("genres")
    private List<Genre> genreList;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("imdb_id")
    private String imdbId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("overview")
    private String overview;
    @JsonProperty("popularity")
    private double popularity;
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("production_companies")
    private List<ProductionCompany> productionCompanyList;
    @JsonProperty("production_countries")
    private List<Country> productionCountryList;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("revenue")
    private Long revenue;
    @JsonProperty("runtime")
    private Integer runtime;
    @JsonProperty("spoken_languages")
    private List<Language> spokenLanguageList;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tagline")
    private String tagLine;
    @JsonProperty("title")
    private String title;
    @JsonProperty("video")
    private boolean isVideo;
    @JsonProperty("vote_average")
    private double voteAverage;
    @JsonProperty("vote_count")
    private Long voteCount;


    public boolean isAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public void setBackDropPath(String backDropPath) {
        this.backDropPath = backDropPath;
    }

    public MovieCollection getCollection() {
        return collection;
    }

    public void setCollection(MovieCollection collection) {
        this.collection = collection;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public List<ProductionCompany> getProductionCompanyList() {
        return productionCompanyList;
    }

    public void setProductionCompanyList(List<ProductionCompany> productionCompanyList) {
        this.productionCompanyList = productionCompanyList;
    }

    public List<Country> getProductionCountryList() {
        return productionCountryList;
    }

    public void setProductionCountryList(List<Country> productionCountryList) {
        this.productionCountryList = productionCountryList;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public List<Language> getSpokenLanguageList() {
        return spokenLanguageList;
    }

    public void setSpokenLanguageList(List<Language> spokenLanguageList) {
        this.spokenLanguageList = spokenLanguageList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
