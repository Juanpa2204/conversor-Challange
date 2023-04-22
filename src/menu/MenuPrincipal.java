package menu;

import services.Repetidor;
import javax.swing.*;

import static menu.MenuMoneda.menuDivisa;

public class MenuPrincipal {
    public static void menuPrincipal(){

        boolean continuar = true;
        while (continuar) {
            String[] opciones = {"Convertidor de Monedas", "Convertir de Temperatura", "Convertir de Medidas"};
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcionSeleccionada != null) {
                switch (opcionSeleccionada) {
                    case "Convertidor de Monedas":
                        menuDivisa();
                        break;
                    case "Convertir de Temperatura ":
                        // agregar funcionalidad
                        break;
                    case "Convertir de Medidas":
                        // agregar funcionalidad
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
            continuar= Repetidor.intentaRepetir();
        }
    }
}


