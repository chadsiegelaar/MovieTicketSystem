package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Location;

import java.util.List;
import java.util.Optional;

@Repository
public interface iLocationRepository extends JpaRepository<Location,String> {
    public List<Location> getAll();

    Optional<Location> read(String s);
}
