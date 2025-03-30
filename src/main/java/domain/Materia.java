package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Materia {
    private Set<Materia> correlativas;
    private String nombre;

    public Materia(String nombre, Set<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas != null ? correlativas : new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean cumpleCorrelativas(Set<Materia> materias) {
        return correlativas.isEmpty() || materias.containsAll(correlativas);
    }

    public Set<Materia> getCorrelativasAprobadas(Set<Materia> materias) {
        return materias.stream()
                .filter(correlativas::contains)
                .collect(Collectors.toSet());
    }
}
