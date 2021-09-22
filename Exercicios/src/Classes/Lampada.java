package Classes;

public class Lampada {

    int watts;
    int tensao;
    String marca;
    String tipo;
    boolean ligada;

    void funciona(){

        if(!ligada){
            ligada = !ligada;
            System.out.println("Lampada Desligada");
        }else
            System.out.println("Lampada ligada");
            ligada = true;
    }

    void detalhesDaLampada(){
        System.out.println("Detalhes Da Lampada");
        System.out.println("Tensao: " + tensao);
        System.out.println("Watts: " + watts);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);

    }

}
