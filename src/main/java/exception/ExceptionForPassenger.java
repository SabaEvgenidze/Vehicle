package exception;

import org.apache.log4j.Logger;
import vehicle.vehicletypes.Sedan;

public class ExceptionForPassenger {
    private static final Logger LOGGER = Logger.getLogger(ExceptionForModel.class);

    static void validate(int amount) throws PassengerAmountException{
        if(amount>5){
            throw new PassengerAmountException();
        }else {
            LOGGER.info("yuu can sit :)");
        }
    }
    public void limitPassenger(){
        try{
            validate(7);
        }catch (PassengerAmountException e){
            LOGGER.info("They are too many! ;)");
        }
    }
}
