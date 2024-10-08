public class Bicycle extends Light{
    private boolean isBasket;

    public Bicycle(int numCar, int ageCar, int quantityWheels, double pollutantEmissionsPerMinute, String steeringShape, boolean isEngine, boolean isBasket) {
        super(numCar, ageCar, quantityWheels, pollutantEmissionsPerMinute, steeringShape, isEngine);
        this.isBasket = isBasket;
    }

    public boolean isBasket() {
        return isBasket;
    }

    public void setBasket(boolean basket) {
        isBasket = basket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "isBasket=" + isBasket +
                '}';
    }
}
