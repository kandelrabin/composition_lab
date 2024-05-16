package Air;
import vehicle.IEngine;
import vehicle.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IComponent, IEngine {

    private String type;
    private int numberOfSeats;
    private IComponent component;
    private IEngine engine;
    private String airport;

    public Plane(String type, IComponent component, IEngine engine, int maxSpeed, float weight){
        super(weight, maxSpeed);
        this.type = type;
        this.numberOfSeats = 50;
        this.component = component;
        this.engine = engine;
        this.airport = "Heathrow";
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public String getAirport(){
        return this.airport;
    }

    public void setAirport(String airport){
        this.airport = airport;
    }

    // composition
    public IComponent getComponent(){
        return this.component;
    }

    public void setComponent(IComponent component){
        this.component = component;
    }

    public int getNumberOfWheels(){
        return this.component.getNumberOfWheels();
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.component.setNumberOfWheels(numberOfWheels);
    }

    public IEngine getEngine(){
        return this.engine;
    }

    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }



}
