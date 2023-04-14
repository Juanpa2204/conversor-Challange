import javax.swing.JOptionPane;
import static moneda.MenuMoneda.menuDivisa;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Convertidor de monedas", "Convertir de ", "Convertir de "};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada != null) {
            switch (opcionSeleccionada) {
                case "Convertidor de monedas":
                    menuDivisa();
                    break;
                case "Convertir de ":
                    break;
                case "Convertir de":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}
