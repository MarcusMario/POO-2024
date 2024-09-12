package Polimorfismo;
/**
 *USE "ABSTRACT" PARA QUE TODAS LAS SUBCLASES TENGAN UNA IMPLEMENTACION ESPECIFICA */
abstract class MetodoPago {
    //ATRIBUTOS
    private String nombreCliente;
    private double cantidad;
    private String fecha;

    //CONSTRCUTOR

    public MetodoPago(String nombreCliente, double cantidad, String fecha) {
        this.nombreCliente = nombreCliente;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    //CONSTRUCTOR SOBRECARGADO

    public MetodoPago(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    //SETTERS AND GETTERS

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //toString

    @Override
    public String toString() {
        return "MetodoPago{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", cantidad=" + cantidad +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    //METODOS

    public abstract void realizarPago();
    public abstract void confirmarPago();
    public abstract void cancelarPago();
}
