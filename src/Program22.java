import java.util.Scanner;

public class Program22 {
    public static void main (String [] args) {

        // Zadatak 2 - Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        // ako ima sve petice program vrati poruku "Odlican djak",
        // ako nema sve petice vraca poruku "Nije odlican djak"

        Scanner s = new Scanner (System.in);

        int [] ocene = new int[5];
        for (int i = 0; i < ocene.length; i++) {
            System.out.println("Unesite ocenu: ");
            ocene[i] = s.nextInt();
        }

        int brojPetica = 0;
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 5) {brojPetica = brojPetica + 1;
            }
        }

        if (brojPetica == 5) {
            System.out.println("Odličan đak");
        } else {System.out.println ("Nije odličan đak");}





    }
}
