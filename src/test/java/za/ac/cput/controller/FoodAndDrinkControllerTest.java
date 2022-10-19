package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.FoodAndDrink;
import za.ac.cput.factory.FoodAndDrinkFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FoodAndDrinkControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private FoodAndDrinkController controller;
    @Autowired
    private TestRestTemplate restTemplate;
    private FoodAndDrink foodAndDrink;
    private String baseURL;

    @BeforeEach
    public void setUp() {
        assertNotNull(controller);
        this.foodAndDrink = FoodAndDrinkFactory
                .build("test-type", "", "", "", "");
        this.baseURL = "http://;localhost:" + this.port + "/food/Combo-NO/";
    }

    @Order(1)
    public void testSave() {
        String url = baseURL + "read/";
        System.out.println(url);
        ResponseEntity<FoodAndDrink> response = this.restTemplate
                .postForEntity(url, this.foodAndDrink, FoodAndDrink.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())

        );
    }

    @Test
    @Order(2)

    public void testRead() {
        String url = baseURL + "read/" + this.foodAndDrink.getComboNO();
        System.out.println(url);
        ResponseEntity<FoodAndDrink> response = this.restTemplate.getForEntity(url, FoodAndDrink.class);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())

        );
    }

    @Test
    @Order(3)
    public void testDelete() {
        String url = baseURL + "read/" + this.foodAndDrink.getComboNO();
        this.restTemplate.delete(url);
    }

    @Test
    @Order(4)
    public void testFindAll() {
        String url = baseURL + "all";
        System.out.println(url);
        ResponseEntity<FoodAndDrink> response =
                this.restTemplate.getForEntity(url, FoodAndDrink.class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 0)

        );
    }

}