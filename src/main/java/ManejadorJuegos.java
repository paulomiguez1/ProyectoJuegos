import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Interfaz que define métodos para obtener información sobre juegos.
 */
interface JuegoService {
    /**
     * Obtiene una lista de todos los juegos disponibles.
     *
     * @return La lista de juegos disponibles.
     */
    List<Juego> getJuegos();
    /**
     * Obtiene un juego específico por su identificador.
     *
     * @param id El identificador del juego.
     * @return El juego correspondiente al identificador dado.
     */
    Juego getJuegoPorId(int id);
}
/**
 * Implementación de la interfaz {@code JuegoService}.
 */
class JuegoServiceImpl implements JuegoService {
    private List<Juego> juegos;

    /**
     * Constructor que inicializa la lista de juegos con algunos juegos predefinidos.
     */

    public JuegoServiceImpl() {
        juegos = new ArrayList<>();
        juegos.add(new Juego("Mario Bros", "Juego clásico de plataformas", "https://ejemplo.com/mario"));
        juegos.add(new Juego("Minecraft", "Juego de construcción y aventura", "https://ejemplo.com/minecraft"));
        juegos.add(new Juego("League of Legends", "Juego de estrategia en equipo", "https://ejemplo.com/lol"));
    }

    @Override
    public List<Juego> getJuegos() {
        return juegos;
    }

    @Override
    public Juego getJuegoPorId(int id) {
        return juegos.get(id);
    }
}

/**
 * Clase principal que gestiona la interacción con el usuario para seleccionar y mostrar información sobre juegos.
 */
public class ManejadorJuegos {
    private static JuegoService juegoService = new JuegoServiceImpl();

    /**
     * Método principal que muestra los juegos disponibles, solicita al usuario que seleccione un juego
     * y muestra la información del juego seleccionado.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Mostrar los juegos disponibles
        System.out.println("Juegos Disponibles:");
        List<Juego> juegos = juegoService.getJuegos();
        for (int i = 0; i < juegos.size(); i++) {
            System.out.println((i + 1) + ". " + juegos.get(i).getNombre());
        }

        // Pedir al usuario que seleccione un juego
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione un juego (1-" + juegos.size() + "): ");
        int seleccion = scanner.nextInt();

        // Validar la selección del usuario
        if (seleccion < 1 || seleccion > juegos.size()) {
            System.out.println("Selección no válida");
            return;
        }

        // Mostrar información del juego seleccionado
        Juego juegoSeleccionado = juegoService.getJuegoPorId(seleccion - 1);
        System.out.println("Información del Juego:");
        System.out.println("Nombre: " + juegoSeleccionado.getNombre());
        System.out.println("Descripción: " + juegoSeleccionado.getDescripcion());
        System.out.println("URL de Descarga: " + juegoSeleccionado.getUrlDescarga());
    }
}
