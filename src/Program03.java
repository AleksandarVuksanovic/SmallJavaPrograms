import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
    //Zadatak: BonusCalcualtor
        //Uneti 2 broja: broj uspesnih prodaja broj i platu
        //ukoliko je broj uspesnih prodaja veci ili jednak od 10 ispisati novu platu sa bonusom od 20%
        //ukolko je broj uspesnih prodaja veci ili jednak od 5 ispisati novu platu sa bonusom od 10%
        //ukoliko je broj uspesnih prodaja veci ili jednak od 2 ispisati novu platu sa bonusom od 5%
        //ukoliko je broj uspesnih prodaja veci ili jednak od 1 ispisati novu platu sa bonusom od 1%
        //inace napisati "niste nista prodali, otpusteni ste"

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj prodaja: ");
        int brojProdaja = s.nextInt();

        System.out.println("Unesite vašu platu: ");
        int plata = s.nextInt();

        if (brojProdaja >= 10) {
            System.out.println("Vaša nova plata je: " + plata * 1.2);
        } else if (brojProdaja >= 5) {
            System.out.println("Vaša nova plata je: " + plata * 1.1);
        } else if (brojProdaja >= 2) {
            System.out.println("Vaša nova plata je " + plata * 1.05);
        } else if (brojProdaja >= 1) {
            System.out.println("Vaša nova plata je " + plata * 1.01);
        } else {
            System.out.println("Ništa niste prodali, otupšteni ste :(");
        }




    }
}
