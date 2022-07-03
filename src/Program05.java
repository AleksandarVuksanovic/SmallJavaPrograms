import java.util.Scanner;

public class Program05 {
    public static void main (String [] Args) {

        //Imamo dve kockice ispred nas (plava i crvena),
        // preko skenera treba uneti koju kockicu bacamo i koji broj smo dobili.
        // Ako bacimo plavu kockicu i dobijemo 1, onda dobijamo 1 poen,
        // ako dobijemo 2 onda dobijamo 2 poena, ako dobijemo 3,4,5 ili 6 onda dobijamo 10 poena.
        // Crvena kockica ima ista pravila kao i plava samo sto donosi duplo vise poena.


        Scanner s = new Scanner(System.in);

        System.out.println("Odaberite kockicku (plava ili crvena): ");
        String bojaKockice = s.next();

        System.out.println("Bacite kockicu: ");
        int brojKockice = s.nextInt();

        if (bojaKockice.equals("plava") && brojKockice == 1) {
            System.out.println("Dobili ste 1 poen");
        } else if (bojaKockice.equals("plava") && brojKockice == 2){
            System.out.println("Dobili ste 2 poena");
        } else if (bojaKockice.equals("plava") && brojKockice > 2 && brojKockice <=6){
            System.out.println("Dobili ste 10 poena");
        } else if (bojaKockice.equals("crvena") && brojKockice == 1){
            System.out.println("Dobili ste 2 poena");
        } else if (bojaKockice.equals("crvena") && brojKockice == 2){
            System.out.println("Dobili ste 4 poena");
        } else if (bojaKockice.equals("crvena") && brojKockice > 2 && brojKockice <=6){
            System.out.println("Dobili ste 20 poena");}
        else {
            System.out.println("Uneli ste neispravne podatke");
        }



    }
}
