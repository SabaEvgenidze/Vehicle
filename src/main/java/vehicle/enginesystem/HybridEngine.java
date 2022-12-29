package vehicle.enginesystem;

import org.apache.log4j.Logger;

public class HybridEngine extends Engine {

    private static final Logger LOGGER = Logger.getLogger(Engine.class);
    private String oil_system;

    public void setOil_system(String oil_system){
        this.oil_system=oil_system;
    }

    public String getOil_system(){
        return oil_system;
    }


    private String fuel_system;

    public void setFuel_system(String fuel_system){
        this.fuel_system=fuel_system;
    }

    public String getFuel_system(){
        return fuel_system;
    }

    private boolean battery;
    public void setBattery(boolean battery){this.battery=battery;}
    public boolean getBattery(){return this.battery;}

}
