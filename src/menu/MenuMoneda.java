package menu;

import javax.swing.*;

import static moneda.Divisa.divisaAPesos;
import static moneda.Pesos.pesosADivisa;
import static menu.MenuPrincipal.menuPrincipal;

public class MenuMoneda {
    public static void menuDivisa(){
        String[] pesosA = {"Convertir de pesos a divisa", "Convertir de divisa a pesos", "Volver"};
        String monedaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, pesosA, pesosA[0]);

            if (monedaSeleccionada != null) {
                switch (monedaSeleccionada) {
                    case "Convertir de pesos a divisa":
                        pesosADivisa();
                        break;
                    case "Convertir de divisa a pesos":
                        divisaAPesos();
                        break;
                    case "Volver":
                        menuPrincipal();
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }


    }
}
