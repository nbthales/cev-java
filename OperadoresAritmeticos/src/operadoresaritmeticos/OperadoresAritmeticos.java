package operadoresaritmeticos;

public class OperadoresAritmeticos {


    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.printf("A média é igual a: %.3f \n", m);*/
        
        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int x = 4;
        x *= 2; // x = x * 2
        System.out.println(x);*/
        
        /*float v = 8.4f;
        //int ar =(int) Math.floor(v); // arredonda pra baixo
        //int ar =(int) Math.ceil(v); // arredonda pra cima
        int ar =(int) Math.round(v); // arredonda
        System.out.println(ar);*/
        
        double ale = Math.random();
        int n = (int) (5 + ale * (10-5)); // gera numero de 5 a 10
        System.out.println(n);
    }
    
}
