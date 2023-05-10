package menu;

import javax.swing.*;

import static temperatura.servicesTemperatura.*;


public class MenuTemperatura {

    public static void menuTemperatura() {
        String[] opcionesTemperatura = {"Convertir de Celsius a Fahrenheit", "Convertir de Fahrenheit a Celsius", "Convertir de Celsius a Kelvin", "Convertir de Kelvin a Celsius", "Convertir de Fahrenheit a Kelvin", "Convertir de Kelvin a Fahrenheit", "Volver"};
        String temperaturaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura[0]);

        if (temperaturaSeleccionada != null) {
            switch (temperaturaSeleccionada) {
                case "Convertir de Celsius a Fahrenheit":
                    conversionCelsiusFahrenheit(temperatura());
                    break;
                case "Convertir de Fahrenheit a Celsius":
                    conversionFahrenheitCelsius(temperatura());
                    break;
                case "Convertir de Celsius a Kelvin":
                    conversionCelsiusKelvin(temperatura());
                    break;
                case "Convertir de Kelvin a Celsius":
                    conversionKelvinCelsius(temperatura());
                    break;
                case "Convertir de Fahrenheit a Kelvin":
                    conversionFahrenheitCelsius(temperatura());
                    break;
                case "Convertir de Kelvin a Fahrenheit":

                    break;
                case "Volver":

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}

