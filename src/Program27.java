public class Program27 {
    public static void main(String[] args) {
        //Napraviti niz i prikazati njegov najveci i najmanji clan

        int [] niz = {10, 4, 5, 6, 7, 9, 10, 12, 28, 37, 22, 2, 35, 47, 21};

        int max = 0;
        int min = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if ( niz[i] > max) {
                max = niz[i];
            }
            if (niz[i] < min) {
                min = niz[i];
            }
        }

        System.out.println("Najveći član niza je " + max);
        System.out.println("Najmanji član niza je " + min);


    }
}
