package nagorski;


import nagorski.creatures.Human;

public interface Sellable {
   public void sell(Human seller, Human buyer, Double price);

}
