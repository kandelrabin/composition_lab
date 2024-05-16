public class Kayak extends Vehicle {

    private int numberOfPaddles;

    public Kayak(float weight, int maxSpeed, String hullType){
        super(weight, maxSpeed, hullType);
        this.numberOfPaddles = 1;
    }

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }
}
