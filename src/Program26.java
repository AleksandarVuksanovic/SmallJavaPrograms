import java.util.Arrays;

public class Program26 {
    public static void main(String[] args) {

        //Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
        //koji ce sadrzati prva tri parna broja prvog niza

        int [] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int [] niz2 = new int[2];
        int index = 0;

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] % 2 == 0) {
                niz2[index] = niz1[i];
                index++;
            }
            if (index > 1) {
                break;
            }
        }

        System.out.println(Arrays.toString(niz2));


    }
}
