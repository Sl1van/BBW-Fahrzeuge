import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<MotorVehicle> motorVehicles = new ArrayList<>();
    private int areaSize;

    public Garage(int size) {
        this.areaSize = size;
    }

    public void addVehicle(MotorVehicle vehicle) {
        if (getAreaAvailable() >=vehicle.getSize()) {
            motorVehicles.add(vehicle);
        } else {
            System.out.println("This vehicle is too big for the garage");
        }
    }

    public int getAreaSize(){
        return areaSize;
    }

    public void setAreaSize(int areaSize) {
        this.areaSize = areaSize;
    }

    public int getAreaAvailable(){
        return areaSize - motorVehicles.stream().mapToInt(MotorVehicle::getSize).sum();
    }

    public int getAreaUsed(){
        return motorVehicles.stream().mapToInt(MotorVehicle::getSize).sum();
    }

    public void printVehicles() {
        motorVehicles.forEach(MotorVehicle::print);
    }
}
