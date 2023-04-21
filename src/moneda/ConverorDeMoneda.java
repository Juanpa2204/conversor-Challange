package moneda;

import enums.Moneda;
import javax.swing.*;

interface ConversorDeMoneda {
    static boolean validarNumero(String input){
        try{
            double x=Double.parseDouble(input);
            if (x>= 0 || x<0);
            return true;
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ingrese un numero valido");
            return false;
        }
    }
    default void convertirADivisa(Moneda monedaDestino) {
        double tasaDeCambio = monedaDestino.getTasaDeCompra();
        String nombreMoneda = monedaDestino.getNombre();

        String input = (JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a " + nombreMoneda, "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE));
        if (validarNumero(input)){
            double pesos = Double.parseDouble(input);
            double moneda = pesos / tasaDeCambio;
            moneda=(double)Math.round(moneda*100d)/100;
            JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s %s", pesos, moneda, nombreMoneda), "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE);
        }

    }
    default void convertirAPesos(Moneda monedaDestino) {
        double tasaDeCambio = monedaDestino.getTasaDeVenta();
        String nombreMoneda = monedaDestino.getNombre();
        String input = (JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a " + nombreMoneda, "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE));
        if (validarNumero(input)) {
            double pesos = Double.parseDouble(input);
            double moneda = pesos * tasaDeCambio;
            moneda = (double) Math.round(moneda * 100d) / 100;
            JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s %s", pesos, moneda, nombreMoneda), "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE);
        }
    }

}
