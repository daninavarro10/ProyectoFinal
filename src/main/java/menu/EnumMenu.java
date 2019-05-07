package menu;

public enum EnumMenu {
    CLIENTES("Acciones para los clientes."),
    LLAMADAS("Acciones para las llamadas."),
    FACTURAS("Acciones para las facturas.");

    private String descripcion;

    private EnumMenu(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EnumMenu getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (EnumMenu opcion: EnumMenu.values()) {
            sb.append(opcion.ordinal());
            sb.append(".-");
            sb.append(opcion.getDescripcion());
            sb.append("\n");
        }
        return sb.toString();
    }
}
