package za.ac.cput.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Location;

@Repository
public interface iLocationRepository extends JpaRepository<Location,String> {

    void deleteById(String id);
}
