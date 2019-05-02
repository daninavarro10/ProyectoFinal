package clientes;

public class Direccion {
    private int codigoPostal;
    private String provincia;
    private String poblacion;

    public Direccion() {

    }

    public Direccion(int codigoPostal, String provincia, String poblacion) {
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }

    public String toString() {
        return "(" + codigoPostal + ", " + provincia + "," + poblacion + ")";
    }
}
