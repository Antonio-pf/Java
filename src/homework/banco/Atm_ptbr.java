package homework.banco;

import java.text.DecimalFormat;


class Atm_ptbr {


    public static void main (String args[]) {

        Menu menu = new Menu();
        DecimalFormat df = new DecimalFormat("#.##");

        float valor=0, saldo=0;
        int opcao=0;

        menu.mostraMsg();
        menu.acessaMenu();

    }
}
