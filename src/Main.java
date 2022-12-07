public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        cat.takeForWalk();
        dog.takeForWalk();
        dog.feed();
        dog.feed();
        Human human1 = new Human();
        human1.car = new Car("BMW","550li",4800);



    }
}