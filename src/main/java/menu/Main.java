package menu;

import clientes.Cliente;
import clientes.Direccion;
import clientes.Empresa;
import clientes.Particulares;
import es.uji.www.GeneradorDatosINE;
import llamadas.Llamada;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        GeneradorDatosINE gen = new GeneradorDatosINE();
        Direccion direccion = new Direccion(46530, gen.getProvincia(), gen.getPoblacion(gen.getProvincia()));
        Cliente cli = new Particulares(gen.getNombre(), gen.getNIF(), direccion, "al@uji.es", LocalDate.now(), 0.05, "678162612", "apellidos");
        Cliente cli2 = new Empresa();

        System.out.println(cli.getFecha());
        System.out.println(cli.toString());
        System.out.println(cli2.getFecha());

        Llamada ll = new Llamada("654273273", LocalDateTime.now(), 10);
        System.out.println(ll.getFecha());
        System.out.println(ll);
    }
}
