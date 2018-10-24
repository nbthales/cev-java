package teste;

public class Teste {

    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        // ERRO c = c +1;
        // CORRETA s += 1;
        // ERRO i += s;
        // ERRO c += s;
        // CORRETO i += l;
    }
    
}
