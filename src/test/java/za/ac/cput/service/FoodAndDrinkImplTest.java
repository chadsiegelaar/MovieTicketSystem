package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.FoodAndDrink;
import za.ac.cput.factory.FoodAndDrinkFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FoodAndDrinkImplTest {
    private final FoodAndDrink foodAndDrink = FoodAndDrinkFactory
            .build("test-bev-name","price","","","");
    @Autowired

    private FoodAndDrinkService service;
    @Test
    void save() {
        FoodAndDrink saved = this.service.save(this.foodAndDrink);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.foodAndDrink, saved)
        );
    }


    @Test
    void read() {
        Optional<FoodAndDrink> read = this.service.read(this.foodAndDrink.getComboNO());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.foodAndDrink, read.get())
        );
    }


    @Test
    void delete() {
        this.service.delete(this.foodAndDrink);
    }

    @Test
    void findAllBeverageName() {
        String comboNO = this.foodAndDrink.getComboNO();
        List<FoodAndDrink> comboNOListList
                = this.service.findAllcomboNO(comboNO);
        System.out.println(comboNOListList);
        assertSame(0 ,comboNOListList.size());
    }
}
}