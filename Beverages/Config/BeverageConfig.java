package Beverages.Config;

public abstract class BeverageConfig {    
    boolean withSugar=false;
    final float volumeInMl=150;
    boolean withMilk=false;

    public BeverageConfig(boolean withSugar, boolean withMilk){        
        this.withSugar = withSugar;
        this.withMilk = withMilk;
    }

    public String getSugarLabel(){
        return this.withSugar?"with Sugar":"without Sugar";
    }

    public String getMilkLabel(){
        return this.withSugar?"with Milk":"without Milk";
    }

    @Override
    public String toString(){
        return String.format("%s %s", this.getSugarLabel(), this.getMilkLabel());
    }
}
