package opp;
import javax.swing.*;
import java.text.DecimalFormat;

public class Prog07 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        float nota1 = 0, nota2 = 0, media = 0;
        String msg = "- Resultado -\n";

        nota1 = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Informe a nota 1: ")
        );
        nota2 = Float.parseFloat(
                JOptionPane.showInputDialog(null, "Informe a nota 2: ")
        );

        media = (nota1 + nota2) / 2;


        //()? V : F; Ternário
        msg += "Média: " +df.format(media);
        msg += (media >= 7) ? "\nAprovado" : "\nReprovado";

        /*if (media >= 7){
            msg += "Média: " +df.format(media) + "\nAprovado";
            JOptionPane.showMessageDialog(null,msg);
        }else{
         */
        JOptionPane.showMessageDialog(null,msg);

    }
}


