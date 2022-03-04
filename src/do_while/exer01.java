package do_while;

import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean condicao = false;

        do {
            System.out.println("Digite a nota de 0-10:");
            double nota = scan.nextDouble();

            if (nota <= 10 &&  nota>=0){
                condicao = true;
            }else{
                System.out.println("Nota inválida-Try again!!!!!");
            }

        }while (!condicao);

    }
}
