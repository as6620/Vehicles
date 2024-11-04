public class Kibbutz {
    private Vehicles[] vehicle = new Vehicles[500];
    private int currentCars = 0;

    public Kibbutz() {
        currentCars = 0;
    }

    public void addCar(Vehicles vehicle){
        int counter = 0;
        for(Vehicles v: this.vehicle){
            if(v == null)
                this.vehicle[counter] = vehicle;
            counter++;
        }
    }

    public Vehicles[] Age15AndSteeringShape() {
        int counter = 0;
        for (Vehicles v : this.vehicle) {
            if (v.getAgeCar() > 15 && v.getSteeringShape())
                counter++;
        }

        Vehicles[] vehicles= new Vehicles[counter];
        counter = 0;
        for (Vehicles v : this.vehicle) {
            if (v.getAgeCar() > 15 && v.getSteeringShape()) {
                vehicles[counter] = v;
                counter++;
            }
        }
        return vehicles;
    }

    public int numCarAndLightVehiclesAndSteeringShape(){
        int counter = 0;
        for (Vehicles v : this.vehicle) {
            if (v instanceof Light && v.getSteeringShape())
                counter++;
            else if (v instanceof Car && v.getSteeringShape())
                counter++;
        }
        return(counter);
    }
}
