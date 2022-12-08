import devices.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
//        cat.takeForWalk();
//        dog.takeForWalk();
//        dog.feed();
//        dog.feed();
        Human human1 = new Human();
////        human1.car = new devices.Car("BMW", "550li", 4800);
//        System.out.println("-------------");
        human1.setSalary(1500.0);
//        System.out.println(human1.getSalary());
        System.out.println("------------------");
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

        Car car1 = new Car("Audi","A4",2000,180000);
        Car car2 = new Car("Audi","A4",2000,180000);
        System.out.println(car2==car1);
        System.out.println(car2.toString());
        human1.setCar(car1,15000);
        human1.setPet(cat);
        System.out.println(human1.toString());
    }
}