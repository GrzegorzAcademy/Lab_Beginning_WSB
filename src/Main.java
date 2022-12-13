
import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        Animal cat = new Animal("cat");
//        Animal dog = new Animal("dog");
//        cat.takeForWalk();
//        dog.takeForWalk();
//        dog.feed();
//        dog.feed();
//        Human human1 = new Human();
//        human1.car = new devices.Car("BMW", "550li", 4800);
//        System.out.println("-------------");
//        human1.setSalary(1500.0);
//        System.out.println(human1.getSalary());
//        System.out.println("------------------");
//        human1.setCar(new devices.Car("BMW", "550li", 4800));

//        System.out.println("Człowiek 1 ma auto : " + human1.getCar().producer +
//                " model : " + human1.getCar().model);

//        human1.setCar(new devices.Car("Bmw", "330", 3400, 150_000), 150_0000);
//        System.out.println(human1.getCar().producer +
//                " model : " + human1.getCar().model);
//        System.out.println("---------");
//        human1.setCar(new devices.Car("Bmw", "330", 3400, 150000), 15000);
//        System.out.println(human1.getCar().producer +
//                " model : " + human1.getCar().model);
//        System.out.println("---------");
//        human1.setCar(new devices.Car("Bmw", "330", 3400, 150000), 1500);
//        System.out.println(human1.getCar().producer +
//                " model : " + human1.getCar().model);

//        Car car1 = new Car("Audi","A4",2012,180000,25000);
//        Car car2 = new Car("Audi","A4",2012,180000,25000);
//        System.out.println(car2==car1);
//        System.out.println(car2);
//        human1.setCar(car1,15000);
//        human1.setPet(cat);
//        System.out.println(human1);
        Car car = new Car("Audi", "A4", 2012, 1800, 25000);
        System.out.println(car);
        car.turnOn();
        Phone phone1 = new Phone("Nokia", 2020, "3320");
        phone1.turnOn();
        System.out.println(phone1);
        Human human1 = new Human();
        human1.setSalary(25000.0);
//        Animal animal = new Animal("Cat");
        human1.setCash(25000.0);
//        human1.setPet(animal);
        System.out.println(human1.getCash());
        System.out.println(human1.getSalary());
        Human human2 = new Human();
        human2.setCash(12000.0);
        human2.setSalary(20000.0);
        human2.getCash();

//        animal.sell(human1, human2, 200.0);
        System.out.println("---------");

    }
}