package Water;

import vehicle.Vehicle;

public class Pedalboat extends Vehicle implements IWaterVehicle {


    private int numberOfSeats;
    private String hullType;

    public Pedalboat(float weight, int maxSpeed, String hullType){
        super(weight, maxSpeed);
        this.hullType = hullType;
        this.numberOfSeats = 3;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }

}
