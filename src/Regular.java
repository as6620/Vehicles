public class Regular extends Vehicles{
    private int numberOfPassengers;

    public Regular(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int numberOfPassengers) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public double exhaust() {
        return 100;
    }

    public void noise(){
        System.out.println("loud noise!");
    }

    public int hitchhikers(){
        return (4);
    }

    @Override
    public String toString() {
        return "Regular{" +
                "numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}
