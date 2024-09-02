package tarea2;

/**
 * La clase CuentaBancaria representa una cuenta bancaria con atributos de número de cuenta, tipo de cuenta y saldo.
 * En este ejemplo en particular represente una cuenta de débito con saldo inicial de 100 pesos.
 */
public class CuentaBancaria {
    // Atributos

    /**
     * Número de la cuenta bancaria: se almacenará un valor de tipo String.
     */
    private String numeroCuenta;

    /**
     * Tipo de cuenta bancaria: se almacenará un valor de tipo String.
     */
    private String tipoCuenta;

    /**
     * Saldo actual de la cuenta bancaria: se almacenará un valor de tipo double.
     */
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "5210235689";
        this.tipoCuenta = "Debito";
        this.saldo = 100.0;
    }

    /**
     * Constructor sobrecargado que permite inicializar una cuenta bancaria con número de cuenta, tipo de cuenta y saldo específicos.
     *
     * @param numeroCuenta Número de la cuenta bancaria.
     * @param tipoCuenta Tipo de cuenta bancaria.
     * @param saldo Saldo inicial de la cuenta bancaria.
     */
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    /**
     * Constructor sobrecargado que permite inicializar una cuenta bancaria solo con número de cuenta y tipo de cuenta,
     * estableciendo el saldo en un valor por defecto (100 pesos).
     *
     * @param numeroCuenta Número de la cuenta bancaria.
     * @param tipoCuenta Tipo de cuenta bancaria.
     */
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 100.0; // Saldo por defecto
    }

    // Métodos

    /**
     * Realiza un depósito en la cuenta bancaria.
     *
     * @param monto Monto a depositar.
     */
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
    }

    /**
     * Realiza un retiro de la cuenta bancaria si el saldo es suficiente.
     *
     * @param monto Monto a retirar.
     */
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro de $" + monto);
        }
    }

    /**
     * Muestra el saldo actual de la cuenta bancaria.
     *
     * @return Saldo actual.
     */
    public double mostrarSaldo() {
        System.out.println("El saldo actual es: $" + saldo);
        return saldo;
    }

    /**
     * Representación en formato de cadena del objeto CuentaBancaria.
     *
     * @return Una cadena que representa la cuenta bancaria.
     */
    @Override
    public String toString() {
        return "Cuenta Bancaria: " + numeroCuenta + " (" + tipoCuenta + "), Saldo: $" + saldo;
    }
}

