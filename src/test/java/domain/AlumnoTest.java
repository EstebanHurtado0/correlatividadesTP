package domain;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class AlumnoTest {
    @Test
    void testMateriasAprobadas() {
    Alumno alumno = new Alumno("Esteban","Hurtado");
    Materia discreta = new Materia("Discreta", Set.of());
    Materia algoritmos = new Materia("Algoritmos", Set.of());
    Materia sintaxis = new Materia("Sintaxis", Set.of(discreta,algoritmos));

    alumno.agregarMateriaAprobada(discreta);
    alumno.agregarMateriaAprobada(algoritmos);

    assertTrue(sintaxis.cumpleCorrelativas(alumno.getMateriasAprobadas()),"Cumple con las Correlativas");

    }
}