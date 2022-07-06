import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        //Uneti dvocifren broj i prikazati prvu i drugu cifru

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dvocifreni broj: ");
        int broj = s.nextInt();

        int prvaCifra = broj/10;
        int drugaCifra = broj%10;

        System.out.println("Prva cifra je: " + prvaCifra + "\nDruga cifra je: " + drugaCifra);

    }
}
