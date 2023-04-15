package moneda;

import enums.Moneda;
import enums.Moneda.*;
import javax.swing.*;

public class Divisa implements ConversorDeMoneda{

    @Override
    public void convertirAPesos(String nombreMoneda) {
        ConversorDeMoneda.super.convertirAPesos(nombreMoneda);
    }

    public static void divisaAPesos() {
        String[] pesosA = {"Convertir de dólar a pesos", "Convertir de euro a pesos", "Convertir de libra esterlina a pesos", "Convertir de yuan a pesos"};
        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);

        if (monedaSeleccionada != null) {
            switch (monedaSeleccionada) {
                case "Convertir de dólar a pesos":
                    new Divisa().convertirAPesos(String.valueOf(Moneda.PESO));
                    break;
                case "Convertir de euro a pesos":
                    new Pesos().convertirAPesos(String.valueOf(Moneda.EURO));
                    break;
                case "Convertir de libra esterlina a pesos":
                    new Pesos().convertirAPesos(String.valueOf(Moneda.LIBRA_ESTERLINA));
                    break;
                case "Convertir de yuan a pesos":
                    new Pesos().convertirAPesos(String.valueOf(Moneda.YUAN));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
