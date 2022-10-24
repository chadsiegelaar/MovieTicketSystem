package za.ac.cput.factory;

import za.ac.cput.domain.Movie;
import za.ac.cput.helper.RepositoryHelper;

public class MovieFactory {
    public static Movie build(String movieID, String title, String Rating,
                              String movieType, String runningTime) {


        if (RepositoryHelper.isNullorEmpty(movieID)||
                RepositoryHelper.isNullorEmpty(title) ||
                RepositoryHelper.isNullorEmpty(Rating) ||
                RepositoryHelper.isNullorEmpty(runningTime) ||
                RepositoryHelper.isNullorEmpty(movieType))
            return new Movie();

        return  new Movie.Builder().setMovieID(movieID).setTitle(title).
                setRating(Rating).setMovieType(movieType)
                .setRunningTime(runningTime).build();
    }
}
