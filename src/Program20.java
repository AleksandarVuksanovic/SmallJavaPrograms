import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {

    //FizzBuzz:
        //Napisati program koji za brojeve od 1 do 100 racuna sledece:
        //•	ako je broj deljiv sa 3 i sa 5 ispisuje "fizzbuzz" (plus ispisuje taj broj)
        //•	ako je broj deliv sa 3 ispisuje "fizz" (plus ispisuje taj broj)
        //•	ako je broj deljiv sa 5 izpisuje "buzz" (plus ispisuje taj broj)

        Scanner s = new Scanner(System.in);

        for (int i = 1; i<=100; i++) {
            if ((i%3 == 0) && (i%5 == 0)) {System.out.println("fizzbuzz " + i);}
            else if (i%5 ==0) {System.out.println("buzz " + i);}
            else if (i%3==0) {System.out.println("fizz " + i);}
        }





    }
}
