package clientes;

import java.time.LocalDate;

public class Empresa extends Cliente{

    public Empresa() {
        super();
    }

    public Empresa(String nombre, String NIF, Direccion direccion, String correoElectronico, LocalDate fechaAlta, double tarifa, String telefono) {
        super(nombre, NIF, direccion, correoElectronico, fechaAlta, tarifa, telefono);
    }
}
