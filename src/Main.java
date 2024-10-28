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


}