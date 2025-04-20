package hotelmanagementsystem.payment;

public class CreditCardPayment implements Payment {
    
    @Override
    public boolean processPayment(double amount){
        System.out.println("Payment via credit card is successfully completed!!!");
        return true;
    }
}
