package airlinemanagementsystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import airlinemanagementsystem.booking.Booking;
import airlinemanagementsystem.flight.Flight;
import airlinemanagementsystem.seat.Seat;
import airlinemanagementsystem.seat.SeatType;

public class AirlineManagementSystemDemo {
    public static void main(String args[]){
        AirlineManagementSystem airlineManagementSystem = new AirlineManagementSystem();

        // Create users
        Passenger passenger1 = new Passenger("USR1", "Teknath", "teknath@email.com", "1234567890");

        //Create flights
        LocalDateTime departure1 = LocalDateTime.now().plusDays(1);
        LocalDateTime arrival1 = LocalDateTime.now().plusDays(2);
        Flight flight1 = new Flight("FL01", "Mumbai", "London", departure1, arrival1);

        LocalDateTime departure2 = LocalDateTime.now().plusDays(3);
        LocalDateTime arrival2 = LocalDateTime.now().plusDays(5);
        Flight flight2 = new Flight("FL02", "Gujarat", "Delhi", departure1, arrival1);

        airlineManagementSystem.addFlight(flight1);
        airlineManagementSystem.addFlight(flight2);

        //Create Aircraft
        Aircraft aircraft1 = new Aircraft("AIR01", "AKTY123", 200);
        Aircraft aircraft2 = new Aircraft("AIR02", "AKTY124", 250);

        airlineManagementSystem.addAircraft(aircraft1);
        airlineManagementSystem.addAircraft(aircraft2);

        // Search Flights
        List<Flight> result = airlineManagementSystem.searchFlights("Mumbai", "London", LocalDate.now().plusDays(1));
        System.out.println("Search result : ");
        result.forEach(flight -> 
            System.out.println("Flight: " + flight.getFlightNumber() + " - " 
            + flight.getSource() + " to " + flight.getDestination())
        );

        Seat seat = new Seat("25A", SeatType.ECONOMY);

        // Book a flight
        Booking booking = airlineManagementSystem.bookFlight(flight1, passenger1, seat, 100);
        if (booking != null) {
            System.out.println("Booking successful. Booking ID: " + booking.getBookingNumber());
        } else {
            System.out.println("Booking failed.");
        }

        // Cancel a booking
        airlineManagementSystem.cancelBooking(booking.getBookingNumber());
        System.out.println("Booking cancelled.");
    }
}
