package Herencia;

public class Tortuga extends Animal {
    //ATRIBUTOS

    private boolean aletas;
    private String tipo;

    //CONSTRUCTOR

    public Tortuga(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico, boolean aletas, String tipo) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
        this.aletas = aletas;
        this.tipo = tipo;
    }

    //SOBRECARGA DEL CONSTRUCTOR
    public Tortuga(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico) {
        super(edad, tamanio, especie, habitat, conPelo, acuatico);
    }



    //SETTERS AND GETTERS
    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    //toString

    @Override
    public String toString() {
        return "Tortuga{" +
                "aletas=" + aletas +
                ", tipo='" + tipo + '\'' +
                ", edad=" + edad +
                ", tamanio=" + tamanio +
                ", especie='" + especie + '\'' +
                ", habitat='" + habitat + '\'' +
                ", conPelo=" + conPelo +
                ", acuatico=" + acuatico +
                '}';
    }

    //METODOS

    public void nadar() {
        System.out.println("La tortuga está nadando.");
    }

    public void ocultar() {
        System.out.println("La tortuga se ha ocultado.");
    }

    public void cazar() {
        System.out.println("La tortuga está cazando.");
    }
}
