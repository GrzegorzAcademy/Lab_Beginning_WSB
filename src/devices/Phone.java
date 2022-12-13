package devices;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Phone extends Device {
    String nameAplication;
    String numberOfVersionAplication;
    String nameInVwersionOrAdresServerApliction;
    HttpURLConnection adresSerwer;

    public void installApp() {
        printMenu();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1 -> installApp1();
//            case 2 -> installApp2();
//            case 3 -> installApp3();
        }
        sc.close();
    }


    private void installApp1() {
        nameAplication = "Odtwarzacz muzyki";
        numberOfVersionAplication = "Odtwarzacz muzyki wersja 3.0 ";
        try {

           URL url1 = new URL("https://www.dobreprogramy.pl/3nity-media-player,program,windows,6628558891734657");
            System.out.println(url1);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    private static void printMenu() {
        System.out.println("Masz super wypasiony telefon :  ");
        System.out.println("Aby zainstalować pierwsza aplikację wciśnij 1");
        System.out.println("Aby zainstalować drugą aplikację wciśnij 2");
        System.out.println("Aby zainstalować trzecią aplikację wciśnij 3");
        System.out.println("zakończ program wciśnij 0 ");
    }

    public Phone(String producer, int yearOfProduction, String model) {
        super(producer, yearOfProduction, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon został uruchomiony");
    }

    @Override
    public String toString() {
        return "Phone " +
                "producer = " + producer +
                ", yearOfProduction = " + yearOfProduction +
                ", model = " + model;
    }
}
