package menu;

import clientes.Cliente;
import clientes.ConjuntoFacturas;
import clientes.Direccion;
import clientes.Particulares;
import es.uji.www.GeneradorDatosINE;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuClientes {
    public static void main() {
        ConjuntoFacturas conj = new ConjuntoFacturas();
        GeneradorDatosINE gen = new GeneradorDatosINE();
        Direccion direccion = new Direccion(46530, gen.getProvincia(), gen.getPoblacion(gen.getProvincia()));
        Cliente cli = new Particulares(gen.getNombre(), gen.getNIF(), direccion, "al@uji.es", LocalDate.now(), 0.05, "678162612", "apellidos");

        System.out.println(EnumClientes.getMenu());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elija una opción: ");
        byte opcion = scanner.nextByte();

        EnumClientes opcionMenu = EnumClientes.getOpcion(opcion);
        switch (opcionMenu) {
            case ALTA_CLIENTE:
                System.out.println("alta cliente");
                conj.altaCliente(cli);
                break;
            case BAJA_CLIENTE:
                System.out.println("baja cliente");
                break;
            case CAMBIAR_TARIFA:
                System.out.println("cambiar tarifa");
                break;
            case RECUPERAR_DATOS:
                System.out.println("recuperar datos");
                break;
            case RECUPERAR_LISTADO:
                System.out.println("recuperar listado");
                break;
            case LISTADO_FECHAS:
                System.out.println("listado fechas");
                break;
        }




    }


}
