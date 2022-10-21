package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Movie;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMovie extends JpaRepository<Movie,String> {


    @Query("select m from Movie m where m.Title = ?1")
    Optional<Movie> findByTitle(String Title);
}
