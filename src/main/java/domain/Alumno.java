package domain;


import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void agregarMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public Set<Materia> getMateriasAprobadas() {
        return new HashSet<>(materiasAprobadas);
    }

}
