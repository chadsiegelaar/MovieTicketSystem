package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieFactoryTest {
    @Test
    //Passing test
    public void test1(){
        Movie mv = MovieFactory.build("002","Speaker",7.0,"Thriller",1.20);
        System.out.printf(mv.toString());
    }

}