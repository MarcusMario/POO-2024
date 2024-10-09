package NOTIFICACION;

public abstract class Mensaje {

    protected String destinatario;
    protected String contenido;

    public Mensaje(String destinatario, String contenido) {
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public abstract void mostrarMensaje();
}




