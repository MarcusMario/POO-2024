package Herencia;

public class Animal {
    //ATRIBUTOS
    protected int edad;
    protected double tamanio;
    protected String especie;
    protected String habitat;
    protected boolean conPelo;
    protected boolean acuatico;

    //CONSTRUCTOR
    public Animal(int edad, double tamanio, String especie, String habitat, boolean conPelo, boolean acuatico) {
        this.edad = edad;
        this.tamanio = tamanio;
        this.especie = especie;
        this.habitat = habitat;
        this.conPelo = conPelo;
        this.acuatico = acuatico;
    }

    //SOBRECARGA DEL CONSTRUCTOR
    public Animal() {
    }

    //SETTERS AND GETTERS
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isConPelo() {
        return conPelo;
    }

    public void setConPelo(boolean conPelo) {
        this.conPelo = conPelo;
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }


    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", tamanio=" + tamanio +
                ", especie='" + especie + '\'' +
                ", habitat='" + habitat + '\'' +
                ", conPelo=" + conPelo +
                ", acuatico=" + acuatico +
                '}';
    }


    //METODODS

    public void respirar () {
        System.out.println("El animal esta respirando. ");
    }

    public void comer () {
        System.out.println("El animal esta comiendo. ");
    }

    public void dormir () {
        System.out.println("El animal esta durmiendo. ");
    }

    public void moverse () {
        System.out.println("El animal se esta moviendo");
    }
}
