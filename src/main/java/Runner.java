public class Runner {

    public static void main(String[] args) {

//        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
//        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);
//
//        System.out.println(jazz.getHorsePower());
//
//        IEngine electricEngine = new ElectricEngine(1000, 100);
//        jazz.setEngine(electricEngine);
//
//        System.out.println(jazz.getHorsePower());

        IEngine yamaha = new CombustionEngine(99, "16/05/2024");
        Speedboat bnta = new Speedboat(1000f,200, true, yamaha);
        IEngine propulsion = new CombustionEngine(1000, "14/03/1912");
        CargoShip titanic = new CargoShip(165_000_000f, 100, 37, propulsion);

        System.out.println(bnta.getHullType());
        System.out.println(bnta.getHorsePower());
        System.out.println(titanic.getHullType());
        System.out.println(titanic.getHorsePower());

        System.out.println("------");

        IEngine electricEngine = new ElectricEngine(150, 80);
        bnta.setEngine(electricEngine);

        System.out.println(String.format("Speedboat has %s horse power and its Hull Type is %s.", bnta.getHorsePower(), bnta.getHullType()));




    }

}
