package FIGURA;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura cuadrado = new Cuadrado(4.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
