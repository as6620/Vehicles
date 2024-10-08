public class Tractor extends Heavy{
    private String typesOfTrailers;

    public Tractor(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, int numCar1, int ageCar1, int quantityWheels1, int countTrailers, double pollutantEmissionsPerMinute1, String steeringShape1, String typesOfTrailers) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, numCar1, ageCar1, quantityWheels1, countTrailers, pollutantEmissionsPerMinute1, steeringShape1);
        this.typesOfTrailers = typesOfTrailers;
    }

    public String getTypesOfTrailers() {
        return typesOfTrailers;
    }

    public void setTypesOfTrailers(String typesOfTrailers) {
        this.typesOfTrailers = typesOfTrailers;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "typesOfTrailers='" + typesOfTrailers + '\'' +
                '}';
    }
}
