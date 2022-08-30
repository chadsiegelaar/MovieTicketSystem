/* Ticket.java
 Entity for the Ticket
 Author: Chad Siegelaar (218340982)
 Date: 16 April 2022
*/

package za.ac.cput.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Ticket {
    @NotNull
    @Id
    private String id;
    private String movieName;
    private String cinema;
    private String day;
    private String time;
    private String venue;

    protected Ticket(){

    }
    private Ticket(Builder builder) {
        this.id = builder.id;
        this.movieName = builder.movieName;
        this.cinema = builder.cinema;
        this.day = builder.day;
        this.time = builder.time;
        this.venue = builder.venue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", cinema='" + cinema + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String movieName;
        private String cinema;
        private String day;
        private String time;
        private String venue;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }

        public Builder setCinema(String cinema) {
            this.cinema = cinema;
            return this;
        }

        public Builder setDay(String day) {
            this.day = day;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setVenue(String venue) {
            this.venue = venue;
            return this;
        }

        public Builder copy(Ticket ticket) {
            this.id = ticket.id;
            this.movieName = ticket.movieName;
            this.cinema = ticket.cinema;
            this.day = ticket.day;
            this.time = ticket.time;
            this.venue = ticket.venue;
            return this;
        }
        public Ticket build(){
        return new Ticket(this);}
    }
}