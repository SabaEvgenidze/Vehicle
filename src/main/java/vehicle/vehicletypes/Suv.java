package vehicle.vehicletypes;

import org.apache.log4j.Logger;

public class Suv extends Vehicle  {
    public static final Logger LOGGER = Logger.getLogger(Truck.class);

    @Override
    public void move(){
        LOGGER.info("Suv isn't very fast!");
    }
}
