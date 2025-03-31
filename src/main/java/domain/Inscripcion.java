package domain;

import java.time.LocalDateTime;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasACursar;
    private boolean aprobada;
    private LocalDateTime fechaDeEvaluacion;

    public Inscripcion(Set<Materia> materiasACursar) {
        this.materiasACursar = materiasACursar;
        this.aprobada = false;
    }


    public boolean aprobada(){
        return aprobada = true;
    }

    public LocalDateTime getFechaDeEvaluacion() {
        return fechaDeEvaluacion;
    }


}
