package vehicle.vehicletypes;

public class Van<T> extends Vehicle {
    private T name;

    public void setName(T name){
        this.name=name;
    }
    public T getName(){return this.name;}
}
