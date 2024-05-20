import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Clase de prueba unitaria para {@link JuegoServiceImpl}.
 * Verifica que los métodos de la implementación del servicio de juegos funcionan correctamente.
 */
public class JuegoServiceImplTest {

    private JuegoServiceImpl juegoService;

    /**
     * Configura el entorno de prueba inicializando una instancia de {@link JuegoServiceImpl}.
     */
    @Before
    public void setUp() {
        juegoService = new JuegoServiceImpl();
    }

    /**
     * Prueba que el método {@link JuegoServiceImpl#getJuegos()} devuelve una lista no nula
     * con el número correcto de juegos predefinidos.
     */
    @Test
    public void testGetJuegos() {
        List<Juego> juegos = juegoService.getJuegos();
        assertNotNull(juegos);
        assertEquals(3, juegos.size());
    }

    /**
     * Prueba que el método {@link JuegoServiceImpl#getJuegoPorId(int)} devuelve
     * el juego correcto basado en su identificador.
     */
    @Test
    public void testGetJuegoPorId() {
        Juego juego = juegoService.getJuegoPorId(0);
        assertNotNull(juego);
        assertEquals("Mario Bros", juego.getNombre());

        juego = juegoService.getJuegoPorId(1);
        assertNotNull(juego);
        assertEquals("Minecraft", juego.getNombre());

        juego = juegoService.getJuegoPorId(2);
        assertNotNull(juego);
        assertEquals("League of Legends", juego.getNombre());
    }

    /**
     * Prueba que el método {@link JuegoServiceImpl#getJuegoPorId(int)} lanza una
     * {@link IndexOutOfBoundsException} cuando se proporciona un identificador inválido.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetJuegoPorIdInvalid() {
        juegoService.getJuegoPorId(3);
    }
}
