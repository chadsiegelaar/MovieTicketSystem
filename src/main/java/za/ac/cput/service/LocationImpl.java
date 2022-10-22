package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.iLocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocationImpl implements  LocationService{

    private iLocationRepository repository;
    @Autowired
    public LocationImpl(iLocationRepository repository){
        this.repository = repository;
    }

    public Location save(Location location) {
        return this.repository.save(location);
    }
    @Override
    public Optional<Location> read(String s) {
        return this.repository.findById(s);
    }
    @Override
    public void deleteById(String id) {
      this.repository.deleteById(id);

    }
    @Override
    public List<Location> findAll() {
        return this.repository.findAll();
    }
}
