package sub_rotinas;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Extra4 {

    public static void getData(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date agora = new Date();
        JOptionPane.showMessageDialog(null, df.format(agora));
    }
    public static void getHora(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = new Date();
        JOptionPane.showMessageDialog(null, sdf.format(hora));
    }
    public static double getAgora(String tipoFormato){
        String formato ="";
        Date agora = new Date();
        switch (tipoFormato){

            case "data": formato = "dd/MM/yyyy";break;
            case "hora": formato = "HH:mm:ss";break;
            default: formato = "dd/MM/yyyy HH:mm:ss";break;
        }
        SimpleDateFormat df = new SimpleDateFormat(formato);
        JOptionPane.showMessageDialog(null, df.format(agora));
        return 0;
    }
    public static void  getAgora(){
        getAgora("");

    }

    // mostrar data e hora atual

    public static void main(String[] args) {

            getAgora();
        }

    }

