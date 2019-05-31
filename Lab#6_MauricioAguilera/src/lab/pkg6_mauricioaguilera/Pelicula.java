
package lab.pkg6_mauricioaguilera;


public class Pelicula {
    private String nombre;
    private int tiempo;
    private String categoría;
    private String actores;
    private String director;
    private String compañía;
    private String idioma;
    private String doblaje;
    private String subtítulos;

    public Pelicula(String nombre, int tiempo, String categoría, String actores, String director, String compañía, String idioma, String doblaje, String subtítulos) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.categoría = categoría;
        this.actores = actores;
        this.director = director;
        this.compañía = compañía;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompañía() {
        return compañía;
    }

    public void setCompañía(String compañía) {
        this.compañía = compañía;
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
