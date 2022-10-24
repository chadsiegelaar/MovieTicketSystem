package za.ac.cput.domain;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
@JsonDeserialize
@Entity
public class Movie implements Serializable {
    @Id
    @Basic(optional = false)
    private String MovieID;
    private String Title;
    private  String Rating;
    private String MovieType;
    private String RunningTime;

    public Movie(String movieID, String title, String rating, String movieType, String runningTime) {
        MovieID = movieID;
        Title = title;
        Rating = rating;
        MovieType = movieType;
        RunningTime = runningTime;
    }

    public Movie() {
    }

    public String getMovieID() {
        return MovieID;
    }

    public void setMovieID(String movieID) {
        MovieID = movieID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        this.Rating = rating;
    }

    public String getMovieType() {
        return MovieType;
    }

    public void setMovieType(String movieType) {
        MovieType = movieType;
    }

    public String getRunningTime() {
        return RunningTime;
    }

    public void setRunningTime(String runningTime) {
        RunningTime = runningTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "MovieID='" + MovieID + '\'' +
                ", Title='" + Title + '\'' +
                ", Rating=" + Rating +
                ", MovieType='" + MovieType + '\'' +
                ", RunningTime=" + RunningTime +
                '}';
    }
    //Implementing builder pattern
    private Movie(Builder builder){
        this.MovieID = builder.MovieID;
        this.Title = builder.Title;
        this.Rating = builder.Rating;
        this.MovieType = builder.MovieType;
        this.RunningTime = builder.RunningTime;

    }
    public static class Builder{
        private String MovieID;
        private String Title;
        private  String Rating;
        private String MovieType;
        private String RunningTime;

        public Builder setMovieID(String movieID) {
            this.MovieID = movieID;
            return this;
        }

        public Builder setTitle(String title) {
            this.Title = title;
            return this;

        }

        public Builder setRating(String rating) {
            this.Rating = rating;
            return this;
        }

        public Builder setMovieType(String movieType) {
            this.MovieType = movieType;
            return this;

        }

        public Builder setRunningTime(String runningTime) {
            this.RunningTime = runningTime;
            return this;
        }
        public Builder copy(Movie movie){
            this.MovieID = movie.MovieID;
            this.Title = movie.Title;
            this.Rating = movie.Rating;
            this.MovieType = movie.MovieType;
            this.RunningTime = movie.RunningTime;
            return this;

        }
        public Movie build(){
            return  new Movie(this);
        }
    }
}