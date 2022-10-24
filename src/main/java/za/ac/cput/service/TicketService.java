/* TicketService.java
 Author: Chad Siegelaar (218340982)
 Date: August 2022
*/

package za.ac.cput.service;

import za.ac.cput.domain.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketService {
    public List<Ticket> findAll();
    void deleteById(String id);
    Optional<Ticket> read(String id);

}