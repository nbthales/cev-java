package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade); //convertendo int p String
        System.out.println(valor);*/
        
        /*String valor = "30";
        int idade = Integer.parseInt(valor); //convertendo string p int
        System.out.println(idade);*/
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor); //convertendo string p int
        System.out.printf("%.3f", idade);
        
    }
    
}
