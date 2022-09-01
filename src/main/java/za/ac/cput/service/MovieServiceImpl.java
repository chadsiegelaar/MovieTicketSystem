package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Movie;
import za.ac.cput.repository.IMovie;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    private IMovie repository;

   @Autowired MovieServiceImpl(IMovie repository){
        this.repository = repository;
    }
    public Movie save (Movie movie){
       return this.repository.save(movie);
    }
    public Movie read (String MovieID){
       return (Movie) this.repository.findByMovieID(MovieID);
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

    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Optional read(Object o) {
        return Optional.empty();
    }

    @Override
    public void delete(Object o) {

    }
}
