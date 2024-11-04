public class Main {
    public double pollutants(Vehicles[] vehicle){
        for(Vehicles v: vehicle){
            return(v.getPollutantEmissionsPerMinute() * 1440);
        }
    }
    public void intensityNoise(Vehicles[] vehicle) {
        for(Vehicles v: vehicle){
            if (v instanceof Regular)
                ((Regular) v).noise();
        }
    }

    public int numPassengers(Vehicles[] vehicle){
        int counter = 0;
        for(Vehicles v: vehicle){
            if (v instanceof Bicycle){
                if (((Bicycle) v).isBasket())
                    counter++;
            }
            else if (v instanceof Regular){
                counter += 4;
            }
        }
        return(counter);
    }

    public double ChargingTime(Vehicles[] vehicle){
        int numCar;
        double temp, maxCharge;

        for(Vehicles v: vehicle){
            if(v instanceof Cart){
                maxCharge = ((Cart) v).getChargeTime();
                if(temp < maxCharge){
                    temp = maxCharge;
                    numCar = v.getNumCar();
                }
            }
        }
        return(numCar);
    }

    public int getVehicleWithMaxChargingTime(Vehicles[] vehicles) {
        int numCarWithMaxCharge;
        double maxChargeTime = 0;

        for (Vehicles v : vehicles) {
            if (v instanceof Cart) {
                Cart cart = (Cart) v;
                double chargeTime = cart.getChargeTime();

                if (chargeTime > maxChargeTime) {
                    maxChargeTime = chargeTime;
                    numCarWithMaxCharge = cart.getNumCar();
                }
            }
        }
        return numCarWithMaxCharge;
    }

}