package Utils;
import java.time.LocalDateTime;
import Beverages.Beverage;

public class Transaction {
    private LocalDateTime time;
    private Beverage beverage;

    public Transaction(Beverage beverage){
        this.time = LocalDateTime.now();
        this.beverage = beverage;
    }
    public void display(){
        System.out.println(String.format("Time: %s ... %s", time, beverage));
    }

}
