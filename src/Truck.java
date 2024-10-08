public class Truck extends Heavy{
    private double maxLoadingWeight;

    public Truck(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int countTrailers, double maxLoadingWeight) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, countTrailers);
        this.maxLoadingWeight = maxLoadingWeight;
    }

    public double getMaxLoadingWeight() {
        return maxLoadingWeight;
    }

    public void setMaxLoadingWeight(double maxLoadingWeight) {
        this.maxLoadingWeight = maxLoadingWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoadingWeight=" + maxLoadingWeight +
                '}';
    }
}
