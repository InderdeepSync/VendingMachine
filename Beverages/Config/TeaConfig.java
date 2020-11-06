package Beverages.Config;

import Utils.TeaType;

public class TeaConfig extends BeverageConfig {
    TeaType type;
    public TeaConfig(boolean withSugar, boolean withMilk, TeaType type){
        super(withSugar ,withMilk);
        this.type = type;
    }

    @Override
    public String toString(){
        return String.format("%s Tea %s", type, super.toString());
    }
}
