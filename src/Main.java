public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        cat.takeForWalk();
        dog.takeForWalk();
        dog.feed();
        dog.feed();


    }
}