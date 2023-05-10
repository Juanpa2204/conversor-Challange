package temperatura;

import javax.swing.*;

public class servicesTemperatura {

    public static double temperatura() {
        double temperatura = 0.0;
        String temperaturaStr = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Celsius:", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE);
        try {
            temperatura = Double.parseDouble(temperaturaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return temperatura;
    }

   /* public static void mostrarConversionTemperatura(String nombreVariable1, double variable1, String nombreVariable2, double variable2) {
        JOptionPane.showMessageDialog(null, variable1 + " grados " + nombreVariable1 + " equivalen a " + variable2 + " grados " + nombreVariable2, "Conversor de Temperatura - " + nombreVariable1 + " a " + nombreVariable2, JOptionPane.PLAIN_MESSAGE);
    }*/

    public static void conversionCelsiusFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit", "Conversor de Temperatura - Celsius a Fahrenheit", JOptionPane.PLAIN_MESSAGE);
    }

    public static void conversionFahrenheitCelsius(double fahrenheit) {
       double celsius= (fahrenheit - 32) / 1.8;
        JOptionPane.showMessageDialog(null, fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados celsius", "Conversor de Temperatura - Fahrenheit a Celsius", JOptionPane.PLAIN_MESSAGE);

    }

    public static void conversionCelsiusKelvin(double celsius) {
         double  kelvin=celsius + 273.15;
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius equivalen a " + kelvin + " grados Kelvin", "Conversor de Temperatura - Celsius a Kevin", JOptionPane.PLAIN_MESSAGE);
    }

    public static void conversionKelvinCelsius(double kelvin) {
        double celsius=  kelvin - 273.15;
        JOptionPane.showMessageDialog(null, kelvin + "grados Kelvin  equivales a " + celsius + "grados Celsius", "Conversor de Temperatura - Kelvin a Celsius", JOptionPane.PLAIN_MESSAGE);
    }

    }


