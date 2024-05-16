package Air;

public class Wheel implements IComponent{

    private int numberOfWheels;

    public Wheel(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}
