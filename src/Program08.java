import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {

        // Preko skenera uneti tri broja.
        // Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu,
        // ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze,
        // ako se unese 4 onda se dele

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = s.nextInt();

        System.out.println("Unesite drugi broj: ");
        double b = s.nextDouble();

        System.out.println("Unesite treći broj: ");
        double c = s.nextDouble();

        switch (a) {
            case 1:
                System.out.println(b+c);
                break;
            case 2:
                System.out.println(b-c);
                break;
            case 3:
                System.out.println(b*c);
                break;
            case 4:
                System.out.println(b/c);
                break;
            default:
                System.out.println("Neispravni podaci");
                break;
        }


    }
}
