package NOTIFICACION;

public class Main {

        public static void main(String[] args) {

            Notificacion email = new Email("mario@unam.mx", "Hola, estoy haciendo la Tarea 6 de POO", "Saludo");

            Notificacion sms = new Sms("5610265159", "Saludos esta es una interfaz.");

            // notificación por email
            System.out.println("\n== Bandeja de entrada del correo ==");
            email.enviar();
            email.cancelar();

            // notificación por SMS
            System.out.println("\n== Bandeja de mensajes sms ==");
            sms.enviar();
            sms.cancelar();
        }
    }

