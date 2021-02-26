import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<MotorVehicle> motorVehicles = new ArrayList<>();
    private int size;

    public Garage(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addVehicle(MotorVehicle vehicle) {
        int currentSizeUsed = motorVehicles.stream().mapToInt(MotorVehicle::getSize).sum();

        if (currentSizeUsed + vehicle.getSize() < size) {
            motorVehicles.add(vehicle);
        } else {
            System.out.println("This vehicle is too big for the garage");
        }
    }

    public void printVehicles() {
        motorVehicles.forEach(MotorVehicle::print);
    }
}
