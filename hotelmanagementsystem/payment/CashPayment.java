package hotelmanagementsystem.payment;

public class CashPayment implements Payment {
    
    @Override
    public boolean processPayment(double amount){
        System.out.println("Payment received in cash successfully!!!");
        return true;
    }
}
