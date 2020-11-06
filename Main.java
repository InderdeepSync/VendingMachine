import java.util.HashMap;

import Beverages.*;

public class Main{
    public static void main(String args[]){
        
        HashMap<String, Integer> initialStock = new HashMap<>();
        initialStock.put("Tea", 4);
        initialStock.put("Coffee", 1);
        initialStock.put("Milk", 18);
        initialStock.put("Water", 18);
        initialStock.put("Sugar", 10);

        var machine = new VendingMachine(initialStock);

        var beverage1 = new Coffee();
        
        machine.dispense(beverage1);

        var beverage2 = new Tea();
        machine.dispense(beverage2);

        HashMap<String, Integer> additionalStock = new HashMap<>();
        additionalStock.put("Tea", 4);
        additionalStock.put("Coffee", 1);
        additionalStock.put("Milk", 18);
        additionalStock.put("Water", 18);
        additionalStock.put("Sugar", 10);

        machine.refillStock(additionalStock);
        
    }
}