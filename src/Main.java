import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo,boy,indeks;

        Scanner input = new Scanner(System.in).useLocale(Locale.FRANCE);


        System.out.println("Lütfen Kilonuzu Giriniz :");
        kilo = input.nextDouble();

        System.out.println("Lütfen Boyunuzu Giriniz :");
        boy = input.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.println(indeks);


    }
}
