package Beverages;

public class Water{
    private boolean hot = false;

    public Water(){}
    public Water(boolean hot){
        this.hot = hot;
    }

    public String getTemperature(){
        return this.hot?"Hot":"Cold";
    }
    
    public void serve() {        
        System.out.println(String.format("%s is Served", this));
    }

    public Water cold(){
        this.hot=false;
        return this;
    }
    
    @Override
    public String toString(){
        return getTemperature() + " Water";
    }

}
