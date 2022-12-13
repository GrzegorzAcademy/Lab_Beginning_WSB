package devices;

public  abstract class Device {
    final String producer;
    final int yearOfProduction;
    final String model;

    Device(String producer, int yearOfProduction, String model) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }
 abstract void turnOn();

    @Override
    public String toString() {
        return "producer='" + producer + '\'' +
                ", model='" + +'\'' +
                ", year of production" + yearOfProduction;
    }
}
