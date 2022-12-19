package nagorski.devices;

public class Lpg extends Car{
    public Lpg(String producer, String model, int yearOfProduction, int capacity, double value) {
        super(producer, model, yearOfProduction, capacity, value);
    }

    @Override
    void refuel() {

    }
}
