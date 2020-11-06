package Beverages;

import java.util.Map;

import Beverages.Config.*;

public abstract class Beverage {
    BeverageConfig config;

    public Beverage(){   
        // Beverage.
     }
    public abstract void serve();

    @Override
    public abstract String toString();
}
