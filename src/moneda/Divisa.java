package moneda;

import enums.Moneda;
import javax.swing.*;

public class Divisa implements ConversorDeMoneda {

    @Override
    public void convertirAPesos(Moneda monedaDestino) {
        ConversorDeMoneda.super.convertirAPesos(monedaDestino);
    }

    public static void divisaAPesos() {

            String[] pesosA = {"Convertir dolar", "Convertir euro", "Convertir libra esterlina", "Convertir yuan"};
            String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);

            if (monedaSeleccionada != null) {
                switch (monedaSeleccionada) {
                    case "Convertir dolar":
                        new Divisa().convertirAPesos(Moneda.DOLAR);
                        break;
                    case "Convertir euro":
                        new Divisa().convertirAPesos(Moneda.EURO);
                        break;
                    case "Convertir libra esterlina":
                        new Divisa().convertirAPesos(Moneda.LIBRA_ESTERLINA);
                        break;
                    case "Convertir yuan":
                        new Pesos().convertirAPesos(Moneda.YUAN);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        }
    }


