public class Heavy extends Vehicles {
    private int countTrailers;

    public Heavy(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int countTrailers) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape);
        this.countTrailers = countTrailers;
    }

    public int getCountTrailers() {
        return countTrailers;
    }

    public void setCountTrailers(int countTrailers) {
        this.countTrailers = countTrailers;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "countTrailers=" + countTrailers +
                '}';
    }
}