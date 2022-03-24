package homework;

import java.util.Scanner;

public class Home6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       float [][] notaDeAlunos = new float[3][4];
        String nomeAluno;

        //add nota
        for (int i=0; i < notaDeAlunos.length; i ++){
            
            for (int j=0; j < notaDeAlunos[i].length; j ++ ){
                System.out.println("Entre com o nome do aluno");
                System.out.println("Entre com a nota do "+ (i + 1) + " aluno: ");
                notaDeAlunos[i][j]= scan.nextFloat();
            }
        }
        // calculando a média
        double soma = 0;
        for (int i=0; i < notaDeAlunos.length; i ++){
            soma = 0;
            for (int j=0; j < notaDeAlunos[i].length; j ++ ){
            }
            System.out.println("Média do aluno " + i + " é = " + soma/4);
        }
    }
}
