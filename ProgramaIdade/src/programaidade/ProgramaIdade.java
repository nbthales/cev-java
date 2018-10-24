package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = t.nextInt();
        int i=2018-nasc;
        System.out.println("Sua idade é "+i);
        if (i>=18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
    }
}
