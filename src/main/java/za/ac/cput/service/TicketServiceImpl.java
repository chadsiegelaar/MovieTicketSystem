/* TicketServiceImpl.java
 Author: Chad Siegelaar (218340982)
 Date: August 2022
*/

package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Ticket;
import za.ac.cput.repository.TicketRepository;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService{
    private TicketRepository repository;

    @Autowired
    public TicketServiceImpl(TicketRepository repository) {
        this.repository = repository;}


    public Ticket save(Ticket ticket) {
        return this.repository.save(ticket);}

    @Override
    public Optional<Ticket> read(String id) {
        return Optional.ofNullable(this.repository.findById(id).orElse(null));}

    @Override
    public void deleteById(String Id){
        this.repository.deleteById(Id);
    }

    @Override
    public Set<Ticket> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}