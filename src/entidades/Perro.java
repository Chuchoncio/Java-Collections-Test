
package entidades;

import java.util.Comparator;

public class Perro {
    private Integer edad;
    private String nombre;

    public Perro(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Perro() {
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" + "edad=" + edad + ", nombre=" + nombre + '}';
     }
    
    public static Comparator<Perro> compararEdad = new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return p2.getEdad().compareTo(p1.getEdad());
        }
    };
}
