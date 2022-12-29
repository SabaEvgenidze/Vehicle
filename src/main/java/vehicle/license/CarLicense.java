package vehicle.license;
import org.apache.log4j.Logger;
import java.util.HashMap;

public class CarLicense {
    private static final Logger LOGGER = Logger.getLogger(CarLicense.class);
    public void car_license(){
        HashMap <String, String> license = new HashMap<>();
        license.put("Category B", "You can drive vehicle and trailer");
        license.put("Category B1", "You can drive motor vehicles");
        license.put("Category C", "You can drive medium and large size vehicle");
        license.put("Category D", "You can drive Bus and Minibus");

        LOGGER.info(license.get("Category D"));
    }


}


