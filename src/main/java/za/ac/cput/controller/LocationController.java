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
import java.util.Optional;

@RestController
@RequestMapping("/movie-ticket/location/")
@Slf4j
public class LocationController {
    private LocationImpl locationService;
    @Autowired
    public LocationController(LocationImpl locationService){
        this.locationService = locationService;
    }

    @PostMapping("save")
    public Location save(@Valid @RequestBody Location location)
    {
        log.info("Save Request: {}", location);
        return this.locationService.save(location);
    }
    @GetMapping("all")
    public List<Location> findAll()
    {
        return this.locationService.findAll();
    }
    @GetMapping("read/{id}")
    public Optional<Location> read(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        return this.locationService.read(id);
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable String id) {
        this.locationService.deleteById(id);

    }

}
