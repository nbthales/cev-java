package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Iso é um: ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
}
