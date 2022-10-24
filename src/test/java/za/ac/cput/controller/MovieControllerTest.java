package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

import za.ac.cput.domain.Location;
import za.ac.cput.domain.Movie;
import za.ac.cput.factory.MovieFactory;


import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MovieControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private  MovieController controller;
    private Movie movie;
    @LocalServerPort
    private  int port;
    private  String baseURL;
    @BeforeEach
    public void setUp() {
        assertNotNull(controller);
        this.movie =  MovieFactory.build("123","Black","8.9","Action","2.30");
        this.baseURL = "http://localhost:"+ this.port +"/movie-ticket/movie/";
    }
    @Test
    void read() {
        String url = baseURL + "read/"+ this.movie.getMovieID();
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Movie> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.GET, entity, Movie.class);
        System.out.println("Read: " + response.getBody());
    }

    @Test
    void save() {
        String url = baseURL + "save/";
        System.out.println(url);
        ResponseEntity<Movie> response = this.restTemplate.postForEntity(url,this.movie,Movie.class);
        System.out.println(response);
        assertAll(()->assertEquals(HttpStatus.OK,response.getStatusCode()),
                ()->assertNotNull(response.getBody()));
        System.out.println("Created: " + response.getBody());
    }

    @Test
    void findAll() {
        String url = baseURL + "all/" ;
        System.out.println(url);
        HttpHeaders header = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, header);
        ResponseEntity<String> response = this.restTemplate.exchange(url, HttpMethod.GET, entity,String.class);
        assertNotNull(response);
        assertAll(()->assertEquals(HttpStatus.OK,response.getStatusCode()));
        System.out.println(response.getBody());
    }

    @Test
    @Disabled
    void findTitle() {
        String url = baseURL + "read/"+ this.movie.getTitle();
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Movie> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Movie> response = restTemplate.exchange(url, HttpMethod.GET, entity, Movie.class);
        assertAll(() -> assertEquals(HttpStatus.OK, response.getStatusCode()), () -> assertNotNull(response.getBody()));
        System.out.println("Read: " + response.getBody());

    }

    @Test
    void delete() {
        String url = baseURL + "delete/"+ this.movie.getMovieID();
        this.restTemplate.delete(url);
        System.out.println("Deleted:" + this.movie.getMovieID()+"\n"+url);
    }
}