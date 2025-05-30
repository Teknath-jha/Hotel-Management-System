package airlinemanagementsystem.booking;

import airlinemanagementsystem.Passenger;
import airlinemanagementsystem.flight.Flight;
import airlinemanagementsystem.seat.Seat;

public class Booking {
    private final String bookingNumber;
    private final Flight flight;
    private final Passenger passenger;
    private final Seat seat;
    private final double price;
    private BookingStatus status;

    public Booking(String boolingNumber, Flight flight, Passenger passenger, Seat seat, double price ){
        this.bookingNumber = boolingNumber;
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
        this.price = price;
        this.status = BookingStatus.CONFIRMED;
    }

    public void cancel(){
        this.status = BookingStatus.CANCELLED;
    }

    public String getBookingNumber(){
        return bookingNumber;
    }
}
