package Herencia;

public class ProbarHerencia {
    public static void main(String[] args) {
        // INSTANCIAS DE CADA SUBCLASE
        Tortuga tortuga = new Tortuga(10, 0.5, "Tortuga de mar", "Océano", false, true, true, "Marina");
        Perro perro = new Perro(5, 0.7, "Perro doméstico", "Casa", true, false, "Labrador", "Marrón");
        Gato gato = new Gato(3, 0.3, "Gato doméstico", "Casa", true, false, "Siamés", "Blanco");

        // METODOS DE LA CLASE ANIMAL
        System.out.println(" Métodos de la clase Animal ");
        tortuga.respirar();
        perro.comer();
        gato.dormir();
        tortuga.moverse();
        gato.moverse();

        // METODOS ESPECIFICOS DE CADA SUBCLASE
        System.out.println("\n Métodos específicos de cada subclase ");
        tortuga.nadar();
        tortuga.ocultar();
        tortuga.cazar();

        perro.ladrar();
        perro.olfatear();
        perro.jugar();

        gato.maullar();
        gato.araniar();
        gato.exigirAtencion();

        // INFORMACION DE LOS OBJETOS USANDO EL TOSTRING
        System.out.println("\n Información de los objetos ");
        System.out.println(tortuga.toString());
        System.out.println(perro.toString());
        System.out.println(gato.toString());

        // SETTERS Y GETTERS PARA ACCEDER Y MODIFICAR INFORMACION
        System.out.println("\n Usando getters y setters ");
        System.out.println("Edad de la tortuga antes de modificar: " + tortuga.getEdad());
        tortuga.setEdad(15); // Modificar la edad de la tortuga
        System.out.println("Edad de la tortuga después de modificar: " + tortuga.getEdad());

        System.out.println("Color del perro antes de modificar: " + perro.getColor());
        perro.setColor("Negro"); // Modificar el color del perro
        System.out.println("Color del perro después de modificar: " + perro.getColor());

        System.out.println("Raza del gato antes de modificar: " + gato.getRaza());
        gato.setRaza("Persa"); // Modificar la raza del gato
        System.out.println("Raza del gato después de modificar: " + gato.getRaza());
    }
}

