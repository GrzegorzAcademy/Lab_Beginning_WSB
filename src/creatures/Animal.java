package creatures;

abstract class Animal implements Sellable,Feedable {

    Double foodWeight;
    final String species;
    private Double weight;
    public static final double DEFOULT_WEIGHT_CAT = 5;
    public static final double DEFOULT_WEIGHT_DOG = 15;
    public static final double DEFOULT_WEIGHT_ANIMAL = 50;
    boolean isAlive = true;

    public Double getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(Double foodWeight) {
        this.foodWeight = foodWeight;
    }

    public Animal(String species) {
        this.species = species;
        if (species.equals("cat")) {
            weight = (DEFOULT_WEIGHT_CAT);
        } else if (species.equals("dog")) {
            weight = (DEFOULT_WEIGHT_DOG);
        }
    }

    public void feed() {
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

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }


    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != null) {
            if (buyer.getCash() > price)
                seller.setCash(seller.getSalary() - price);
            buyer.setCash(buyer.getSalary() + price);
            buyer.setPet(seller.pet);
            seller.setPet(null);
            System.out.println("transakcja została dokonana : ");
            System.out.println("zwierzę zamieniło właściciela ");
            System.out.println("stan konta kupującego po transakcji " + seller.getCash()+ " zł" + " \n"
                    + "Stan konta sprzedającego po transakcji " + buyer.getCash() + " zł");
        }

    }
}
