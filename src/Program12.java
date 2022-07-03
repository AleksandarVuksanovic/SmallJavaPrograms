public class Program12 {
    public static void main(String[] args) {
        //Pomnoziti sve parne brojeve od 1 do 10

        double proizvod = 1;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                proizvod = proizvod * i;
            }
        }
        System.out.println("Proizvod parnih brojeva od 1 do 10 je: " + proizvod);
    }
}
