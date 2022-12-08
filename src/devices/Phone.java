package devices;

public class Phone extends Device {
    public Phone(String producer, int yearOfProduction, String model) {
        super(producer, yearOfProduction, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon został uruchomiony");
    }

    @Override
    public String toString() {
        return "Phone " +
                "producer = " + producer +
                ", yearOfProduction = " + yearOfProduction +
                ", model = " + model;
    }
}
