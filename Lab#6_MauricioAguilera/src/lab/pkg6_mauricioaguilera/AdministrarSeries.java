
package lab.pkg6_mauricioaguilera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarSeries {
    ArrayList <Serie> series = new ArrayList();
    private File archivo=null;

    public AdministrarSeries(String path) {
        archivo = new File(path);
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "series=" + series;
    }
    
    public void SetSerie (Serie s){
        this.series.add(s);
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Serie t : series) {
                bw.write(t.getNombre()+";");
                bw.write(t.getTiempo()+";");
                bw.write(t.getCategoria()+";");
                bw.write(t.getActores()+";");
                bw.write(t.getTemporadas()+";");
                bw.write(t.getProductor()+";");
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
        series = new ArrayList();
        if (archivo.exists()){
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    series.add(new Serie(sc.next(), 
                            sc.nextInt(), 
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
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
