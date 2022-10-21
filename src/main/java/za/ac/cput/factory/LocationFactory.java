package za.ac.cput.factory;

import za.ac.cput.domain.Location;
import za.ac.cput.helper.RepositoryHelper;

public class LocationFactory {
    public static Location build(String nameOfCinema, String seatName,
                                          String seatSection, boolean seatAvailability) {


        if (RepositoryHelper.isNullorEmpty(nameOfCinema)||
                RepositoryHelper.isNullorEmpty(seatName) ||
                RepositoryHelper.isNullorEmpty(seatSection))
            return null;

        return  new Location.Builder().setNameOfCinema(nameOfCinema)
                .setSeatName(seatName)
                .setSeatSection(seatSection).setSeatAvailability(seatAvailability).build();

    }
}
