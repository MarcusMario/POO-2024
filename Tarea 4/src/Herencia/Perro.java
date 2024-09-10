package Herencia;

public class Perro extends Animal {
    //ATRIBUTOS
    private String raza;
    private String color;

    //CONSTRUCTOR

    public Perro(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico, String raza, String color) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
        this.raza = raza;
        this.color = color;
    }

    //SOBRECARGADO

    public Perro(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico) {
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
        return "Perro{" +
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
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    public void olfatear() {
        System.out.println("El perro está olfateando.");
    }

    public void jugar() {
        System.out.println("El perro está jugando.");
    }


}
