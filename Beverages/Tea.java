package Beverages;

import Utils.TeaType;

import java.util.Map;

import Beverages.Config.*;

public class Tea extends Beverage {  
    public static Map<String, Integer> requirements = Map.of("Tea", 1, "Milk", 1, "Water", 1, "Sugar", 1);
    public Tea(){
        this.config = new TeaConfig(false, false, TeaType.NORMAL);
    }
    public Tea(boolean withSugar, boolean withMilk, TeaType type){        
        this.config = new TeaConfig(withSugar, withMilk, type);
    }

    @Override
    public void serve() {        
        System.out.println(String.format("%s is Served!", this));
    }    

    @Override
    public String toString(){
        return this.config.toString();
    }
}
