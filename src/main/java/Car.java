import java.awt.*;

public class Car extends MotorVehicle {
    private int doors;

    public Car(String manufacturer, int power, int seats, int cylinders, Color color, int size, int doors) {
        super(manufacturer, power, seats, cylinders, color, size);
        this.doors = doors;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("doors: " + doors);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
