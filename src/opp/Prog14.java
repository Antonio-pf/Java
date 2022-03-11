package opp;

import javax.swing.*;

public class Prog14 {

    public static void main(String[] args) {
        //escolhendo opções
        int valor1 = 0, valor2 = 0;
        String continua = "sim";

        while (continua.equalsIgnoreCase(
                "sim")) {
            //equals = confirma para o java o que o tipo é string
            //ignora maius e minus

            valor1 = Integer.parseInt(
                    JOptionPane.showInputDialog(null,"Primeiro valor: ")
            );
            valor2 = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Segundo valor: " )
            );
            JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 + valor2));

            continua = JOptionPane.showInputDialog(null,"Continua sim/não");
        }
    }
}
