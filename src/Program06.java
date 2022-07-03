import java.util.Scanner;

public class Program06 {
    public static void main (String [] Argds) {
        //1.Napisati program koji za ulaz od korisnika prima 3 decimalna broja. Na konozolu ispisati
        //najveci broj.

        //2.Napisati program koji kao ulaz prima ceo broj. Kao izlaz ispisati da li broj pozitivan,
        //negativan ili nula.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double a = s.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double b = s.nextDouble();
        System.out.println("Unesite treći broj: ");
        double c = s.nextDouble();
        if (a > b && a > c) {
            System.out.println("Najveći broj je " + a);
        } else if (b > a & b > c) {
            System.out.println("Najveći broj je " + b);
        } else {
            System.out.println("Najveći broj je " + c);
        }


        System.out.println("Unesite ceo broj: ");
        double x = s.nextDouble();

        if (x > 0) {
            System.out.println("Uneti broj je pozitivan");
        } else if (x == 0) {
            System.out.println("Uneti broj je nula");
        } else {
            System.out.println("Uneti broj je negativan");
        }


    }
}
