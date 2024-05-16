import Air.IComponent;
import Air.Plane;
import Air.Wheel;
import Water.CargoShip;
import Water.Speedboat;
import vehicle.CombustionEngine;
import vehicle.ElectricEngine;
import vehicle.IEngine;

public class Runner {

    public static void main(String[] args) {

//        vehicle.IEngine hondaEngine = new vehicle.CombustionEngine(99, "01/01/2023");
//        Land.Car jazz = new Land.Car(1100.0f, 160, "hatchback", hondaEngine);
//
//        System.out.println(jazz.getHorsePower());
//
//        vehicle.IEngine electricEngine = new vehicle.ElectricEngine(1000, 100);
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

        System.out.println("----------Swapping engine---------------");

        IEngine electricEngine = new ElectricEngine(150, 80);
        bnta.setEngine(electricEngine);

        System.out.println(String.format("Water.Speedboat has %s horse power and its Hull Type is %s.", bnta.getHorsePower(), bnta.getHullType()));

        System.out.println("-------Extension------------------");

        IEngine boeing737max = new CombustionEngine(3000, "01/05/2024");
        IComponent tyre = new Wheel(6);
        Plane britishAirways = new Plane("boeing 737", tyre, boeing737max, 4520, 340_200);

        System.out.println(String.format("Our plane is %s. It takes off from %s. It has %d wheels, and has %d horsepower.", britishAirways.getType(), britishAirways.getAirport(), britishAirways.getNumberOfWheels(), britishAirways.getHorsePower()));

    }

}
