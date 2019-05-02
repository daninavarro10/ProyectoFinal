package facturas;

import Interfaces.InterfazFechas;

import java.time.LocalDate;

public class Factura implements InterfazFechas {
    private int codigoFactura;
    private double tarifa;
    private LocalDate fechaEmision;
    private LocalDate periodoFacturacion;
    private double importe;

    public Factura() {}

    public Factura(int codigoFactura, double tarifa, LocalDate fechaEmision, LocalDate periodoFacturacion, double importe) {
        this.codigoFactura = codigoFactura;
        this.tarifa = tarifa;
        this.fechaEmision = fechaEmision;
        this.periodoFacturacion = periodoFacturacion;
        this.importe = importe;
    }

    @Override
    public LocalDate getFecha() {
        return fechaEmision;
    }

}
