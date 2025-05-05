package onlineMovieTicketBookingSystem.booking;

import java.util.List;

import onlineMovieTicketBookingSystem.Show;
import onlineMovieTicketBookingSystem.User;
import onlineMovieTicketBookingSystem.Seat.Seat;

public class Booking {
    private final String id;
    private final User user;
    private final Show show;
    private final List<Seat> seats;
    private final double totalPrice;
    private BookingStatus status;

    public Booking(String id, User user, Show show, List<Seat> seats, double totalPrice, BookingStatus status){
        this.id = id;
        this.user = user;
        this.seats = seats;
        this.show = show;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public void setBookingStatus(BookingStatus status){
        this.status = status;
    }

    public String getId(){
        return id;
    }
    public User getUser(){
        return user;
    }
    public Show getShow(){
        return show;
    }
    public List<Seat> getSeats(){
        return seats;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public BookingStatus getBookingStatus(){
        return status;
    }

}
