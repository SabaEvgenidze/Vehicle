package vehicle.license;

import org.apache.log4j.Logger;

public class ExceptionForAge {
    private static final Logger LOGGER = Logger.getLogger(ExceptionForAge.class);

    static void validate(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException();
        } else {
            LOGGER.info("You can take license!");
        }
    }

    public void limitAge() {
        try {
            validate(19);
        } catch (InvalidAgeException e) {
            LOGGER.info("your request is invalid!");
        }finally {
            LOGGER.info("This was costume exception!");
        }
    }

}

