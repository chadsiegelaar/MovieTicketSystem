package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.FoodAndDrink;

import static org.junit.jupiter.api.Assertions.*;

class FoodAndDrinkFactoryTest {
    @Test
    public void buildWithSuccess() {

        FoodAndDrink foodAndDrink = FoodAndDrinkFactory
                .build("", "", "", "", "");
        System.out.println(foodAndDrink);
        assertNotNull(foodAndDrink);
    }

    @Test
    public void buildWithError() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                FoodAndDrinkFactory
                        .build("null", "", "", "", ""));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Combo NO is required!", exceptionMessage);
    }
}