package menu;

import java.util.Scanner;

public class MenuLlamadas {
    public static void main() {
        System.out.println(EnumLlamadas.getMenu());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elija una opción: ");
        byte opcion = scanner.nextByte();

        EnumLlamadas opcionMenu = EnumLlamadas.getOpcion(opcion);
        switch(opcionMenu) {
            case ALTA_LLAMADA:
                System.out.println("alta llamada");
                break;
            case LISTAR_LLAMADAS:
                System.out.println("listar llamadas");
                break;
        }
    }
}
