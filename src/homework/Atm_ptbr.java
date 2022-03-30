package homework;

import javax.swing.*;
import java.text.DecimalFormat;

public class Atm_ptbr {

    public static String exibeMenu() {
        String menu = "# Menu ATM simples #\n\n1. Depositar\n2. Sacar\n3. Consultar saldo\n4. Sair\n\nEscolha uma opção";

        return menu;
    }

    public static void main(String args[]) {

        DecimalFormat df = new DecimalFormat("#.##");

        float valor = 0, saldo = 0;
        int opcao = 0;

        while (opcao != 4) {
            try {

                opcao = Integer.parseInt(
                        JOptionPane.showInputDialog(null, exibeMenu())
                );
            } catch (NumberFormatException e) {
            }

            switch (opcao) {
                case 1:
                    saldo += Float.parseFloat(
                            JOptionPane.showInputDialog(null, "Entre com o valor do depósito")
                    );
                    JOptionPane.showMessageDialog(null, "Operação concluída");
                    break;
                case 2:
                    valor = Float.parseFloat(
                            JOptionPane.showInputDialog(null, "Entre com o valor do saque")
                    );
                    if (valor > saldo) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente para retirada\nOperação cancelada");
                    } else {
                        if (valor > 500) {
                            JOptionPane.showMessageDialog(null, "Valor acima do limite diário\nOperação cancelada");
                        } else {
                            saldo -= valor;
                            JOptionPane.showMessageDialog(null, "Operação concluída");
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo atual: $ " + df.format(saldo));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida", "Alert", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}

