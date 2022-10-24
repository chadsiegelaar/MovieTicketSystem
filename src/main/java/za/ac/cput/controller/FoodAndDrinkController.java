/*

*/
/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 * Controller :Food and Drink
  *//*

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.FoodAndDrink;
import lombok.extern.slf4j.Slf4j;
import za.ac.cput.domain.Location;
import za.ac.cput.service.FoodAndDrinkImpl;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("movie-ticket/foodAndDrink/")
@Slf4j
public class FoodAndDrinkController {
    private final FoodAndDrinkImpl foodAndDrinkService;

    @Autowired
    public FoodAndDrinkController(FoodAndDrinkImpl foodAndDrinkService) {
        this.foodAndDrinkService = foodAndDrinkService;
    }

    @PostMapping("Save")
    //implementation of the controller
    public FoodAndDrink save(@Valid @RequestBody FoodAndDrink FoodAndDrink) {
        log.info("Save Request: {}", FoodAndDrink);
        return this.foodAndDrinkService.save(FoodAndDrink);
    }

    @GetMapping("all")
    public List<FoodAndDrink> findAll() {
        return this.foodAndDrinkService.findAll();
    }

    @DeleteMapping("delete/{comboNo}")
    public void delete (@PathVariable String comboNO) {
        this.foodAndDrinkService.deleteBycomboNO(comboNO);
    }
    @GetMapping("read/{comboNO}")
    public Optional<FoodAndDrink> read(@PathVariable String comboNo)
    {
        log.info("Read Request: {}", comboNo);
        return this.foodAndDrinkService.read(comboNo);
    }
}*/
