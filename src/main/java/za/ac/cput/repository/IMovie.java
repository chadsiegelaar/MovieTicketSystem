package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Movie;

import java.util.List;
@Repository
public interface IMovie extends JpaRepository<Movie,String> {
    public List<Movie> getAll();

    List<Movie> findByMovieID(String MovieID);

    boolean existsById(String movieID);

    void deleteById(String movieID);

    Movie findBytitle(String title);
}
