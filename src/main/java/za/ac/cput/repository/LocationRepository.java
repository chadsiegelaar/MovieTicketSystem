package za.ac.cput.repository;

import za.ac.cput.domain.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationRepository {


    public class FoodRepository implements iLocationRepository {
        private static LocationRepository repo = null;
        private List<Location> locationDB=null;

        public FoodRepository(){
            locationDB= new ArrayList<Location>();

        }
        public static LocationRepository getRepo(){
            if(repo==null){
                repo = new LocationRepository();
            }
            return repo;
        }
        @Override
        public Location create(Location location){
            boolean success =locationDB.add(location);
            if(!success)
                return null;
            return location;
        }
        @Override
        public  Location  read(String nameOfCinema){
            for (Location l : locationDB){
                if(l.getNameOfCinema()==nameOfCinema)
                    return l;
            }
            return null;
        }
        @Override
        public Location  update(Location location ){
            Location  oldLocation  = read(location.getNameOfCinema());
            if(oldLocation  !=null){
                locationDB.remove(oldLocation);
                locationDB.add(location);
                return location;
            }
            return null;
        }

        @Override
        public boolean delete(String nameOfCinema) {
            Location locationtoDelete = read(nameOfCinema);
            if(locationtoDelete == null) {
                System.out.println("Nothing to delete: ");
                return false;
            }
            locationDB.remove(locationtoDelete);
            System.out.println("Delete success: ");
            return true;
        }
        public List<Location> getAll(){
            return locationDB;
        }
    }

}
