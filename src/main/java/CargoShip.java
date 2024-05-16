public class CargoShip extends Vehicle implements IWaterVehicle, IEngine{

    private int numberOfContainers;
    private String hullType;
    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = "Steel";
        this.engine = engine;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }

    // getter for engine property
    public IEngine getEngine(){
        return this.engine;
    }

    // setter for engine property
    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    // asking engine to get horsepower
    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    // asking engine to set horsepower
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

}
