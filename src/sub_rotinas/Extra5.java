package sub_rotinas;

import javax.swing.*;

public class Extra5 {
    public static double calculaPotencia(double v1, double v2) {

        return Math.pow(v1,v2);
    }

    public static void main(String[] args) {

        double resultado = 0;

        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
        double exp = Double.parseDouble(JOptionPane.showInputDialog("Informe o expoente"));
        resultado = Math.pow(base, exp);
        resultado += 10;
        JOptionPane.showMessageDialog(null, (int)base + " " + (int)exp + ": " + (int)resultado);

        resultado = calculaPotencia(base,exp);
        
    }
}
