package matriz;

import java.util.Random;

public class Prog01 {

    public static void main(String[] args) {

        int [][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random();

        //add valores
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = 0;
        int coluna = 0;
        int linha = 0;
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    coluna = j;
                    linha = i;
                }
            }
        }
        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        };
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);


    }
}
