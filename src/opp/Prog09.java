package opp;

import javax.swing.*;
import java.util.Scanner;

public class Prog09 {

    public static void main(String[] args) {

        //retorna dia da semama
        String escolhaDia = "";
        int diaConvertido = 0;

        Scanner scan = new Scanner(System.in);
        escolhaDia = JOptionPane.showInputDialog(null, "Digite (0-6) para os dias da semana: ");
        diaConvertido = Integer.parseInt(escolhaDia);//converte


        do {
            switch (diaConvertido) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Domingo");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Segunda");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Terça");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quarta");
                case 4:
                    JOptionPane.showMessageDialog(null, "Quinta");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Sexta");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Sábado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um valor válido!!");
                    break;
            }
        } while (diaConvertido != 0);

    }
}
