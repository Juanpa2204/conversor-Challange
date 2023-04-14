package moneda;

import javax.swing.*;

public class Divisa {

    public static void convertirDolaresAPesos() {
        double tasaDeCambio = 400;
        double dolares = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dolares que desea convertir a pesos", "Conversor de Moneda - Dolar a Pesos", JOptionPane.PLAIN_MESSAGE));
        double pesos = dolares * tasaDeCambio;
        JOptionPane.showMessageDialog(null, String.format("La cantidad de %s pesos equivale a %s dólares", pesos, dolares), "Conversor de Moneda - Pesos a Dólar", JOptionPane.PLAIN_MESSAGE);
    }
}
