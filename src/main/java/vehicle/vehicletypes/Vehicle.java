package vehicle.vehicletypes;

import enums.AutomaticCarEnum;
import enums.ManualCarEnum;
import org.apache.log4j.Logger;

// T int
// S String
// D double
public abstract class Vehicle <T, S, D>   {
    private static final Logger LOGGER = Logger.getLogger(Vehicle.class);

    private T wheel;

    public void setWheel(T wheel){this.wheel=wheel;}

    public T getWheel(){return this.wheel;}

    /////// model /////////
    private S model;

    public S getModel(){return this.model;}
    public void setModel(S model){this.model=model;}

    ///////// date //////////

    private D production;

    public void setProduction(D production){this.production=production;}

    public D getBirth(){return this.production;}

    ////////////////////

    private T bodyStyle;

    public void setBodyStyle(T bodyStyle){this.bodyStyle=bodyStyle;}

    public T bodyStyle(){return this.bodyStyle;}

    ////////size///////////

    private D length;
    private D height;

    public void setLength(D length){this.length=length;}

    public D getLength(){return this.length;}

    public void setHeight(D height){this.height=height;}

    public D getHeight(){return this.height;}

    //////// automatic or manual ///////////////

    private S transmission;

    public void setTransmission(S transmission){this.transmission=transmission;}

    public S getTransmission(){return this.transmission;}

    public Vehicle(){}
    public Vehicle(T wheel){
        this.wheel=wheel;
    }

    public Vehicle(T wheel, S model, D production, T bodyStyle, D length, D height, S transmission){
        this.wheel=wheel;
        this.model=model;
        this.production=production;
        this.bodyStyle=bodyStyle;
        this.length=length;
        this.height=height;
        this.transmission=transmission;

    }

    //////////////////same method///////////////

    public void move(){
        LOGGER.info("Every vehicle can move!");
    }

    public void speedForAuto(AutomaticCarEnum auto){
        switch (auto){
            case DRIVE:
                LOGGER.info("Move!!");
                break;
            case NEUTRAL:
                LOGGER.info("You can't move!!");
                break;
            case REVERSE:
                LOGGER.info("Move back!!");
                break;
            case PARKING:
                LOGGER.info("Stop");
                break;
        }
    }
    public void speedForManual(ManualCarEnum manual){
        switch (manual){
            case FIRST:
                LOGGER.info("Too slow!");
                break;
            case SECOND:
                LOGGER.info("Slow");
                break;
            case THIRD:
                LOGGER.info("Medium speed");
                break;
            case FORTH:
                LOGGER.info("Fast");
                break;
            case FIFTH:
                LOGGER.info("Too fast");
                break;
            case SIXTH:
                LOGGER.info("Extremely fast");
                break;
        }
    }

}
