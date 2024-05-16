public class Speedboat extends Vehicle implements IWaterVehicle, IEngine{

    private boolean needsCrew;
    private String hullType;
    private IEngine engine;

    public Speedboat(float weight, int maxSpeed, boolean needsCrew, IEngine engine){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.hullType = "fiberglass";
        this.engine = engine;
    }

    public boolean getNeedsCrew() {
        return this.needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
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
