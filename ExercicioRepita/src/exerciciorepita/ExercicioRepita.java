package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s=0, totPar=0, totImpar=0, mCem=0 , tot=0;
        double m;
        
        do{
            tot++;
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;

            if(n >= 100){
                mCem++;
            }
            if (n%2 == 0){
                totPar++;
            } else{
                totImpar++;
            }
        } while (n != 0);
        m = s / tot;
       // JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
       JOptionPane.showMessageDialog(null,
               "<html>Resultado final <hr>" +
               "<br>Total dos Valores: "+s+
               "<br>Total de Pares: "+totPar+
               "<br>Total de Impares: "+totImpar+
               "<br>Acima de 100: "+mCem+
               "<br>Média dos valores: "+m+
               "</html>");
    } 
}
