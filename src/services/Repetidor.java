package services;

import javax.swing.*;


public class Repetidor {

    public static boolean intentaRepetir() {
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar?");
        if (respuesta == JOptionPane.YES_OPTION || respuesta == JOptionPane.CANCEL_OPTION) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            return false;
        }
    }
}

