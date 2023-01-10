package vehicle.vehicletypes;

import interfacepack.IAttack;
import org.apache.log4j.Logger;

public class Military<T> extends Vehicle implements IAttack {
    private static final Logger LOGGER = Logger.getLogger(Military.class);
    private T type;

    public void setType(T type){this.type=type;}
    public T getType(){return this.type;}

    @Override
    public void attack(String name){}

}
