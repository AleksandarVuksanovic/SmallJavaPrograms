import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        // Unositi brojeve sve dok se ne unesu dva ista broja za redom,
        // nakon toga prikazati sumu svih prethodno unetih brojeva

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        int suma = broj;
        int prethodniBroj;

        do {
            prethodniBroj = broj;
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            suma = suma + broj;
        } while (broj != prethodniBroj);

        System.out.println("Zbir unetih brojeva je: " + (suma - prethodniBroj));


    }
}
