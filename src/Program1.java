import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        //Preko skenera uneti dva broja i odstampati aritmeticku sredinu unetih brojeva

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = s.nextInt();

        System.out.println("Unesite drugi broj: ");
        int b = s.nextInt();

        double c = (a+b) / 2.0;
        System.out.print("Aritmerička sredina unteih brojeva je: " + c);


    }
}
