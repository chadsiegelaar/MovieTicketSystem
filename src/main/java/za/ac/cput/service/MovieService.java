package za.ac.cput.service;

import za.ac.cput.domain.Movie;

import java.util.List;

public interface MovieService extends IService<Movie, String> {
    void deleteById(String id);

    List<Movie> findAll();

}
