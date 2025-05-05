package onlineMovieTicketBookingSystem;

public class Movie {
    private final String Id;
    private final String title;
    private final String description;
    private final int durationInMinutes;

    public Movie(String Id, String title, String description, int durationInMinutes){
        this.Id = Id;
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
    }

    public String getId(){
        return this.Id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public int getDurationInMinutes(){
        return this.durationInMinutes;
    }
}
