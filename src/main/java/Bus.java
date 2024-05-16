public class Bus extends Vehicle implements ILandVehicle, IEngine {

    // the bus is a Land Vehicle - no property
    // the bus has an Engine - make it a property - so add IEngine to make it Enginable
    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 8;
        this.engine = engine;
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfwheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // getter from engine property - composition
    public IEngine getEngine(){
        return this.engine;
    }

    // setter for engine property - composition
    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    // asking engine component to get the horsepower
    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    // asking engine component to set a new horsepower
    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }


}
