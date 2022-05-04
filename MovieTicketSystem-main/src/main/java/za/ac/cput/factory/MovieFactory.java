package za.ac.cput.factory;

import za.ac.cput.domain.Movie;
import za.ac.cput.helper.RepositoryHelper;

public class MovieFactory {
    public static Movie CreateMovie(String movieID, String title, double Rating,
                                    String movieType, double runningTime) {


        if (RepositoryHelper.isNullorEmpty(movieID)||
                RepositoryHelper.isNullorEmpty(title) ||
        RepositoryHelper.isNullorEmpty(movieType))
            return null;

        return  new Movie.Builder().setMovieID(movieID).setTitle(title).
                setRating(Rating).setMovieType(movieType)
                .setRunningTime(runningTime).build();
    }
}
