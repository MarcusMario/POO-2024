package NOTIFICACION;

public class Email extends Mensaje implements Notificacion{
    private String asunto;

    public Email(String destinatario, String contenido, String asunto) {
        super(destinatario, contenido);
        this.asunto = asunto;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Mensaje de correo para " + destinatario + ": " + contenido);


    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + destinatario + " con asunto: " + asunto);
        System.out.println("Contenido del correo: " + contenido);


    }

    @Override
    public void cancelar() {
        System.out.println("Correo a " + destinatario + " ha sido cancelado.");

    }
}
