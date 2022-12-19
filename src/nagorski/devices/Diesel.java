package nagorski.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, int yearOfProduction, int capacity, double value) {
        super(producer, model, yearOfProduction, capacity, value);
    }

    @Override
    void refuel() {

    }
}
