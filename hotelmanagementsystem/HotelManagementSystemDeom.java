package hotelmanagementsystem;

import java.time.LocalDate;

import hotelmanagementsystem.payment.CashPayment;
import hotelmanagementsystem.payment.Payment;

public class HotelManagementSystemDeom {
    public static void main(String[] args) {
        run(args);  // Delegate to your run method
    }
    
    public static void run(String []args){
        HotelManagementSystem hotelManagementSystem = HotelManagementSystem.getInstance();

        // Create guest
        Guest guest1 = new Guest("G0001", "Teknath", "teknath@gmail.com", "1234567890" );
        Guest guest2 = new Guest("G0002", "Teknath", "teknath@gmail.com", "1234567890" );
        hotelManagementSystem.addGuest(guest1);
        hotelManagementSystem.addGuest(guest2);

        //Create Rooms
        Room room1 = new Room("R0001", RoomType.SINGLE_BED, 500.50);
        Room room2 = new Room("R0002", RoomType.DELUX, 500.50);
        hotelManagementSystem.addRoom(room1);
        hotelManagementSystem.addRoom(room2);

        // Book a room
        LocalDate checkInDate = LocalDate.now();
        LocalDate checkOutDate = checkInDate.plusDays(5);
        Reservation reservation1 = hotelManagementSystem.bookRoom(guest1, room1, checkInDate, checkOutDate);
        if( reservation1 != null ){
            System.out.println("Reservation created with id : " + reservation1.getId());
        } else {
            System.out.println("Room not available for booking.");
        }

        //Check-in
        hotelManagementSystem.checkIn(reservation1.getId());
        System.out.println("Checked in: " + reservation1.getId());

        //Check out and process payment
        Payment payment = new CashPayment();
        hotelManagementSystem.checkOut(reservation1.getId(), payment);
        System.out.println("Checked out: " + reservation1.getId());

        // Cancel a reservation
        hotelManagementSystem.canclReservation(reservation1.getId());
        System.out.println("Reservation cancelled: " + reservation1.getId());
    }
}
