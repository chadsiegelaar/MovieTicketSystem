/* TicketFactory.java
 Author: Chad Siegelaar (218340982)
 Date: 02 August 2022
*/

package za.ac.cput.factory;

import za.ac.cput.domain.Ticket;
import za.ac.cput.helper.RepositoryHelper;

public class TicketFactory {
    public static Ticket build(String movieName, String cinema, String day, String time, String venue)
    {
        if (RepositoryHelper.isNullorEmpty(movieName)|| RepositoryHelper.isNullorEmpty(cinema)||
                RepositoryHelper.isNullorEmpty(day)|| RepositoryHelper.isNullorEmpty(time)||
                RepositoryHelper.isNullorEmpty(venue))
            return null;

        return new Ticket.Builder().setMovieName(movieName)
                .setCinema(cinema)
                .setDay(day)
                .setTime(time)
                .setVenue(venue)
                .build();
    }
}
