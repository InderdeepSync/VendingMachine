package Beverages.Config;

import Utils.CoffeeType;

public class CoffeeConfig extends BeverageConfig {
    CoffeeType type;
    public CoffeeConfig(boolean withSugar, boolean withMilk, CoffeeType type){
        super(withSugar, withMilk);
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("%s Coffee %s", type, super.toString());
    }
}
