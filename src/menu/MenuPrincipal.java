package menu;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;
import static menu.MenuMoneda.menuDivisa;

public class MenuPrincipal {
    public static void menuPrincipal(){
        String[] opciones = {"Convertidor de Monedas", "Convertir de Temperatura", "Convertir de Medidas"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        boolean continuar = true;
        while (continuar) {
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

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (confirmacion == JOptionPane.NO_OPTION) {
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "programa finalizado");
                } else {
                    opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                }
            } else {
                continuar = false;
                showMessageDialog(null, "programa finalizado");
            }
            }
        }
    }


