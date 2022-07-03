import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        //Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int suma = 0;

        int i = 1;
        while (i < n) {
            suma = suma + i;
            i++;
        }
        double aritmetickaSredina = suma / n;

        System.out.println("Aritmetička sredina unetih brojeva je: " + aritmetickaSredina);
    }
}
