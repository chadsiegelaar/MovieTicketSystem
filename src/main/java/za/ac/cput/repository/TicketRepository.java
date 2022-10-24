/* TicketRepository.java
// Author: Chad Siegelaar (218340982)
// Date: 02 August 2022
//*/

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Ticket;
import java.util.Set;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {

}
