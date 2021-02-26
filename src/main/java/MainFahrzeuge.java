import java.awt.*;

public class MainFahrzeuge {
    public static void main(String[] args) {
        Garage garage = new Garage(40);
        garage.addVehicle(new Car("Mclaren", 650, 6, 2, Color.ORANGE, 2,20));
        garage.addVehicle(new Motorcycle("Yamaha", 150, 2, 1, Color.BLACK,5, "Street"));
        garage.addVehicle(new Motorcycle("Suzuki", 190, 1,4, Color.cyan,5, "superbike"));

        garage.printVehicles();
    }
}
