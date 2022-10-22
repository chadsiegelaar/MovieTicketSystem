/* TicketService.java
 Author: Chad Siegelaar (218340982)
 Date: August 2022
*/

package za.ac.cput.service;

import za.ac.cput.domain.Location;
import za.ac.cput.domain.Ticket;

import java.util.Optional;
import java.util.Set;

public interface TicketService {
    public Set<Ticket> getAll();
    void deleteById(String id);
    Optional<Ticket> read(String id);
}
