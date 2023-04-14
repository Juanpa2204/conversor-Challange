package moneda;

import javax.swing.*;

public class Pesos {

    public static void pesosADivisa(){
        String[] pesosA = {"Convertir de pesos a dólar", "Convertir de pesos a euro", "Convertir de pesos a libra esterlina"};
        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);

        if (monedaSeleccionada != null) {
            switch (monedaSeleccionada) {
                case "Convertir de pesos a dólar":
                    convertirAPesosADolar();
                    break;
                case "Convertir de pesos a euro":
                    convertirAPesosAEuro();
                    break;
                case "Convertir de pesos a libra esterlina":
                    convertirAPesosALibraEsterlina();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    private static final double PESOS = 214.67;
    public static void convertirAPesosADolar() {
        double tasaDeCambio = 0.00027;
        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a dólares", "Conversor de Moneda - Pesos a Dólar", JOptionPane.PLAIN_MESSAGE));
        double dolares = pesos * tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s dólares", pesos, dolares), "Conversor de Moneda - Pesos a Dólar", JOptionPane.PLAIN_MESSAGE);
    }

    public static void convertirAPesosAEuro() {
        double tasaDeCambio = 0.00023;
        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a euros", "Conversor de Moneda - Pesos a Euro", JOptionPane.PLAIN_MESSAGE));
        double euros = pesos * tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s euros", pesos, euros), "Conversor de Moneda - Pesos a Euro", JOptionPane.PLAIN_MESSAGE);
    }

    public static void convertirAPesosALibraEsterlina() {
        double tasaDeCambio = 0.00020;
        double pesos = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos que desea convertir a libras esterlinas", "Conversor de Moneda - Pesos a Libra Esterlina", JOptionPane.PLAIN_MESSAGE));
        double librasEsterlinas = pesos * tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s libras esterlinas", pesos, librasEsterlinas), "Conversor de Moneda - Pesos a Libra Esterlina", JOptionPane.PLAIN_MESSAGE);
    }
}
