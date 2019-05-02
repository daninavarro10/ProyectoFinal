package clientes;

import java.time.LocalDate;

public class Particulares extends Cliente {
    private String apellidos;

    public Particulares() {
        super();
    }

    public Particulares(String nombre, String NIF, Direccion direccion, String correoElectronico, LocalDate fechaAlta, double tarifa, String telefono, String apellidos) {
        super(nombre, NIF, direccion, correoElectronico, fechaAlta, tarifa, telefono);
        this.apellidos = apellidos;
    }
}
