import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {

        //Napisati program koji izracunava geometrijsku sumu parnih brojeva na neparnim indeksima

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dužinu niza: ");
        int n = s.nextInt();

        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite broj: ");
            niz[i] = s.nextInt();
        }

        double suma = 1;
        for (int i = 0; i < niz.length; i++) {
            if (i %2 != 0 && niz [i] % 2 == 0) {
                suma = suma * niz[i];
            }
        }

        System.out.println("Geometrijska suma unetih brojeva je: " + suma);


    }
}
