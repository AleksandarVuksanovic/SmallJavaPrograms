import java.time.LocalDate;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        //Test punoletnosti

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite godinu rođenja: ");
        int godinaRodjenja = s.nextInt();

        LocalDate localDate = LocalDate.now();
        int trenutnaGodina = localDate.getYear();

        if (trenutnaGodina - godinaRodjenja >= 18) {
            System.out.println("Vi ste punoletni");
        } else {
            System.out.println("Vi ste maloletni");
        }


    }
}

