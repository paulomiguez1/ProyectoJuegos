import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ManejadorJuegosTest {
    @Test
    public void testSeleccionInvalida() {
        // Simula la entrada del usuario con un número fuera de rango
        String input = "5\n"; //solo hay 3 juegos
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

