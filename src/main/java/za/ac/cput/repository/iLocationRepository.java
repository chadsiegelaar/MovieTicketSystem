package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.List;

public interface iLocationRepository extends iRepository<Location,iRepository> {
    public List<Location> getAll();
}
