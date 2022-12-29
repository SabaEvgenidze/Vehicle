package vehicle.enginesystem;

public class Engine {
    private String cooling;
    public void setCooling(String cooling_system) {this.cooling = cooling;}
    public String getCooling() {
        return this.cooling;
    }

    private String starting_system;
    public void setStarting_system(String starting_system){
        this.starting_system=starting_system;
    }
    public String getStarting_system(){
        return starting_system;
    }

    private int torque;
    public void setTorque(int torque){this.torque=torque;}
    public int getTorque(){return this.torque;}

}
