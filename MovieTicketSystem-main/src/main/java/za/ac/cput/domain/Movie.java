package za.ac.cput.domain;

public class Movie {
    private String MovieID;
    private String Title;
    private  double Rating;
    private String MovieType;
    private double RunningTime;

    public Movie(String movieID, String title, double Rating, String movieType, double runningTime) {
        MovieID = movieID;
        Title = title;
        this.Rating = Rating;
        MovieType = movieType;
        RunningTime = runningTime;
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

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        this.Rating = Rating;
    }

    public String getMovieType() {
        return MovieType;
    }

    public void setMovieType(String movieType) {
        MovieType = movieType;
    }

    public double getRunningTime() {
        return RunningTime;
    }

    public void setRunningTime(double runningTime) {
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
        private  double Rating;
        private String MovieType;
        private double RunningTime;

        public Builder setMovieID(String movieID) {
            this.MovieID = movieID;
            return this;
        }

        public Builder setTitle(String title) {
            this.Title = title;
            return this;

        }

        public Builder setRating(double rating) {
            this.Rating = rating;
            return this;
        }

        public Builder setMovieType(String movieType) {
            this.MovieType = movieType;
            return this;

        }

        public Builder setRunningTime(double runningTime) {
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