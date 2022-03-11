package opp;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        String msg = "";
        int contagem = 0;
        System.out.println("Informe o número para contagem: ");
        contagem = scanner.nextInt();

        for (int i = 1; i <= contagem ; i ++){
            msg = i + " ";
            System.out.printf(msg);

        }*/

        UIManager.put("OptionPane.mininumSiza", new Dimension(500, 50));
        String msg = "";
        int contagem = 0;

        contagem = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Informe o número para contagem: ")
        );

        for (int i = 1; i <= contagem; i++) {
            if (contagem % 20 == 0){
                msg += i + "\n ";
            }

        }

        JOptionPane.showMessageDialog(null,msg);
    }

}

