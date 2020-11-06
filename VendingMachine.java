import java.util.*;
import java.util.Map.Entry;

import Beverages.Beverage;
import Beverages.Coffee;
import Beverages.Tea;
import Utils.Transaction;


public class VendingMachine {
    List<Transaction> transactions;
    Map<String, Integer> stock;

    public VendingMachine(Map<String, Integer> stock){
        this.transactions = new ArrayList<Transaction>();
        this.stock =  stock;
    }

    public void dispense(Beverage beverage){
        //System.out.println(beverage.getClass().getSimpleName());
        if(this.IsStockSufficient(beverage.getClass())){
            Transaction transaction = new Transaction(beverage);
            transactions.add(transaction);
            beverage.serve();
            updateStock(beverage.getClass());
        }
        else{
            System.out.println("Insufficient Stock. Please Try Again Later.");
        }
    }
    public void refillStock(Map<String, Integer> stock){
        for (var entry : stock.entrySet()) {
            var ingredient = entry.getKey();
            var updatedValue = this.stock.get(ingredient) - entry.getValue();
            this.stock.put(ingredient, updatedValue);
        }
        
        System.out.println("The machine has been restocked successfully!");
    }

    private void updateStock(Class<? extends Beverage> cls) {
        Map<String, Integer> beverageRequirements = getBeverageRequirements(cls);

        for (var entry : beverageRequirements.entrySet()) {
            var ingredient = entry.getKey();
            var updatedValue = this.stock.get(ingredient) - entry.getValue();
            this.stock.put(ingredient, updatedValue);

            if(updatedValue == 0)
                System.out.println("The machine is out of " + ingredient);
        }
    }
    private Map<String, Integer> getBeverageRequirements(Class<? extends Beverage> cls){
        if (cls.getSimpleName().equals("Tea"))
            return Tea.requirements;

        // else if (cls.getSimpleName().equals("Coffee"))
        return Coffee.requirements;
    }
    private boolean IsStockSufficient(Class<? extends Beverage> cls) {
        Map<String, Integer> beverageRequirements = getBeverageRequirements(cls);

        for (Entry<String, Integer> entry : beverageRequirements.entrySet()) {
            if(this.stock.get(entry.getKey()) < entry.getValue())
                return false;
        }

        return true;
    }

    public void showHistory() {
        for (Transaction transaction : transactions) {
            transaction.display();
        }
    }
}
