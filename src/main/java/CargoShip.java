public class CargoShip extends Vehicle {

    private int numberOfContainers;

    public CargoShip(float weight, int maxSpeed, int horsePower, String hullType, int numberOfContainers){
        super(weight, maxSpeed, horsePower, "steel");
        this.numberOfContainers = numberOfContainers;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
}
