package enums;

public enum Moneda {
    PESO(1, "pesos"),
    DOLAR(0.00027, "dólares"),
    EURO(0.00023, "euros"),
    LIBRA_ESTERLINA(0.00020, "libras esterlinas"),
    YUAN(0.0017, "yuanes");

    private final double tasaDeCambio;
    private final String nombre;

    Moneda(double tasaDeCambio, String nombre) {
        this.tasaDeCambio = tasaDeCambio;
        this.nombre = nombre;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public String getNombre() {
        return nombre;
    }
}
