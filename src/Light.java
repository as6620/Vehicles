public class Light extends Vehicles{
    private boolean isEngine;

    public Light(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, boolean isEngine) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape);
        this.isEngine = isEngine;
    }

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean engine) {
        isEngine = engine;
    }

    @Override
    public String toString() {
        return "Light{" +
                "isEngine=" + isEngine +
                '}';
    }
}
