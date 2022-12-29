package vehicle.vehicletypes;

import org.apache.log4j.Logger;

public class Truck extends Vehicle  {
    public static final Logger LOGGER = Logger.getLogger(Truck.class);
    @Override
    public void move(){
        LOGGER.info("Truck is slow!");
    }
}
