public class strings {

    public static void main(String[] args) {


        //Comparação de Strings
        //regionmatches
        //pesquisando uma string dentro de outra
        String procure = "Ovos e presunto";
        String encontre = "Ovos";


        //quero encontrar "Ovos" na frase procuro
        // atribui os a qbtd de caract para a busca
        int procureLenght = procure.length();
        int encontreLenght = encontre.length();

        System.out.println(procureLenght + " e " + encontreLenght);

        boolean encontrei = false;

        for(int i = 0; i <= (procureLenght - encontreLenght); i++){
            if(procure.regionMatches(i,encontre,0, encontreLenght)){
                encontrei = true;
                System.out.println(procure.substring(i,i + encontreLenght));
                break;

            }
        }
        if (!encontrei){
            System.out.println("Nenhuma palavra correspondente encontrada");
        }

        //substring()
        System.out.println("Test");
        String test2 = "Parado";
        System.out.println(test2.substring(0,4));

        //equals

        System.out.println("_______________________________________________");
        System.out.println("            Testando comparação");
        String word = "bola";
        String word2 = "Bola";
        String word3 = "BOLA";

        System.out.println("Words 1:" + word);
        System.out.println("Words 2:" + word2);
        System.out.println("Words 3:" + word3);

        System.out.println("bola equals word2? -> " + word.equals(word2));
        System.out.println("bola equals word3? -> " + word.equals(word3));
        System.out.println("bola equals word3? -> " + word.equalsIgnoreCase(word3));

        //regionMatches
        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println(banana.regionMatches(1, ana,0,3));

    }
}
