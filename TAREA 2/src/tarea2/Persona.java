package tarea2;

/**
 * La clase Persona representa a un individuo con nombre, edad y una cuenta bancaria asociada.
 * Este ejemplo particular me representa a mi mismo "Mario Isaias", de 20 años, con una cuenta bancaria de tipo débito.
 */
public class Persona {
    // Atributos

    /**
     * Nombre de la persona: se almacenará un valor de tipo String.
     */
    private String nombre;

    /**
     * Edad de la persona: se almacenará un valor de tipo int.
     */
    private int edad;

    /**
     * Cuenta bancaria asociada a la persona: se almacenará un objeto de tipo CuentaBancaria.
     */
    private CuentaBancaria cuentaBancaria;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Mario Isaias";
        this.edad = 20;
        this.cuentaBancaria = new CuentaBancaria("5210235689", "Debito", 100.0); // Número de cuenta definido
    }

    /**
     * Constructor sobrecargado que permite inicializar una persona con una cuenta bancaria específica.
     *
     * @param cuentaBancaria Cuenta bancaria asociada a la persona.
     */
    public Persona(CuentaBancaria cuentaBancaria) {
        this.nombre = "Mario Isaias";
        this.edad = 20;
        this.cuentaBancaria = cuentaBancaria;
    }

    /**
     * Constructor sobrecargado que permite inicializar una persona con su nombre, edad y datos de cuenta bancarios específicos.
     *
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     * @param cuentaBancaria Cuenta bancaria asociada a la persona.
     */
    public Persona(String nombre, int edad, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuentaBancaria = cuentaBancaria;
    }


    // Métodos

    /**
     * Muestra la información completa de la persona.
     *
     * @return Información de la persona en formato de texto.
     */
    public String mostrarInformacion() {
        return "Persona: " + nombre + ", Edad: " + edad + ", " + cuentaBancaria.toString();
    }

    /**
     * Realiza un depósito en la cuenta bancaria de la persona.
     *
     * @param monto Monto a depositar.
     */
    public void realizarDeposito(double monto) {
        cuentaBancaria.depositar(monto);
        System.out.println("Depósito de $" + monto + " realizado a la cuenta de " + nombre);
    }

    /**
     * Actualiza la edad de la persona.
     *
     * @param nuevaEdad Nueva edad de la persona.
     */
    public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("Edad actualizada a " + nuevaEdad + " años.");
    }

    /**
     * Representación en formato de cadena del objeto Persona.
     *
     * @return Una cadena que representa a la persona.
     */
    @Override
    public String toString() {
        return mostrarInformacion();
    }
}

