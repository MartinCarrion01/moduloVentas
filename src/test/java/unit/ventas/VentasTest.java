package unit.ventas;

import model.Pago;
import model.Venta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class VentasTest {

    Venta venta;

    @BeforeEach
    public void CrearVenta(){
        venta = new Venta();
    }

    @Test()
    public void TotalEsTipoDoubleTest(){
        venta.total = 2000.0;
        assertEquals("Double", venta.total.getClass().getSimpleName());
    }

    @Test
    public void TotalFactorizadoPor200Test(){
        venta.total = 2000.0;
        Double totalFactorizado = venta.factorizar();
        System.out.println("hola");
        assertEquals(Double.valueOf(400070), totalFactorizado);
    }

    @Test
    public void VentaTieneAtributoPagoDeTipoPagoTest(){
        venta.setPago(new Pago());
        Pago pago = venta.getPago();
        assertTrue(pago instanceof Pago);
    }

    @Test
    public void VentaTieneAsociadoUnPago(){
        System.out.println("Hola");
        venta.setPago(new Pago());
        assertNotNull(venta.getPago());
    }
    void fechaNoPuedeSerMayorALaActual(){
        LocalDate date = LocalDate.parse("2000-01-08");
        Venta venta = new Venta();
        assertTrue(venta.setFecha(date));
    }
    @Test
    void totalNoPuedeSerNegativo(){
        Venta venta = new Venta();
        assertFalse(venta.setTotal(-0.1));
    }
//
//    @Test
//    public void tieneEnvio(){
//        Venta venta = new Venta();
//        assertTrue(venta.getEnvio() != null);
//    }
}
