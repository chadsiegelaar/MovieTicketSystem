package za.ac.cput.service;

import za.ac.cput.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    boolean delete(String MovieID);

    Optional<Movie> findByTitle(String Title);
    List<Movie> findAll();

}
