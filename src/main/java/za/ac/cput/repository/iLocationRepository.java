package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Location;

import java.util.List;
@Repository
public interface iLocationRepository extends JpaRepository<Location,String> {
    public List<Location> getAll();
}
