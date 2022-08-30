package za.ac.cput.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.domain.Location;
import za.ac.cput.service.LocationImpl;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("movie-ticket/location/")
@Slf4j
public class LocationController {
    private LocationImpl locationService;
    @Autowired
    public LocationController(LocationImpl locationService){
        this.locationService = locationService;
    }
    @PostMapping("save")
    public ResponseEntity<Location> save(@Valid @RequestBody Location location)
    {
        log.info("Save Request: {}", location);
        Location save = this.locationService.save(location);
        return ResponseEntity.ok(save);
    }
    @GetMapping("all")
    public ResponseEntity<List<Location>> findAll()
    {
        List<Location> location = this.locationService.findAll();
        return ResponseEntity.ok(location);
    }
    @GetMapping("read/{id}")
    public ResponseEntity<Location> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        Location location = this.locationService.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(location);
    }
}
