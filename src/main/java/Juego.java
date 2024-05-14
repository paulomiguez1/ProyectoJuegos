/**
 * Clase que representa un juego con su nombre, descripción y URL de descarga.
 */
class Juego {
    private String nombre;
    private String descripcion;
    private String urlDescarga;

    /**
     * Constructor que inicializa un juego con su nombre, descripción y URL de descarga.
     *
     * @param nombre       El nombre del juego.
     * @param descripcion  La descripción del juego.
     * @param urlDescarga  La URL de descarga del juego.
     */
    public Juego(String nombre, String descripcion, String urlDescarga) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlDescarga = urlDescarga;
    }

    /**
     * Obtiene el nombre del juego.
     *
     * @return El nombre del juego.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la descripción del juego.
     *
     * @return La descripción del juego.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la URL de descarga del juego.
     *
     * @return La URL de descarga del juego.
     */
    public String getUrlDescarga() {
        return urlDescarga;
    }
}
