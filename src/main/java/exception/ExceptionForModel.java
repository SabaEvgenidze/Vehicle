package exception;

import org.apache.log4j.Logger;

public class ExceptionForModel {
    private static final Logger LOGGER = Logger.getLogger(ExceptionForModel.class);

    static void validate(String model) throws ModelNameException{
        if(model.length() > 20){
            throw new ModelNameException();
        }else {
            LOGGER.info("you have a car!!!!");
        }
    }

    public void limitModelName(){
        try {
            validate("Mercedes");
        }catch(ModelNameException e){
            LOGGER.info(e);
        }
    }
}
