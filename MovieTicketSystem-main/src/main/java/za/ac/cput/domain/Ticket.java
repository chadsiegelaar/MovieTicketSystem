/* Ticket.java
 Entity for the Ticket
 Author: Chad Siegelaar (218340982)
 Date: 16 April 2022
*/

package za.ac.cput.domain;

public class Ticket {
    private String movieName;
    private String cinema;
    private String day;
    private String time;
    private String venue;

    public Ticket(String movieName, String cinema, String day, String time, String venue) {
        this.movieName = movieName;
        this.cinema = cinema;
        this.day = day;
        this.time = time;
        this.venue = venue;
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
}
