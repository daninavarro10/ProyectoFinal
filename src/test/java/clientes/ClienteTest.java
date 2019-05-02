package clientes;

import es.uji.www.GeneradorDatosINE;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ClienteTest {
    GeneradorDatosINE gen = new GeneradorDatosINE();
    Direccion direccion = new Direccion(46530, gen.getProvincia(), gen.getPoblacion(gen.getProvincia()));
    private Cliente cli = new Cliente(gen.getNombre(), gen.getNIF(), direccion, "al@uji.es", LocalDate.now(), 0.05, "678162612");
    @Test
    public void crearCliente() {

    }
}