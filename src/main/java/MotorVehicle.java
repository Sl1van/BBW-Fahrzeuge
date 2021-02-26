import java.awt.*;

public abstract class MotorVehicle {
    private String manufacturer;
    private int power;
    private int seats;
    private int cylinders;
    private Color color;
    private int size;

    public MotorVehicle(String manufacturer, int power, int seats, int cylinders, Color color, int size) {
        this.manufacturer = manufacturer;
        this.power = power;
        this.seats = seats;
        this.cylinders = cylinders;
        this.color = color;
        this.size = size;
    }

    public void print() {
        System.out.println("manufacturer: " + manufacturer + "\npower: " + power + "\nseats: " + seats + "\n cylinders: " + cylinders + "\n color: " + color);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
