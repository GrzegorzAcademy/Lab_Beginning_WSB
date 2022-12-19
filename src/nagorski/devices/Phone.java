package nagorski.devices;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Phone extends Device {
    String nameAplication;
    String numberOfVersionAplication;
static final URL  url_1;
static final URL url_2;
//static final URL url_3;
    static {
        try {
            url_1 = new URL("https://www.dobreprogramy.pl/3nity-media-player,program,windows,6628558891734657");
            url_2 = new URL("https://play.google.com/store/apps/details?id=com.dts.freefireth");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    public void installApp() {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            printMenu();
            number = sc.nextInt();
            switch (number) {
                case 1 -> installApp1();
            case 2 -> installApp2();
//            case 3 -> installApp3();
                default -> {
                    System.out.println("Goodbay");
                }
            }
        }
        while (number != 0);
    }

    private void installApp2() {
        nameAplication = "Garena Free Fire: Winterlands";
        numberOfVersionAplication = "Game 1.0";
        URL url_12 = url_2;
        System.out.println(url_2);
    }


    private void installApp1() {
        nameAplication = "Odtwarzacz muzyki";
        numberOfVersionAplication = "Odtwarzacz muzyki wersja 3.0 ";
        URL url_11 = url_1;
        System.out.println(url_1);
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
