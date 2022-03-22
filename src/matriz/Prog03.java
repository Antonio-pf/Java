package matriz;

import java.util.Scanner;

public class Prog03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        while (!sair){

            System.out.println("Digite 1 para adiconar compromissso.");
            System.out.println("Digite 2 para verificar compromissso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if (opcao == 1 ){// add compromisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido){
                    System.out.println("Digite o dia do mês");
                        dia = scan.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else {
                        System.out.println("Dia inválido, Digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Digite com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValida = true;
                    }else {
                        System.out.println("Hora inválido, Digite novamente");
                    }

                }
                System.out.println("Digite o compromisso:");
                compromissos[dia][hora] = scan.next();



            }else if (opcao == 2 ){// verifica compromisso

            }else if (opcao == 0){
                sair = true;
            }else {
                System.out.println("Opção inválida, digite novamente");
            }
        }
    }
}
