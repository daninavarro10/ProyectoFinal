package llamadas;

import Interfaces.InterfazFechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Llamada implements InterfazFechas{
    private String telefono;
    private LocalDateTime fechaHora;
    private double duracion;

    public Llamada() {}

    public Llamada (String telefono, LocalDateTime fechaHora, double duracion) {
        this.telefono = telefono;
        this.fechaHora = fechaHora;
        this.duracion = duracion;
    }

    @Override
    public LocalDate getFecha() {
        return fechaHora.toLocalDate();
    }

    public String toString() {
        return "Llamada:\nTelefono: " + telefono + "\tFecha: " + fechaHora.toLocalDate() + "\tHora: " + fechaHora.toLocalTime() + "\tDuracion: " + duracion;
    }
}
