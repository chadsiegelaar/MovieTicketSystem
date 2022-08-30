package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Movie;
import za.ac.cput.repository.IMovie;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public abstract class MovieServiceImpl implements MovieService {

    private IMovie repository;

   @Autowired MovieServiceImpl(IMovie repository){
        this.repository = repository;
    }
    public Movie save (Movie movie){
       return this.repository.save(movie);
    }
    public Optional<Movie> read (String MovieID){
       return Optional.ofNullable((Movie) this.repository.findByMovieID(MovieID));
    }

    public boolean delete(String MovieID){
       if(this.repository.existsById(MovieID)){
           this.repository.deleteById(MovieID);
           return true;
       }
       return false;
    }
    public  Movie findByName(String title){
     return this.repository.findBytitle(title);

    }
    public Set<Movie> getAll(){
       return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}
