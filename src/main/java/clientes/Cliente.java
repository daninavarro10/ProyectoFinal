package clientes;

import Interfaces.InterfazFechas;

import java.time.LocalDate;

public class Cliente implements InterfazFechas {
    private String nombre;
    private String NIF;
    private Direccion direccion;
    private String correoElectronico;
    private LocalDate fechaAlta;
    private String telefono;
    private double tarifa;

    public Cliente() { }

    public Cliente(String nombre, String NIF, Direccion direccion, String correoElectronico, LocalDate fechaAlta, double tarifa, String telefono) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.fechaAlta = fechaAlta;
        this.tarifa = tarifa;
        this.telefono = telefono;
    }
    @Override
    public LocalDate getFecha() {
        return fechaAlta;
    }

    //public String getNIF() { return NIF; }

    public String toString() {
        return nombre + ",  " + NIF + ",  " + direccion + ",  " + correoElectronico + ",  " + fechaAlta + ",  " + tarifa + ",  " + telefono;
    }
}
