package Polimorfismo;

public class Efectivo extends MetodoPago {
    //ATRIBUTO
    private String ubicacionCaja;

    //CONSTRCUTOR

    public Efectivo(String nombreCliente, double cantidad, String fecha, String ubicacionCaja) {
        super(nombreCliente, cantidad, fecha);
        this.ubicacionCaja = ubicacionCaja;
    }

    //SOBRECARGA

    public Efectivo(String nombreCliente, double cantidad, String fecha) {
        super(nombreCliente, cantidad, fecha);
    }

    //SETTERS AND GETTERS

    public String getUbicacionCaja() {
        return ubicacionCaja;
    }

    public void setUbicacionCaja(String ubicacionCaja) {
        this.ubicacionCaja = ubicacionCaja;
    }

    //toString

    @Override
    public String toString() {
        return "Efectivo{" +
                "ubicacionCaja='" + ubicacionCaja + '\'' +
                '}';
    }

    //METODOS
    public void realizarPago() {
        System.out.println("Pago de $" + getCantidad() + " realizado en efectivo. Cliente: " + getNombreCliente());
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado en la ubicación: " + ubicacionCaja);
    }

    public void cancelarPago() {
        System.out.println("Pago cancelado en la ubicación: " + ubicacionCaja);
    }
}
