package domain;

import java.time.LocalDateTime;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasACursar;
    private boolean fueAprobada;
    private LocalDateTime fechaDeEvaluacion;

    public Inscripcion(Set<Materia> materiasACursar) {
        this.materiasACursar = materiasACursar;
        this.fueAprobada = false;
    }


    public boolean fueAprobada(){
        return fueAprobada;
    }

    public LocalDateTime getFechaDeEvaluacion() {
        return fechaDeEvaluacion;
    }


}
