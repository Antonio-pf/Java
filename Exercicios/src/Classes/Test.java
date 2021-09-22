package Classes;

public class Test {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.marca = "Voltsa";
        lampada.tensao = 127;
        lampada.watts = 60;
        lampada.tipo = "Led";

        lampada.funciona();
        lampada.detalhesDaLampada();
    }
}
