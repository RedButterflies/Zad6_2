//Napisz metodę pobierającą od użytkownika liczbę zmiennoprzecinkową, rozdzielającą
//liczbę na cechę oraz mantysę, a następnie zwracającą iloraz cechy i mantysy. W przypadku,
//gdy nie jest to możliwe wypisz komunikat i ponów pobieranie liczby. Załóż, że użytkownik
//może wprowadzić dowolny znak.

import java.util.Scanner;

public class PobieranieLiczbyRzeczywistej {
    static void liczbaRzeczywista() {
        while (1 == 1) {

            try {
                System.out.println("Wprowadz liczbe zmiennoprzecinkowa: ");
                Scanner zmiennoprzecinkowa = new Scanner(System.in);
                String liczba = zmiennoprzecinkowa.next().toString();

                String[] tablica;
                tablica = liczba.split("\\.");
                double cecha = Double.parseDouble(tablica[0]);
                double mantysa = Double.parseDouble(tablica[1]);
                System.out.println("cecha: " + cecha);
                System.out.println("mantysa: " + mantysa);
                if (mantysa == 0) {
                    throw new ArithmeticException("Mantysa nie moze byc zerem, wprowadz inna liczbe sprobuj ponownie");
                }
                System.out.println("Iloraz cechy i mantysy: " + cecha / mantysa);break;

            } catch (NumberFormatException e) {
                System.err.println("Wprowadzono znak, ktory nie jest liczba, sprobuj ponownie");
            }
        }
    }
}
