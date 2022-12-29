package vehicle.vehicletypes;

public class Hatchback<T,S,D> extends Vehicle  {
    public Hatchback(T wheel, S model, D production, T bodyStyle, D length, D height, S transmission){
        super(wheel, model, production, bodyStyle, length, height, transmission);
    }
}
