package model;

import java.time.LocalDate;

public class Venta {

    public Double total;
    private Pago pago;
    private LocalDate fecha;

    public Double factorizar() {
        return this.total * 200.0;
    }

    public Pago getPago() {
        return this.pago;
    }

    public void setPago(Pago pago){
        this.pago = pago;
    }
    //retornamos true si el total es mayor o igual que cero
    //y se settea el atributo
    //sino retornamos false y no se setea
    public Boolean setTotal(Double total) {
        if(total>=0) {
            this.total = total;
            return true;
        }else{
            return false;
        }
    }
    //retornamos true si la fecha no es mayor que la actual
    //y se settea el atributo
    //sino retornamos false y no se setea
    public Boolean setFecha(LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
        if(fecha.isBefore(fechaActual)){
        this.fecha = fecha;
        return true;
    } else{
            return false;
        }
    }
}
