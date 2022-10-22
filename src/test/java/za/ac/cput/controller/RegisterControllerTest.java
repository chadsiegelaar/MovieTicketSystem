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
import za.ac.cput.domain.Register;
import za.ac.cput.factory.RegisterFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RegisterControllerTest {
    @Autowired
    private TestRestTemplate Template;
    @Autowired
    private RegisterController controller;
    private Register register;
    @LocalServerPort
    private  int port;
    private  String baseURL;
    @BeforeEach
    public void setUp() {
        assertNotNull(controller);
        this.register = RegisterFactory.build("Jeffery","Dahmer","Jdahmer@gmail.com","0841234786","Jeff","Ieatyou");
        this.baseURL = "http://localhost:"+ this.port +"/movie-ticket/register/";
    }
    @Test
    void save() {
        String url = baseURL + "save/";
        System.out.println(url);
        ResponseEntity<Register> response = this.Template.postForEntity(url,this.register, Register.class);
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
        ResponseEntity<String> response = this.Template.exchange(url, HttpMethod.GET, entity,String.class);
        assertNotNull(response);
        assertAll(()->assertEquals(HttpStatus.OK,response.getStatusCode()));
        System.out.println(response.getBody());
    }

    @Test
    void read() {
        String url = baseURL + "read/"+ this.register.getFirstName();
        System.out.println(url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Register> entity = new HttpEntity<>(null, headers);
        ResponseEntity<Register> response = Template.exchange(url, HttpMethod.GET, entity, Register.class);
        System.out.println("Read: " + response.getBody());
    }

    @Test
    void deleteById() {
        String url = baseURL + "delete/"+ this.register.getFirstName();
        this.Template.delete(url);
        System.out.println("Deleted:" + this.register.getFirstName()+"\n"+url);
    }
}

