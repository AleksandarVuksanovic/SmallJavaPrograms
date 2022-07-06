public class Program25 {
    public static void main(String[] args) {
        //Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu

        int [] niz1 = {1, 5, 10, 22, 23, 45, 19};
        int [] niz2 = {3, 11, 32, 23, 3, 59};


        int sumaNiza1 = 0;
        for (int i = 0; i < niz1.length; i++) {
            sumaNiza1 = sumaNiza1 + niz1[i];
        }

        int sumaNiza2 = 0;
        for (int i = 0; i < niz1.length; i++) {
            sumaNiza2 = sumaNiza2 + niz1[i];
        }

        if (sumaNiza1 > sumaNiza2) {
            System.out.println("Niz 1 ima veću sumu");
        } else {
            System.out.println("Niz 2 ima veću sumu");
        }

        if (niz1.length > niz2.length) {
            System.out.println("Niz 1 ima više članova");
        } else if (niz2.length > niz1.length) {
            System.out.println("Niz 2 ima više članova");
        } else {
            System.out.println("Nizovi imaju istu dužinu");
        }

    }
}
