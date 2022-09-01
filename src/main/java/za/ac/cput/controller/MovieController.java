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

@RestController
@RequestMapping("movie-ticket/movie/")
@Slf4j
public class MovieController {
    private  MovieServiceImpl movieService;
    @Autowired
    public MovieController(MovieServiceImpl movieService){
        this.movieService= movieService;

    }
    @GetMapping("read/{id}")
    public ResponseEntity<Movie> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        Movie  movie = this.movieService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(movie);
    }

    @PostMapping("save")
    public ResponseEntity<Movie> save(@Valid @RequestBody Movie movie)
    {
        log.info("Save Request: {}", movie);
        Movie save = this.movieService.save(movie);
        return ResponseEntity.ok(save);
    }
    @GetMapping("all")
    public ResponseEntity<List<Movie>> findAll()
    {
        List<Movie> movie = this.movieService.findAll();
        return ResponseEntity.ok(movie);
    }


}
