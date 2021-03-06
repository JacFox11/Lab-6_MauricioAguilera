
package lab.pkg6_mauricioaguilera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarPeliculas {
    ArrayList <Pelicula> peliculas = new ArrayList();
    private File archivo=null;

    public AdministrarPeliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "peliculas=" + peliculas;
    }
    
    public void SetPelicula (Pelicula P){
        this.peliculas.add(P);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Pelicula t : peliculas) {
                bw.write(t.getNombre()+";");
                bw.write(t.getTiempo()+";");
                bw.write(t.getCategoria()+";");
                bw.write(t.getActores()+";");
                bw.write(t.getDirector()+";");
                bw.write(t.getCompania()+";");
                bw.write(t.getIdioma()+";");
                bw.write(t.getDoblaje()+";");
                bw.write(t.getSubtitulos()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void CargarArchivo() {
        Scanner sc= null;
        peliculas = new ArrayList();
        if (archivo.exists()){
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    peliculas.add(new Pelicula(sc.next(), 
                            sc.nextInt(), 
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
