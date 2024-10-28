public class Cart extends Light{
    private double chargeTime;

    public Cart(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, boolean isEngine, double chargeTime) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, isEngine);
        this.chargeTime = chargeTime;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public double exhaust() {
        return 0;
    }

    public int hitchhikers(){
        return (1);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "chargeTime=" + chargeTime +
                '}';
    }
}
