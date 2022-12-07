public class Animal {
    final String species;
    private Double weight;
    public static final double DEFOULT_WEIGHT_CAT = 5;
    public static final double DEFOULT_WEIGHT_DOG = 15;
    public static final double DEFOULT_WEIGHT_ANIMAL = 50;
    boolean isAlive = true;

    public Animal(String species) {
        this.species = species;
        if (species == "cat") {
            weight = (DEFOULT_WEIGHT_CAT);
        } else if (species == "dog") {
            weight = (DEFOULT_WEIGHT_DOG);
        }
    }

    void feed() {
        if (isAlive) {
            weight += 0.5;
        } else
            System.out.println("Trochę za pożno");
    }

    void takeForWalk() {
        if (!isAlive) {
            System.err.println("Wzywam Policję zamęczyłeś swoejgo zwierzaczka");
        } else {
            weight -= 0.5;
        }
        if (weight <= 0) {
            isAlive = false;
        } else {
            System.out.println("Dziękuję za spacer");
        }
    }
}
