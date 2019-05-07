package menu;

public enum EnumClientes {
    ALTA_CLIENTE("Dar de alta un nuevo cliente."),
    BAJA_CLIENTE("Borrar un cliente."),
    CAMBIAR_TARIFA("Cambiar la tarifa de un cliente."),
    RECUPERAR_DATOS("Recuperar los datos de un cliente a partir de su NIF."),
    RECUPERAR_LISTADO("Recuperar el listado de todos los clientes."),
    LISTADO_FECHAS("Mostrar un listado de clientes que fueron dados de alta entre dos fechas.");
    private String descripcion;

    private EnumClientes(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EnumClientes getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (EnumClientes opcion: EnumClientes.values()) {
            sb.append(opcion.ordinal());
            sb.append(".-");
            sb.append(opcion.getDescripcion());
            sb.append("\n");
        }
        return sb.toString();
    }
}