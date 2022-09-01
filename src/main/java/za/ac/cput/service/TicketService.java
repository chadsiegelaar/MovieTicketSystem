/* TicketService.java
 Author: Chad Siegelaar (218340982)
 Date: August 2022
*/

package za.ac.cput.service;

import za.ac.cput.domain.Ticket;
import java.util.Set;

public interface TicketService extends IService<Ticket, String>{
    public Set<Ticket> getAll();
}
