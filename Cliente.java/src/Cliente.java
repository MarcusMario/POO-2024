package Ico.fesa.unam.mx.poo;


public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    public Cliente() {
        this.nombre = "";
        this.email = "";
        this.telefono = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void realizarPedido(Pedido pedido) {
        System.out.println("Pedido realizado por: " + this.nombre);
        System.out.println("Monto total del pedido; $" + pedido.calcularMontoTotal());
    }
}



