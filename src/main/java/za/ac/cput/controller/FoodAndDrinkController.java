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
import za.ac.cput.service.FoodAndDrinkService;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("movie-ticket/FoodAndDrink/")
public class FoodAndDrinkController {

    private final FoodAndDrinkService foodAndDrinkService;


    @Autowired
    public FoodAndDrinkController(FoodAndDrinkService foodAndDrinkService) {
        this.foodAndDrinkService = foodAndDrinkService;
    }

    @PostMapping("Save")
    //implementation of the controller
    public ResponseEntity<FoodAndDrink> save(@Valid @RequestBody FoodAndDrink foodAndDrink) {
        //log.info("Save Request: {}", foodAndDrink);
        FoodAndDrink save = this.foodAndDrinkService.save(foodAndDrink);
        return ResponseEntity.ok(save);

    }


    @DeleteMapping("delete/{type}")
    public ResponseEntity<Void> delete(@PathVariable String comboNO) {
        this.foodAndDrinkService.deleteBycomboNO(comboNO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<FoodAndDrink>> findAll() {
        List<FoodAndDrink> foodAndDrink = this.foodAndDrinkService.findAll();
        return ResponseEntity.ok(foodAndDrink);
    }
}*/
