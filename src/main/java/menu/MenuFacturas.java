package menu;

import java.util.Scanner;

public class MenuFacturas {
    public static void main() {
        System.out.println(EnumFacturas.getMenu());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elija una opción: ");
        byte opcion = scanner.nextByte();

        EnumFacturas opcionMenu = EnumFacturas.getOpcion(opcion);
        switch(opcionMenu) {
            case EMITIR_FACTURA:
                System.out.println("emitir factura");
                break;
            case RECUPERAR_DATOS:
                System.out.println("recuperar datos");
                break;
            case RECUPERAR_FACTURAS:
                System.out.println("recuperar facturas");
                break;
        }
    }
}
