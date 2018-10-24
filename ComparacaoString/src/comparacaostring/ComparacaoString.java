package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Thales";
        String nome2 = "Thales";
        String nome3 = new String("Thales");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
