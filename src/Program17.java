import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {

        //Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu
        // dok korisnik ne unese negativan broj – preko do while

        Scanner s = new Scanner(System.in);

        int suma = 0;

        int i = 0;
        do {
            System.out.println("Unesite broj: ");
            int a = s.nextInt();
            suma = suma + i;
            i = a;
        } while (i >=0);

        System.out.println("Zbir unetih brojeva je: " + suma);


    }
}
