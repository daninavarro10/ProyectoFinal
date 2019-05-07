package menu;

public enum EnumLlamadas {
    ALTA_LLAMADA("Dar de alta una llamada."),
    LISTAR_LLAMADAS("Listar todas las llamadas de un cliente.");

    private String descripcion;

    private EnumLlamadas(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EnumLlamadas getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (EnumLlamadas opcion: EnumLlamadas.values()) {
            sb.append(opcion.ordinal());
            sb.append(".-");
            sb.append(opcion.getDescripcion());
            sb.append("\n");
        }
        return sb.toString();
    }
}
