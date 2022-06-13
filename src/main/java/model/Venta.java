package model;

public class Venta {

    public Double total;
    private Pago pago;

    public Double factorizar() {
        return this.total * 200.0;
    }

    public Pago getPago() {
        return this.pago;
    }

    public void setPago(Pago pago){
        this.pago = pago;
    }
}
