import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        //Napraviti for petlju koja ce da se pokrene 5 puta.
        // Svaki put ce traziti od korisnika da unese neki broj.
        // Ako korisnik unese 0 onda je potrebno ispisati "Bingo!"

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite broj ");
            int a = s.nextInt();

            if (a == 0) {
                System.out.println("Bingo!");
            }
        }


    }
}
