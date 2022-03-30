package homework.banco;

import homework.banco.Conta;

import javax.swing.*;
import java.text.DecimalFormat;

public class Menu {

    int opcao;
    Conta conta;

    DecimalFormat df = new DecimalFormat("#.##");

    public String mostraMsg(){

        String menu="# Menu ATM simples #\n\n1. Depositar\n2. Sacar\n3. Consultar saldo\n4. Sair\n\nEscolha uma opção";
        this.opcao = Integer.parseInt(
                JOptionPane.showInputDialog(null, menu)
        );


        JOptionPane.showMessageDialog(null,menu);
        return menu;


    }

    public float acessaMenu(){

        while (opcao != 4) {

            switch (opcao) {
                case 1:

                    conta.saldo += Float.parseFloat(
                            JOptionPane.showInputDialog(null, "Entre com o valor do depósito")
                    );
                    JOptionPane.showMessageDialog(null,"Operação concluída");
                    break;
                case 2:
                    conta.valorARetirar = Float.parseFloat(
                            JOptionPane.showInputDialog(null, "Entre com o valor do saque")
                    );
                    if (conta.valorARetirar > conta.saldo) {
                        JOptionPane.showMessageDialog(null,"Saldo insuficiente para retirada\nOperação cancelada");
                    } else {
                        if (conta.valorARetirar > 500) {
                            JOptionPane.showMessageDialog(null,"Valor acima do limite diário\nOperação cancelada");
                        } else {
                            conta.saldo -= conta.valorARetirar;
                            JOptionPane.showMessageDialog(null,"Operação concluída");
                        }
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saldo atual: $ " + df.format(conta.saldo));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Operação inválida");
                    break;
            }
        }
        return 0;
    }
}
