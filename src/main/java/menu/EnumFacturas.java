package menu;

public enum EnumFacturas {
    EMITIR_FACTURA("Emitir una factura para un cliente, calculando el importe de la misma en función de las llamadas."),
    RECUPERAR_DATOS("Recuperar los datos de una factura a partir de su código."),
    RECUPERAR_FACTURAS("Recuperar todas las facturas de un cliente.");

    private String descripcion;

    private EnumFacturas(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static EnumFacturas getOpcion(int posicion) {
        return values()[posicion];
    }

    public static String getMenu() {
        StringBuilder sb = new StringBuilder();
        for (EnumFacturas opcion: EnumFacturas.values()) {
            sb.append(opcion.ordinal());
            sb.append(".-");
            sb.append(opcion.getDescripcion());
            sb.append("\n");
        }
        return sb.toString();
    }
}
