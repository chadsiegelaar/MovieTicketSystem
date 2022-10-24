package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Location;
import za.ac.cput.domain.Movie;
import za.ac.cput.service.LocationImpl;
import za.ac.cput.service.MovieServiceImpl;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie-ticket/movie/")
@Slf4j
public class MovieController {
    private  MovieServiceImpl movieService;
    @Autowired
    public MovieController(MovieServiceImpl movieService){
        this.movieService= movieService;

    }
    @GetMapping("read/{id}")
    public Optional<Movie> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);

        return movieService.read(id);
    }
    @PostMapping("save")
    public ResponseEntity <Movie> save(@Valid @RequestBody Movie movie)
    {
        log.info("Save Request: {}", movie);
        return ResponseEntity.ok( movieService.save(movie));
    }
    @GetMapping("all")
    public List<Movie> findAll()
    {
        return movieService.findAll();
    }
    @GetMapping("find/{title}")
    public Optional<Movie> findTitle(@PathVariable @Valid String Title){
        return  movieService.findByTitle(Title);
    }
@DeleteMapping("delete/{MovieID}")
public boolean delete(@PathVariable String MovieID){
        movieService.delete(MovieID);
        return true;
}

}
