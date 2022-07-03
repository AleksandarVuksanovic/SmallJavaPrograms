import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        //Uneti 5 brojeva unutar petlje i prikazati najveci

        Scanner s = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite broj ");
            int a = s.nextInt();
            if (a > max) {
                max = a;
            }
        }
        System.out.println("Najveći broj je: " + max);
    }
}
