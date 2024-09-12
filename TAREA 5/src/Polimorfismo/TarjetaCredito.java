package Polimorfismo;

public class TarjetaCredito extends MetodoPago {
    //ATRIBUTO
    private String numeroTarjeta;

    //CONSTRUCTOR

    public TarjetaCredito(String nombreCliente, double cantidad, String fecha, String numeroTarjeta) {
        super(nombreCliente, cantidad, fecha);
        this.numeroTarjeta = numeroTarjeta;
    }

    //SOBRECARGA

    public TarjetaCredito(String nombreCliente, double cantidad, String fecha) {
        super(nombreCliente, cantidad, fecha);
    }

    //SETTERS AND GETTERS

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    //toString

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "numeroTarjeta='" + numeroTarjeta + '\'' +
                '}';
    }

    //METODOS

    public void realizarPago() {
        System.out.println("Pago de $" + getCantidad() + " realizado con tarjeta de crédito. Cliente: " + getNombreCliente());
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado para tarjeta de crédito terminada en " + numeroTarjeta.substring(15));
    }

    public void cancelarPago() {
        System.out.println("Pago cancelado para tarjeta de crédito terminada en " + numeroTarjeta.substring(15));
    }

}
