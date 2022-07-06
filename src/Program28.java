public class Program28 {
    public static void main(String[] args) {
        //Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao

        int [] niz = {10, 20, 15, 15, 50, 23, 65, 4, 11, 29};


        int suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
            if (suma > 100) {
                System.out.println("Prešli ste granicu za " + (suma - 100));
                break;
            }
        }

    }
}
