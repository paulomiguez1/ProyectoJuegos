import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JuegoServiceImplTest {
    private JuegoServiceImpl juegoService;

    @Before
    public void setUp() {
        juegoService = new JuegoServiceImpl();
    }

    @Test
    public void testGetJuegos() {
        List<Juego> juegos = juegoService.getJuegos();
        assertNotNull(juegos);
        assertEquals(3, juegos.size());
    }

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

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetJuegoPorIdInvalid() {
        juegoService.getJuegoPorId(3);
    }
}
