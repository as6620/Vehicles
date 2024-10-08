public class Bus extends Truck{
    private int numStopButtons;

    public Bus(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int countTrailers, double maxLoadingWeight, int numStopButtons) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, countTrailers, maxLoadingWeight);
        this.numStopButtons = numStopButtons;
    }

    public int getNumStopButtons() {
        return numStopButtons;
    }

    public void setNumStopButtons(int numStopButtons) {
        this.numStopButtons = numStopButtons;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numStopButtons=" + numStopButtons +
                '}';
    }
}
