package NOTIFICACION;

public class Sms extends Mensaje implements Notificacion {

    public Sms(String destinatario, String contenido) {
        super(destinatario, contenido);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Mensaje SMS para " + destinatario + ": " + contenido);

    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + destinatario);
        System.out.println("Contenido del SMS: " + contenido);

    }

    @Override
    public void cancelar() {
        System.out.println("SMS a " + destinatario + " ha sido cancelado.");

    }
}
