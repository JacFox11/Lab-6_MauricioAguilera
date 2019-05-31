
package lab.pkg6_mauricioaguilera;


public class Usuario {
    private String nombre;
    private int cuenta;
    private String pass;

    public Usuario(String nombre, int cuenta, String pass) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "           pass=" + pass;
    }
    
    
}
