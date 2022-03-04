package opp;

public class Test {
    public static void main(String[] args) {

        String palavra = "Amor";
        String palavraNew = "";
        String palavraNew2 = "";

        for(int i = 0; i < palavra.length(); i++){

            palavraNew = palavraNew + palavra.charAt(i);
            System.out.printf("\n"+palavraNew);

        }
        for(int i = palavra.length()-1 ; i < 0 ; i--){
            System.out.println("\n" + palavra.charAt(i));


        }

        /*for(int i = palavra.length()-1; i <= 6; i--){
            palavraNew2 = palavraNew2 + palavra.charAt(i);
            System.out.printf("\n"+palavraNew2);

        }*/
        //[a][m][o][r]
        // 0  1  2  3
    }
}
