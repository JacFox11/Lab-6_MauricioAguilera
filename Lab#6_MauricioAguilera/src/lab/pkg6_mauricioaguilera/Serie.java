
package lab.pkg6_mauricioaguilera;


public class Serie {
    private String nombre;
    private int tiempo;
    private String categoria;
    private String actores;
    private int temporadas;
    private String productor;
    private String idioma;
    private String doblaje;
    private String subtitulos;

    public Serie(String nombre, int tiempo, String categoría, String actores, int temporadas, String productor, String idioma, String doblaje, String subtítulos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.categoria = categoría;
        this.actores = actores;
        this.temporadas = temporadas;
        this.productor = productor;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos = subtítulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
