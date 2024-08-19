
package ico.fes.aragon.unam.mx.poo;


public class Pedido {
    private int numeroPedido;
    private String fecha;
    private double montoTotal;

    public Pedido() {
        this.numeroPedido = 0;
        this.fecha = "";
        this.montoTotal = 0.0;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double calcularMontoTotal() {
        return montoTotal;
    }
}