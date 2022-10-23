package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Register;

public class RegisterFactoryTest {
    @Test
    //Passing test
    public void test1(){
        Register reg = RegisterFactory.build("Jeffery","Dahmer","Jdahmer@gmail.com","0841234786","Jeff","Ieatyou");
        System.out.println(reg.toString());
    }

}

