package moneda;

import enums.Moneda;
import javax.swing.*;

interface ConversorDeMoneda {

    default void convertirADivisa(Moneda monedaDestino) {
        double tasaDeCambio = monedaDestino.getTasaDeCambio();
        String nombreMoneda = monedaDestino.getNombre();

        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a " + nombreMoneda, "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE));
        double moneda = pesos * tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s %s", pesos, moneda, nombreMoneda), "Conversor de Moneda - Pesos a " + nombreMoneda, JOptionPane.PLAIN_MESSAGE);
    }

    default void convertirAPesos(String nombreMoneda) {
        double tasaDeCambio;
        String nombreCompleto;

        switch(nombreMoneda) {
            case "dolar":
                tasaDeCambio = 20.0; // ejemplo de tasa de cambio
                nombreCompleto = "dólares";
                break;
            case "euro":
                tasaDeCambio = 23.0; // ejemplo de tasa de cambio
                nombreCompleto = "euros";
                break;
            case "libra esterlina":
                tasaDeCambio = 25.0; // ejemplo de tasa de cambio
                nombreCompleto = "libras esterlinas";
                break;
            case "yuan":
                tasaDeCambio = 3.0; // ejemplo de tasa de cambio
                nombreCompleto = "yuanes";
                break;
            default:
                JOptionPane.showMessageDialog(null, "La moneda ingresada no es válida", "Conversor de Moneda", JOptionPane.ERROR_MESSAGE);
                return;
        }

        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " + nombreCompleto + " que desea convertir a pesos", "Conversor de Moneda - " + nombreCompleto + " a Pesos", JOptionPane.PLAIN_MESSAGE));
        double moneda = pesos / tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s %s equivale a %s pesos", pesos, nombreCompleto, moneda), "Conversor de Moneda - " + nombreCompleto + " a Pesos", JOptionPane.PLAIN_MESSAGE);
    }


}
