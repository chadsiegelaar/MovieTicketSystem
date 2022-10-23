/* TicketFactoryTest.java
 Author: Chad Siegelaar (218340982)
 Date: October 2022
*/

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Ticket;

public class TicketFactoryTest{
    @Test
public void test1(){
    Ticket ticket = TicketFactory.build("0001","Spiderman","IMAX","Tuesday","18h45", "Muizenberg");
    System.out.println(ticket.toString());
}

}
