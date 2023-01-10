package exception;

import org.apache.log4j.Logger;

public class ExceptionForSpeed {
    private static final Logger LOGGER = Logger.getLogger(ExceptionForModel.class);
    static void validate(int speed) throws SpeedLimitException{
        if(speed>90){
            throw new SpeedLimitException();
        }else {
            LOGGER.info("Your speed is acceptable");
        }
    }

    public void speedLimit(){
        try {
            validate(180);
        }catch (SpeedLimitException e){
            LOGGER.info(e);
        }
    }
}
