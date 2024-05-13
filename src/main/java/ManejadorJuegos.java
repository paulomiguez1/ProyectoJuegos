import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManejadorJuegos {
    public static void main(String[] args) {
        // Crear algunos juegos de ejemplo
        Juego juego1 = new Juego("Mario Bros", "Juego clásico de plataformas", "https://ejemplo.com/mario");
        Juego juego2 = new Juego("Minecraft", "Juego de construcción y aventura", "https://ejemplo.com/minecraft");
        Juego juego3 = new Juego("League of Legends", "Juego de estrategia en equipo", "https://ejemplo.com/lol");

        // Agregar los juegos a una lista
        List<Juego> juegos = new ArrayList<>();
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);

        // Mostrar los juegos disponibles
        System.out.println("Juegos Disponibles:");
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

        // Obtener el juego seleccionado
        Juego juegoSeleccionado = juegos.get(seleccion - 1);

        // Mostrar información del juego seleccionado
        System.out.println("Información del Juego:");
        System.out.println("Nombre: " + juegoSeleccionado.getNombre());
        System.out.println("Descripción: " + juegoSeleccionado.getDescripcion());
        System.out.println("URL de Descarga: " + juegoSeleccionado.getUrlDescarga());
    }
}