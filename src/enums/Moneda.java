package enums;

public enum Moneda {
    DOLAR(420, 400, "dólares"),
    EURO(435,410, "euros"),
    LIBRA_ESTERLINA(440, 420, "libras esterlinas"),
    YUAN(415, 408, "yuanes");

    private final double tasaDeCompra;
    private final double tasaDeVenta;
    private final String nombre;

    Moneda(double tasaDeCompra, double tasaDeVenta, String nombre) {
        this.tasaDeCompra = tasaDeCompra;
        this.tasaDeVenta = tasaDeVenta;
        this.nombre = nombre;
    }

    public double getTasaDeCompra() {
        return tasaDeCompra;
    }

    public double getTasaDeVenta() {
        return tasaDeVenta;
    }

    public String getNombre() {
        return nombre;
    }
}

