class Juego {
    private String nombre;
    private String descripcion;
    private String urlDescarga;

    public Juego(String nombre, String descripcion, String urlDescarga) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlDescarga = urlDescarga;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }
}
