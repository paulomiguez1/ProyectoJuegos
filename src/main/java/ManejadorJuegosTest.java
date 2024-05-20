import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Clase de prueba unitaria para {@link ManejadorJuegos}.
 * Verifica el manejo de selecciones no válidas por parte del usuario en el método principal.
 */
public class ManejadorJuegosTest {

    /**
     * Prueba que el método principal maneje correctamente la selección no válida del usuario.
     * Simula la entrada del usuario con un número fuera de rango y verifica que se muestre el mensaje adecuado.
     */
    @Test
    public void testSeleccionInvalida() {
        // Simula la entrada del usuario con un número fuera de rango
        String input = "5\n"; // Solo hay 3 juegos disponibles
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Captura la salida del sistema
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecuta el método principal
        ManejadorJuegos.main(new String[]{});

        // Verifica que la salida contiene el mensaje de selección no válida
        assertEquals(true, outContent.toString().contains("Selección no válida"));
    }
}
