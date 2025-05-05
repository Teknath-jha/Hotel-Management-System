package onlineMovieTicketBookingSystem.Seat;

public class Seat {
    private final String id;
    private final SeatType type;
    private  SeatStatus status;
    private final int row;
    private final int column;
    private final double price;

    public Seat(String id, SeatType type, SeatStatus status, int row, int column, double price){
        this.id = id;
        this.type = type;
        this.status = status;
        this.row = row;
        this.column = column;
        this.price = price;
    }

    public void setStatus(SeatStatus status){
        this.status = status;
    }
    public String getId(){
        return id;
    }
    public SeatType getSeatType(){
        return type;
    }
    public SeatStatus getSeatStatus(){
        return status;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public double getPrice(){
        return price;
    }
}
