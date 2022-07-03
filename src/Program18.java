import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

       //Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
       // od prvog elementa niza do n gde je n poslednji element niza
       //napravite da se elementi niza i duzina niza ucitava preko skenera

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dužinu niza: ");
        int n = s.nextInt();

        int [] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite broj: ");
            niz [i] = s.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
        }

        System.out.println("Suma unetih brojeva je: " + suma);


    }
}
