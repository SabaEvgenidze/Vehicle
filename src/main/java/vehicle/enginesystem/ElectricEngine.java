package vehicle.enginesystem;



public class ElectricEngine extends Engine{

    private String electric_engine;
    public void setElectric_engine(String electric_engine){this.electric_engine=electric_engine;}
    public String getElectric_engine(){return this.electric_engine;}

    public boolean battery;
    public void setBattery(boolean battery){this.battery=battery;}
    public boolean getBattery(){return this.battery;}

    public boolean charge_port;
    public void setCharge_port(boolean charge_port){this.charge_port=charge_port;}
    public boolean getCharge_port(){return this.charge_port;}

}
