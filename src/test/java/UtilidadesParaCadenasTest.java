import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UtilidadesParaCadenasTest {
    private UtilidadParaCadenas upc= new UtilidadParaCadenas();

    @Test
    public void testConcatenarStrStr() {
        assertEquals("HolaMundo", upc.concatenar("Hola", "Mundo"));
    }

    @Test
    public void testConcatenarStrNull() {
        assertEquals("Hola", upc.concatenar("Hola", null));
    }

    @Test
    public void testConcatenarNullStr() {
        assertEquals("Mundo", upc.concatenar(null, "Mundo"));
    }

    @Test
    public void testConcatenarNullNull() {
        assertEquals("", upc.concatenar(null, null));
    }

    @Test
    public void testObtenerLongitudConNull() {
        assertEquals(0, upc.obtenerLongitud(null));
    }

    @Test
    public void testObtenerLongitudConCadenaNoNula() {
        assertEquals(4, upc.obtenerLongitud("Hola"));
    }

    @Test
    public void testObtenerLongitudConCadenaVacia() {
        assertEquals(0, upc.obtenerLongitud(""));
    }

    @Test
    public void testConvertirMayusculasConCadenaNoNula() {
        assertEquals("HOLA", upc.convertirMayusculas("Hola"));
    }

    @Test
    public void testConvertirMayusculasConCadenaVacia() {
        assertEquals("", upc.convertirMayusculas(""));
    }

    @Test
    public void testConvertirMayusculasConNull() {
        assertNull(upc.convertirMayusculas(null));
    }

}
