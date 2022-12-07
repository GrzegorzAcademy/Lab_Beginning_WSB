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
//        human1.car = new Car("BMW", "550li", 4800);
        System.out.println("-------------");
        human1.setSalary(1500.0);
        System.out.println(human1.getSalary());
        System.out.println("------------------");
//        human1.setCar(new Car("BMW", "550li", 4800));

//        System.out.println("Człowiek 1 ma auto : " + human1.getCar().producer +
//                " model : " + human1.getCar().model);

        human1.setCar(new Car("Bmw", "330", 3400, 150_000), 150_0000);
        System.out.println(human1.getCar().producer +
                " model : " + human1.getCar().model);
        System.out.println("---------");
        human1.setCar(new Car("Bmw", "330", 3400, 150000), 15000);
        System.out.println(human1.getCar().producer +
                " model : " + human1.getCar().model);
        System.out.println("---------");
        human1.setCar(new Car("Bmw", "330", 3400, 150000), 1500);
        System.out.println(human1.getCar().producer +
                " model : " + human1.getCar().model);
    }
}