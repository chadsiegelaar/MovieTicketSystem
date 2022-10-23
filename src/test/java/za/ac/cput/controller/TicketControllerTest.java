/* TicketControllerTest.java
 Author: Chad Siegelaar (218340982)
 Date: October 2022
*/

package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import za.ac.cput.domain.Ticket;
import za.ac.cput.factory.TicketFactory;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class TicketControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private  TicketController controller;
    private Ticket ticket;
    @LocalServerPort
    private  int port;
    private  String baseURL;
    @BeforeEach
    public void setUp() {
        assertNotNull(controller);
        this.ticket = TicketFactory.build("0001","Spiderman","IMAX","Tuesday","18h45","Muizenberg");
        this.baseURL = "http://localhost:"+ this.port +"/movie-ticket/ticket/";
    }
    @Test
    void save() {
        String url = baseURL + "save/";
        System.out.println(url);
        ResponseEntity<Ticket> response = this.restTemplate.postForEntity(url,this.ticket,Ticket.class);
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
    void read() {
        String url = baseURL + "read/"+ this.ticket.getMovieName();
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Ticket> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Ticket> response = restTemplate.exchange(url, HttpMethod.GET, entity, Ticket.class);
        System.out.println("Read: " + response.getBody());
    }

    @Test
    void deleteById() {
        String url = baseURL + "delete/"+ this.ticket.getMovieName();
        this.restTemplate.delete(url);
        System.out.println("Deleted:" + this.ticket.getMovieName()+"\n"+url);
    }
}
