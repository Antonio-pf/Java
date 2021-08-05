import java.util.Scanner;

public class exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome, senha;

        System.out.println("Digite seu usuário:");
        nome = scan.next();
        System.out.println("Digite sua senha:");
        senha = scan.next();

        do {
            System.out.println("Usuário e senha não podem ser iguais!");
            System.out.println("Usuário: ");
            nome = scan.next();
            System.out.println("Senha: ");
            senha = scan.next();
        }while (nome.equals(senha) == true);
    }
}
