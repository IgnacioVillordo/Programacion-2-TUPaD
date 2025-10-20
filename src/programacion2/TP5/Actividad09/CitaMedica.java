package programacion2.TP5.Actividad09;

import java.time.LocalTime;
import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private LocalTime hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(Date fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
