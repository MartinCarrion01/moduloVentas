package unit.ventas;

import model.Pago;
import model.Venta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(Double.valueOf(400200), totalFactorizado);
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
//
//    @Test
//    public void tieneEnvio(){
//        Venta venta = new Venta();
//        assertTrue(venta.getEnvio() != null);
//    }
}
