import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.CargoShip;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {
        // Cargo ship
        IEngine combustionEngine = new CombustionEngine(20000,"01/01/2024");
        CargoShip bigCargoShip = new CargoShip(1300,150,100, "v-shape", combustionEngine);
        System.out.println(bigCargoShip.getHorsePower());

        IEngine electricEngine = new ElectricEngine(40000,100);
        bigCargoShip.setEngine(electricEngine);
        System.out.println(bigCargoShip.getHorsePower());


        // Speed boat
        Speedboat speedboat = new Speedboat(1300,150,true, "u-shape", combustionEngine);
        System.out.println(speedboat.getHorsePower());

        speedboat.setEngine(electricEngine);
        System.out.println(speedboat.getHorsePower());
    }

}
