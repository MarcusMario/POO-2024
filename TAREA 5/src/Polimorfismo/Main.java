package Polimorfismo;

public class Main {
    public static void main (String[] args) {

        // PAGOS
        MetodoPago pago1 = new TarjetaCredito("Juan Perez", 150.0, "2024-09-10", "1234-5678-9012-3456");
        MetodoPago pago2 = new PayPal("Maria Lopez", 200.0, "2024-09-10", "maria@paypal.com");
        MetodoPago pago3 = new Efectivo("Carlos Sanchez", 300.0, "2024-09-10", "Sucursal A");

        // EJECUCION DE METODOS

        System.out.println("\n=== Pago 1 ===");
        pago1.realizarPago();
        pago1.confirmarPago();
        pago1.cancelarPago();
        System.out.println(pago1.toString()); 

        System.out.println("\n=== Pago 2 ===");
        pago2.realizarPago();
        pago2.confirmarPago();
        pago2.cancelarPago();
        System.out.println(pago2.toString());


        System.out.println("\n=== Pago 3 ===");
        pago3.realizarPago();
        pago3.confirmarPago();
        pago3.cancelarPago();
        System.out.println(pago3.toString());
    }


}
