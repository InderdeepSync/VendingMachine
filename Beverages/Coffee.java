package Beverages;

import java.util.Map;

import Beverages.Config.CoffeeConfig;
import Utils.CoffeeType;

public class Coffee extends Beverage {
    public static Map<String, Integer> requirements = Map.of("Coffee", 1, "Milk", 1, "Water", 1, "Sugar", 1);
    
    public Coffee(){
        this.config = new CoffeeConfig(false, false, CoffeeType.AMERICANO);        
    }
    public Coffee(boolean withSugar, boolean withMilk, CoffeeType type){        
        this.config = new CoffeeConfig(withSugar, withMilk, type);        
    }
	@Override
	public void serve() {
        System.out.println(String.format("%s is served!", this));		
    }

    @Override
    public String toString(){
        return this.config.toString();
    }
}
