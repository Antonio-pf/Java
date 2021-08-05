import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double nota, media = 0.0;

        System.out.println("Digite a nota de 0-10:");
        nota = scan.nextDouble();

        do {
            System.out.println("Digite um valor válido:");
            nota = scan.nextDouble();
        }while (nota > 10);

        if(media >= 7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!!");
        }
    }
}
