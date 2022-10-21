package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    //Passing test
    public void test1(){
        Location loc = LocationFactory.build("SkuMax","S2","Row3",true);
        System.out.println(loc.toString());
    }

}