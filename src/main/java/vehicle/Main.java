package vehicle;

import interfacepack.IMove;
import interfacepack.ISpeed;
import interfacepack.IStart;
import enums.Model;
import enums.ManualCarEnum;
import vehicle.license.CarLicense;
import vehicle.license.ExceptionForAge;
import vehicle.vehicletypes.*;

import org.apache.log4j.Logger;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        pickup.speedForManual(ManualCarEnum.FIRST);


        //////////Polymorphism////////

        Vehicle truck = new Truck();
        move(truck);


        //////////////with generic//////////////////

        Van<String> van = new Van<>();
        van.setName("Mercedes");
        LOGGER.info(van.getName());

        //////////////Costume Exception/////////

        ExceptionForAge e = new ExceptionForAge();
        e.limitAge();


        ////////////lambda with generic example//////////

        IMove move1 = (name)->{LOGGER.info("This is example with parameter " + name);}; //with parameter
        move1.move("bumshaklaka");

        IStart start1 = () -> {LOGGER.info("hello!");};  //without parameter
        start1.start();

        ISpeed speed1 = (T) -> {LOGGER.info("this car is " + T);}; //with generic
        speed1.speed("SRT");


        //////////////Streams///////////////

        //Stream is used for Suv class
        List<Suv> type = getModel();


        //filter
        List<Suv> filter = type.stream().filter(year -> year.getModel().equals(Model.BMW)).collect(Collectors.toList());
        filter.forEach(LOGGER::info);


        //sort
        List<Suv> sort = type.stream().sorted(Comparator.comparing(Suv::getDateOfBirth)).collect(Collectors.toList());
        sort.forEach(LOGGER::info);


        //use sort and filter together
        List<Suv> mix = type.stream().filter(suv -> suv.getModel().equals(Model.NISSAN)).
                sorted(Comparator.comparing(Suv::getDateOfBirth)).collect(Collectors.toList());
        mix.forEach(LOGGER::info);
    }


    //For stream
    private static List<Suv> getModel(){
        return List.of(
            new Suv(2022, Model.BMW),
            new Suv(2012, Model.MERCEDES),
            new Suv(2021, Model.NISSAN),
            new Suv(1990, Model.TOYOTA),
            new Suv(1999, Model.JEEP)
        );
    }

}
