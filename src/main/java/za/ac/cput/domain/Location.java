package za.ac.cput.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import java.io.Serializable;
@JsonDeserialize
@Entity
public class Location implements Serializable {
    @Id
    @Basic(optional = false)
   private  String NameOfCinema;
   private String SeatName;
   private String SeatSection;
   private boolean SeatAvailability;

    public Location(String nameOfCinema, String seatName, String seatSection, boolean seatAvailability) {
        NameOfCinema = nameOfCinema;
        SeatName = seatName;
        SeatSection = seatSection;
        SeatAvailability = seatAvailability;
    }
    private Location (Builder builder){
        this.NameOfCinema = builder.NameOfCinema;
        this.SeatName = builder.SeatName;
        this.SeatSection = builder.SeatSection;
        this.SeatAvailability = builder.SeatAvailability;
    }

    public Location() {}
    public String getNameOfCinema() {
        return NameOfCinema;
    }

    public void setNameOfCinema(String nameOfCinema) {
        NameOfCinema = nameOfCinema;
    }

    public String getSeatName() {
        return SeatName;
    }

    public void setSeatName(String seatName) {
        SeatName = seatName;
    }

    public String getSeatSection() {
        return SeatSection;
    }

    public void setSeatSection(String seatSection) {
        SeatSection = seatSection;
    }

    public boolean isSeatAvailability() {
        return SeatAvailability;
    }

    public void setSeatAvailability(boolean seatAvailability) {
        SeatAvailability = seatAvailability;
    }

    @Override
    public String toString() {
        return "Location{" +
                "NameOfCinema='" + NameOfCinema + '\'' +
                ", SeatName='" + SeatName + '\'' +
                ", SeatSection='" + SeatSection + '\'' +
                ", SeatAvailability=" + SeatAvailability +
                '}';
    }
    //Implementing Builder Pattern
    public static class Builder {
        private String NameOfCinema;
        private String SeatName;
        private String SeatSection;
        private boolean SeatAvailability;

        public Builder setNameOfCinema(String nameOfCinema) {
            this.NameOfCinema = nameOfCinema;
            return this;
        }

        public Builder setSeatName(String seatName) {
            this.SeatName = seatName;
            return this;
        }

        public Builder setSeatSection(String seatSection) {
            this.SeatSection = seatSection;
            return this;
        }

        public Builder setSeatAvailability(boolean seatAvailability) {
            this.SeatAvailability = seatAvailability;
            return this;
        }

        public Builder copy(Location location) {
            this.NameOfCinema = location.NameOfCinema;
            this.SeatName = location.SeatName;
            this.SeatSection = location.SeatSection;
            this.SeatAvailability = location.SeatAvailability;
            return this;
        }

        public Location build() {
            return new Location(this);
        }
    }
}
