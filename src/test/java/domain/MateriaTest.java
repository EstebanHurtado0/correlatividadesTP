package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    @DisplayName("Test analisis 2")
    public void testCumpleCorrelativas() {
        Materia algebra = new Materia("Algebra", new HashSet<>());
        Materia analisis1 = new Materia("Analisis Matematico 1", new HashSet<>());


        Set<Materia> correlativasAM2 = Set.of(algebra, analisis1);
        Materia analisis2 = new Materia("Analisis Matematico 2", correlativasAM2);


        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(algebra);
        materiasAprobadas.add(analisis1);


        assertTrue(analisis2.cumpleCorrelativas(materiasAprobadas),
                "El alumno cumple con las correlativas");
    }
    @Test
    @DisplayName("No cumple correlativas")
    public void testNoSeCumplenCorrelativas() {
        Materia algebra = new Materia("Algebra", new HashSet<>());
        Materia analisis1 = new Materia("Analisis Matematico 1", new HashSet<>());


        Set<Materia> correlativasAM2 = Set.of(algebra, analisis1);
        Materia analisis2 = new Materia("Analisis Matematico 2", correlativasAM2);


        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(algebra);

        assertFalse(analisis2.cumpleCorrelativas(materiasAprobadas),
                "El alumno no cumple con las correlativas");
    }
}
