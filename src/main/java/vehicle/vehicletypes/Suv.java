package vehicle.vehicletypes;

import org.apache.log4j.Logger;
import enums.Model;

public class Suv extends Vehicle  {
    public static final Logger LOGGER = Logger.getLogger(Truck.class);

    private int date_of_birth;
    private Model model;

    public int getDateOfBirth(){return this.date_of_birth;}

    public Model getModel() {return model;}

    @Override
    public void move(){
        LOGGER.info("Suv isn't very fast!");
    }

    public Suv(int date_of_birth, Model model){
        this.date_of_birth = date_of_birth;
        this.model=model;
    }

    public String toString(){
        return "model:"+model+" year:"+ date_of_birth;
    }
}
