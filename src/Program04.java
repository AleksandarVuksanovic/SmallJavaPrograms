import java.util.Scanner;

public class Program04 {
    public static void main (String [] Args) {

        //Potrebno je napraviti program koji ce ispitati godine korisnika i
        // da li ce korisnik moci da polaze za vozacku dozvolu.
        // Ako korisnik ima vise od 17 godina treba ispisati "Mozete polagati za vozacku dozvolu",
        // ako ima tacno 17 godina treba ispisati "Mozete polagati za vozacku dozvolu vec ove godine",
        // a ako ima manje od 17 treba ispisati "Mozete polagati za vozacku dozvolu za x godina"
        // gde je x promenljiva u zavisnosti koliko korisniku treba do 17 godina

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite koliko imate godina: ");
        int brojGodina = s.nextInt();

        if (brojGodina > 17) {
            System.out.println("Možete polagati za vozačku dozvolu");
        } else if (brojGodina == 17) {
            System.out.println("Možete polagati za vozačku dozvodlu ove godine");
        } else if (brojGodina < 17) {
        System.out.println("Možete polagati za vozačku dozvolu za " + (17 - brojGodina) + " godina");
        }

    }
}
