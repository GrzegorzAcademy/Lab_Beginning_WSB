package devices;


public class Car extends Device {


    private int capacity;
    private double value;

    public Car(String producer, String model, int yearOfProduction, int capacity, double value) {
        super(producer, yearOfProduction, model);
        this.capacity = capacity;
        this.value = value;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód został uruchomiony");
    }

    @Override
    public String toString() {
        return "Car " +
                "capacity = " + capacity +
                ", value=" + value +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", model='" + model;
    }

}

