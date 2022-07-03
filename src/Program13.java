import java.sql.SQLOutput;
import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        //Napraviti petlju koja ce racunati sumu do N broja (N broj se unosi preko skenera)

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i < n; i++) {
            suma = suma + i;
        }
        System.out.println("Zbir unetih brojeva je: " + suma);
    }
}
