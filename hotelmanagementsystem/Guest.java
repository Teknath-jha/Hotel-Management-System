package hotelmanagementsystem;

public class Guest{
    private final String id;
    private final String name;
    private final String email;
    private final String phoneNumber;

    Guest(String id, String name, String email, String phoneNumber ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    String getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }

}