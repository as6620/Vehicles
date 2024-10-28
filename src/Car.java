public class Car extends Regular{
    private String color;

    public Car(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int numberOfPassengers, String color) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, numberOfPassengers);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
