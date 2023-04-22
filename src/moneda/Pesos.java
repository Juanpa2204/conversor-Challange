package moneda;

import enums.Moneda;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;
import static menu.MenuPrincipal.menuPrincipal;

public class Pesos implements ConversorDeMoneda {

    @Override
    public void convertirADivisa(Moneda monedaDestino) {
        ConversorDeMoneda.super.convertirADivisa(monedaDestino);
    }

    public static void pesosADivisa() {
        String[] pesosA = {"Convertir de pesos a dólar", "Convertir de pesos a euro", "Convertir de pesos a libra esterlina", "Convertir de pesos a yuan"};
        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);
        boolean flag = true;
        while (flag) {
            if (monedaSeleccionada != null) {
                switch (monedaSeleccionada) {
                    case "Convertir de pesos a dólar":
                        new Pesos().convertirADivisa(Moneda.DOLAR);
                        break;
                    case "Convertir de pesos a euro":
                        new Pesos().convertirADivisa(Moneda.EURO);
                        break;
                    case "Convertir de pesos a libra esterlina":
                        new Pesos().convertirADivisa(Moneda.LIBRA_ESTERLINA);
                        break;
                    case "Convertir de pesos a yuan":
                        new Pesos().convertirADivisa(Moneda.YUAN);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        }
    }
}



