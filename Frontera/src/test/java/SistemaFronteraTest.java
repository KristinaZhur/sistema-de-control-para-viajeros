import gestorFrontera.SistemaFrontera;
import gestorFrontera.Viajero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaFronteraTest {
    /**
     * Test verifica el accesso a traves del documento del viajero
     */
    @Test
    public void testAccesoPermitido() {
        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Juan", "pasaporte123");

        sistemaFrontera.verificar(viajero);
        assertEquals("Dentro del país", sistemaFrontera.obtenerEstado(),
                "El estado del viajero debería ser 'Dentro del país'");
    }

    @Test
    public void testAccesoDenegadoPorDocumento() {

        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Ana", "");

        // Проверяем, что доступ был отклонен
        sistemaFrontera.verificar(viajero);
        assertEquals("Bloqueado", sistemaFrontera.obtenerEstado(),
                "El estado del viajero debería ser 'Bloqueado'");
    }

    @Test
    public void testAccesoDenegadoPorEscaneo() {
        SistemaFrontera sistemaFrontera = new SistemaFrontera();
        Viajero viajero = new Viajero("Carl", "pasaporte456");

        sistemaFrontera.verificar(viajero);
        assertEquals("Bloqueado", sistemaFrontera.obtenerEstado(), "El estado del viajero debería ser 'Bloqueado'");
    }
}
