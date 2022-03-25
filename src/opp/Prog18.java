package opp;

import javax.swing.JOptionPane;

public class Prog18 {
    public static void mostraMsg(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    //pula linha
    public static String skip(int vezes){
        String res = "";

        for (int i = 0; i <= vezes; i ++){
            res += "\n";
        }
        return res;
    }

    public static void main(String[] args) {
        String res = "aula" + skip(3) + "Test" + skip(2);
        mostraMsg(res);

    }
}
