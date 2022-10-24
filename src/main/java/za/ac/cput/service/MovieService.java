package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    boolean delete(String MovieID);

     Movie save(Movie movie);
    Optional<Movie> findByTitle(String Title);
    List<Movie> findAll();

}
