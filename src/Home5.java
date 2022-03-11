import java.util.Scanner;

public class Home5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor1 = 0, valor2 = 0, operacao = 0;
        String msg = "Resultado: ";

        do {

            System.out.println("--------MENU DE OPÇÕES-------");
            System.out.println("1-Adição");
            System.out.println("2-Subtração");
            System.out.println("3-Divisão ");
            System.out.println("4-Multiplicação ");
            System.out.println("5-Sair ");
            operacao = scan.nextInt();

            System.out.println("Digite o primeiro valor:");
            valor1 = scan.nextInt();
            System.out.println("Digite o segunndo valor:");
            valor2 = scan.nextInt();

            switch (operacao){

                case 1:
                    System.out.println(msg + (valor1+valor2));
                    break;
                case 2:
                    System.out.println(msg + (valor1-valor2));
                    break;
                case  3:
                    System.out.println(msg + (valor1/valor2));
                    break;
                case 4:
                    System.out.println(msg + (valor1*valor2));
                    break;
                case 5:
                    System.out.println("Obrigado! Use sempre ");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (operacao != 0 && operacao != 5);
    }
}
