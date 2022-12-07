public class Car {
    final String producer;
    final String model;
    private int capacity;
    private double value;

    public Car(String producer, String model, int capacity, double value) {
        this.producer = producer;
        this.model = model;
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
}
