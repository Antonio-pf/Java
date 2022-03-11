package opp;
import javax.swing.*;

public class Prog05 {

    //testando funcoes string

    public static void main(String[] args) {
        String texto1 = "Programação Orientada Objetos";
        String texto2 = texto1.replace("Orientada Objetos", "OO");
        String msg = "";

        msg = "Tamanho: " + texto1.length() + "\n" +
          "Maiusculo: " + texto1.toUpperCase() + "\n" +
          "Posição de 'Orientada': " + texto1.indexOf("Orientada") + "\n" +
          "Nova string: " + texto2;
        JOptionPane.showMessageDialog(null, msg.concat("\n\nEND"),"INFO",1);
        JOptionPane.showMessageDialog(null, msg.hashCode(),"INFO",1);
        System.out.printf(String.valueOf(msg.isEmpty()));
    }
}
