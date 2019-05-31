
package lab.pkg6_mauricioaguilera;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class AdministrarUsuarios {
    ArrayList <Usuario> usuarios = new ArrayList();
    private File archivo=null;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "usuarios=" + usuarios;
    }
    
    public void CargarArchivo() {
        Scanner sc= null;
        usuarios = new ArrayList();
        if (archivo.exists()){
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()){
                    usuarios.add(new Usuario(sc.next(), 
                            sc.nextInt(), 
                            sc.next())
                    );
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
