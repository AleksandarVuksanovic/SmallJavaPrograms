import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika unosi godinu, zatim proveriti da li je godina prestupna.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int godina = s.nextInt();

        if (godina % 4 == 0) {
            System.out.println("Godina je prestupna");
        } else {
            System.out.println("Godina nije prestupna");
        }


    }
}
