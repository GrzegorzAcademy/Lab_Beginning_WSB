package nagorski.creatures;

import nagorski.devices.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    private Double cash;

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    LocalDateTime now = LocalDateTime.now();
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;

    }

    Animal pet;
    private Double salary;


    public void setSalary(Double salary) {
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy : HH/mm/ss")));
        if (salary > 0) {
            System.out.println("Nowe dane zostały wpisane do systemu księgwego");
            System.out.println("Prosze odebrać aneks do umowy z działu kadr");
            System.out.println("ZUS i US zoatały poinformowane o zmianach ");
            this.salary = salary;
        } else if (salary <= 0) {
            System.out.println("Daj żyć, wypłata musi być wieksza od zera");
        }
    }


    public Double getSalary() {
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car, double salary) {
        if (salary >= car.getValue()) {
            System.out.println("kupiłeś auto za gotówkę");
            this.car = car;
        } else if (salary >= car.getValue() / 12) {
            System.out.println("kupiłeś auto na raty");
            this.car = car;
        } else
            System.out.println("zapisz sie na studia, lub poproś szefa o podwyzkę");
    }

    @Override
    public String toString() {
        return "pet=" + pet.species +
                ", salary=" + salary +
                '}';
    }
}

