/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 * Food And Drink
 * Repository Test
 *//*

package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FoodAndDrink;
import za.ac.cput.factory.FoodAndDrinkFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IFoodAndDrinkRepositoryTest {
    private static FoodAndDrink foodAndDrink = FoodAndDrinkFactory.createFoodAndDrink("2100", "Large", "50", "R20", "");
    private static IFoodAndDrinkRepository repository;

    @Test
    void l_create() {
        FoodAndDrink created = repository.create(foodAndDrink);
        assertEquals(foodAndDrink.getComboNO(), created.getComboNO());
        System.out.println("Create: " + created);
    }

    @Test
    void m_read() {
        Optional<FoodAndDrink> read = repository.read(foodAndDrink.getComboNO());
        assertNotNull(read);
        System.out.println("Read :" + read);
    }


    @Test
    void o_delete() {

        this.repository.save(this.foodAndDrink);
        List<FoodAndDrink> foodAndDrinkList = this.repository.findAll();
        assertEquals(0, foodAndDrinkList.size());
    }

    @Test
    void p_getAll() {
        System.out.println("Show all :");
        System.out.println(repository.getAll());

    }
}*/
