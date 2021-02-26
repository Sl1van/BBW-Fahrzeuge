import java.awt.*;

public class Motorcycle extends MotorVehicle {
    private String type;

    public Motorcycle(String manufacturer, int power, int seats, int cylinders, Color color, int size, String type) {
        super(manufacturer, power, seats, cylinders, color, size);
        this.type = type;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("type: " + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
