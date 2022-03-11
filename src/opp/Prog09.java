package opp;

import javax.swing.*;
import java.util.Scanner;

public class Prog09 {

    public static void main(String[] args) {

        //retorna dia da semama
        String escolhaDia = "";
        String msg = "";
        int diaConvertido = 0;

        Scanner scan = new Scanner(System.in);
        escolhaDia = JOptionPane.showInputDialog(null, "Digite (0-6) para os dias da semana: ");
        diaConvertido = Integer.parseInt(escolhaDia);//converte


        switch (diaConvertido) {
            case 0:
                msg = "Domingo";
                break;
            case 1:
                msg = "Segunda";
                break;
            case 2:
                msg = "Terça";
                break;
            case 3:
                msg = "Quarta";
                break;
            case 4:
                msg = "Quinta";
                break;
            case 5:
                msg = "Sexta";
                break;
            case 6:
                msg = "Sábado";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite um valor válido!!");
                break;
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
