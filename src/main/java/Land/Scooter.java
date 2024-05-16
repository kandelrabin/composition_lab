package Land;

import vehicle.Vehicle;

public class Scooter extends Vehicle implements ILandVehicle {

    private boolean hasBreaks;
    private int numberOfWheels;

    public Scooter(float weight, int maxSpeed, boolean hasBreaks){
        super(weight, maxSpeed);
        this.hasBreaks = hasBreaks;
        this.numberOfWheels = 2;
    }

    public void doTailWhip(){
        System.out.println("Doing some rad moves");
    }

    public boolean getHasBreaks(){
        return this.hasBreaks;
    }

    public void setHasBreaks(boolean hasBreaks){
        this.hasBreaks = hasBreaks;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfwheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}
