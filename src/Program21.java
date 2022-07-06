public class Program21 {
    public static void main (String [] args) {

        //Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"

        String [] gradovi = {"Beograd", "Moskva", "London", "Pariz", "Prag", "Bogota", "Rejkjavik"};

        for (int i = 0; i < gradovi.length; i++) {
            if (!gradovi[i].equals("Prag")) {
                System.out.println(gradovi[i]);
            }
            }
        }

    }
