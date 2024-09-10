package Herencia;

public class Gato extends Animal {

    //ATRIBUTOS
    private String raza;
    private String color;

    //CONSTRUCTOR

    public Gato(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico, String raza, String color) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
        this.raza = raza;
        this.color = color;
    }

    //SOBRECARGA

    public Gato(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
    }

    //SETTERS AND GETTERS

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", tamanio=" + tamanio +
                ", especie='" + especie + '\'' +
                ", habitat='" + habitat + '\'' +
                ", conPelo=" + conPelo +
                ", acuatico=" + acuatico +
                '}';
    }

    //METODOS
    public void maullar() {
        System.out.println("El gato está maullando.");
    }

    public void araniar() {
        System.out.println("El gato está arañando.");
    }

    public void exigirAtencion() {
        System.out.println("El gato está exigiendo atención.");
    }

}
