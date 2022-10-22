/* TicketController.java
 Author: Chad Siegelaar (218340982)
 Date: 09 October 2022
*/

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Ticket;
import za.ac.cput.service.TicketServiceImpl;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/ticket")
public class TicketController {
    private TicketServiceImpl ticketService;

    @Autowired
    TicketController(TicketServiceImpl ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("save")
    public ResponseEntity<Ticket> save(@Valid @RequestBody Ticket ticket) {
        return ResponseEntity.ok(this.ticketService.save(ticket));
    }

    @GetMapping("read/{type}")
    public ResponseEntity<Ticket> read(@PathVariable String ticketId) {
        Ticket read = this.ticketService.read(ticketId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Ticket not found"));
        return ResponseEntity.ok(read);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        this.ticketService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<List<Ticket>> getAll() {
        List<Ticket> contactTypes = (List<Ticket>) this.ticketService.getAll();
        return ResponseEntity.ok(contactTypes);
    }
}