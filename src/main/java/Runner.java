public class Runner {

    public static void main(String[] args) {

        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);

        System.out.println(jazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1000, 100);
        jazz.setEngine(electricEngine);

        System.out.println(jazz.getHorsePower());

    }

}
