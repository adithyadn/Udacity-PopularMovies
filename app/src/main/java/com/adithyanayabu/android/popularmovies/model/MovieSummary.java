package com.adithyanayabu.android.popularmovies.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by adithyanayabu1 on 3/27/16.
 *
 {
 "poster_path": "/6bCplVkhowCjTHXWv49UjRPn0eK.jpg",
 "adult": false,
 "overview": "Fearing the actions of a god-like Super Hero left unchecked, Gotham City’s own formidable, forceful vigilante takes on Metropolis’s most revered, modern-day savior, while the world wrestles with what sort of hero it really needs. And with Batman and Superman at war with one another, a new threat quickly arises, putting mankind in greater danger than it’s ever known before.",
 "release_date": "2016-03-23",
 "genre_ids": [
 28,
 12,
 14,
 878
 ],
 "id": 209112,
 "original_title": "Batman v Superman: Dawn of Justice",
 "original_language": "en",
 "title": "Batman v Superman: Dawn of Justice",
 "backdrop_path": "/cejHDyHEJSjtpsPgGzm1GNsZLMF.jpg",
 "popularity": 76.625193,
 "vote_count": 600,
 "video": false,
 "vote_average": 5.95
 }
 */
public class MovieSummary implements Parcelable {
    @JsonProperty("poster_path")
    private String posterPath;
    @JsonProperty("adult")
    private boolean isAdult;
    private String overview;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("genre_ids")
    private int[] genreIds;
    private int id;
    @JsonProperty("original_title")
    private String originalTitle;
    @JsonProperty("original_language")
    private String originalLanguage;
    private String title;
    @JsonProperty("backdrop_path")
    private String backdropPath;
    private double popularity;
    @JsonProperty("vote_count")
    private long voteCount;
    @JsonProperty("video")
    private boolean isVideo;
    @JsonProperty("vote_average")
    private double voteAverage;

    public MovieSummary() {

    }
    protected MovieSummary(Parcel in) {
        posterPath = in.readString();
        isAdult = in.readByte() != 0;
        overview = in.readString();
        releaseDate = in.readString();
        genreIds = in.createIntArray();
        id = in.readInt();
        originalTitle = in.readString();
        originalLanguage = in.readString();
        title = in.readString();
        backdropPath = in.readString();
        popularity = in.readDouble();
        voteCount = in.readLong();
        isVideo = in.readByte() != 0;
        voteAverage = in.readDouble();
    }

    public static final Creator<MovieSummary> CREATOR = new Creator<MovieSummary>() {
        @Override
        public MovieSummary createFromParcel(Parcel in) {
            return new MovieSummary(in);
        }

        @Override
        public MovieSummary[] newArray(int size) {
            return new MovieSummary[size];
        }
    };

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int[] getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(int[] genreIds) {
        this.genreIds = genreIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(posterPath);
        dest.writeInt(isAdult ? 1 : 0);
        dest.writeString(overview);
        dest.writeString(releaseDate);
        dest.writeIntArray(genreIds);
        dest.writeInt(id);
        dest.writeString(originalTitle);
        dest.writeString(originalLanguage);
        dest.writeString(title);
        dest.writeString(backdropPath);
        dest.writeDouble(popularity);
        dest.writeLong(voteCount);
        dest.writeInt(isVideo ? 1 : 0);
        dest.writeDouble(voteAverage);

    }
}
