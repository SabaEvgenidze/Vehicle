package vehicle;

import interfacepack.IMove;
import interfacepack.ISpeed;
import vehicle.enumforgearbox.ManualCarEnum;
import vehicle.license.CarLicense;
import vehicle.license.ExceptionForAge;
import vehicle.vehicletypes.*;
import org.apache.log4j.Logger;

public class Main {

    /////LOGGER////////
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    ///////////For polymorphism///////////////
    private static void move(Vehicle v){v.move();}


    ////////////////MAIN Method////////////
    public static void main(String [] argv){

        //////////HASH MAP/////////

        CarLicense car = new CarLicense();
        car.car_license();


        ////////////With Enum////////////

        Pickup pickup = new Pickup();
        pickup.speed_for_manual(ManualCarEnum.FIRST);


        /////////////With generic//////////

        Military <String> military = new Military <>("Tank");
        military.getType();


        ///////////Interface//////////

        military.attack("Tank");


        //////////Polymorphism////////
        Vehicle truck = new Truck();
        move(truck);


        //////////////Costume Exception/////////

        ExceptionForAge e = new ExceptionForAge();
        e.limitAge();


        ////////////lambda with generic example//////////

        ISpeed speed1 = (T) -> {LOGGER.info("this car is extremely fast");}; //T String
        speed1.speed("blablabbla");

        IMove move1 = (name)->{LOGGER.info("This is example with parameter " + name);}; //with parameter
        move1.move("bumshaklaka");
    }
}
