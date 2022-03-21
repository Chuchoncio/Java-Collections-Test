
package entidades;

import java.util.Comparator;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer dni;

    public Alumno(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Alumno() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    public static Comparator<Alumno> compararDni = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno al1, Alumno al2) {
            return al1.getDni().compareTo(al2.getDni());
        }
    };
}
