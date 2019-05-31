
package lab.pkg6_mauricioaguilera;


public class Serie {
    private String nombre;
    private int tiempo;
    private String categoría;
    private String actores;
    private int temporadas;
    private String productor;
    private String idioma;
    private String doblaje;
    private String subtítulos;

    public Serie(String nombre, int tiempo, String categoría, String actores, int temporadas, String productor, String idioma, String doblaje, String subtítulos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.categoría = categoría;
        this.actores = actores;
        this.temporadas = temporadas;
        this.productor = productor;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtítulos = subtítulos;
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

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
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

    public String getSubtítulos() {
        return subtítulos;
    }

    public void setSubtítulos(String subtítulos) {
        this.subtítulos = subtítulos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
