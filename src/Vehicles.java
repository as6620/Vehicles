public class Vehicles{
    int numCar, ageCar, quantityWheels;
    double pollutantEmissionsPerMinute;
    String steeringShape;

    public Vehicles(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape) {
        this.numCar = numCar;
        this.ageCar = ageCar;
        this.quantityWheels = quantityWheels;
        this.pollutantEmissionsPerMinute = pollutantEmissionsPerMinute;
        this.steeringShape = steeringShape;
    }

    public int getNumCar() {
        return numCar;
    }

    public void setNumCar(int numCar) {
        this.numCar = numCar;
    }

    public int getAgeCar() {
        return ageCar;
    }

    public void setAgeCar(int ageCar) {
        this.ageCar = ageCar;
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    public double getPollutantEmissionsPerMinute() {
        return pollutantEmissionsPerMinute;
    }

    public void setPollutantEmissionsPerMinute(double pollutantEmissionsPerMinute) {
        this.pollutantEmissionsPerMinute = pollutantEmissionsPerMinute;
    }

    public String getSteeringShape() {
        return steeringShape;
    }

    public void setSteeringShape(String steeringShape) {
        this.steeringShape = steeringShape;
    }
}
