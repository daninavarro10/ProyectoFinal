package menu;

import Interfaces.InterfazMenu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println(EnumMenu.getMenu());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elija una opción: ");
        byte opcion = scanner.nextByte();

        EnumMenu opcionEnumMenu = EnumMenu.getOpcion(opcion);
        InterfazMenu menu;
        switch (opcionEnumMenu) {

            case CLIENTES:
                MenuClientes menuClientes = new MenuClientes();
                menuClientes.main();
                break;
            case LLAMADAS:
                MenuLlamadas menuLlamadas = new MenuLlamadas();
                menuLlamadas.main();
                break;
            case FACTURAS:
                MenuFacturas menuFacturas = new MenuFacturas();
                menuFacturas.main();
                break;
        }




    }
}
