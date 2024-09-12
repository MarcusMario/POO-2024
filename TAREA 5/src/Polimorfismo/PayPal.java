package Polimorfismo;

public class PayPal extends MetodoPago {
    //ATRIBUTO
    private String emailCuenta;

    //CONSTRUCTOR

    public PayPal(String nombreCliente, double cantidad, String fecha, String emailCuenta) {
        super(nombreCliente, cantidad, fecha);
        this.emailCuenta = emailCuenta;
    }

    //SOBRECARGA

    public PayPal(String nombreCliente, double cantidad, String fecha) {
        super(nombreCliente, cantidad, fecha);
    }

    //SETTERS AND GETTERS

    public String getEmailCuenta() {
        return emailCuenta;
    }

    public void setEmailCuenta(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    //toString

    @Override
    public String toString() {
        return "Paypal{" +
                "emailCuenta='" + emailCuenta + '\'' +
                '}';
    }

    //METODOS

    public void realizarPago() {
        System.out.println("Pago de $" + getCantidad() + " realizado con PayPal. Cliente: " + getNombreCliente());
    }

    public void confirmarPago() {
        System.out.println("Pago confirmado para la cuenta PayPal: " + emailCuenta);
    }

    public void cancelarPago() {
        System.out.println("Pago cancelado para la cuenta PayPal: " + emailCuenta);
    }

}
