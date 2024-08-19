package Ico.fesa.unam.mx.poo;



public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Marcus Mario");
        cliente.setEmail("marcus@gmail.com");
        cliente.setTelefono("5610265158");

        Producto producto1 = new Producto();
        producto1.setNombre("Iphone 14");
        producto1.setPrecio(13000.00);
        producto1.setCantidad(1);

        Producto producto2 = new Producto();
        producto2.setNombre("Funda anti golpes");
        producto2.setPrecio(150.00);
        producto2.setCantidad(2);

        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(518);
        pedido.setFecha("2024-08-19");

        double montoTotal = producto1.calcularSubtotal() + producto2.calcularSubtotal();
        pedido.setMontoTotal(montoTotal);

        cliente.realizarPedido(pedido);
    }
}
