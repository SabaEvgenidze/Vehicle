package exception;

import org.apache.log4j.Logger;
import enums.Weather;

public class ExceptionForWeather {
    private static final Logger LOGGER = Logger.getLogger(ExceptionForModel.class);
    static void validate(Weather w) throws BadWeatherException {
        if (w.equals(Weather.FROST)){
            throw new BadWeatherException();
        }else {
            LOGGER.info("you can go");
        }
    }

    public void badWeather(){
        try {
            validate(Weather.SUNNY);
        }catch (BadWeatherException e){
            LOGGER.info(e);
        }
    }
}
