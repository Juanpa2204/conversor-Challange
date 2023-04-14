package moneda;

import javax.swing.*;

import static moneda.Divisa.convertirDolaresAPesos;
import static moneda.Pesos.pesosADivisa;

public class MenuMoneda {
    public static void menuDivisa(){
        String[] pesosA = {"Convertir de pesos a divisa", "Convertir de divisa a pesos"};
        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);

        if (monedaSeleccionada != null) {
            switch (monedaSeleccionada) {
                case "Convertir de pesos a dólar":
                    pesosADivisa();
                    break;
                case "Convertir de divisa a pesos":
                    convertirDolaresAPesos();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
