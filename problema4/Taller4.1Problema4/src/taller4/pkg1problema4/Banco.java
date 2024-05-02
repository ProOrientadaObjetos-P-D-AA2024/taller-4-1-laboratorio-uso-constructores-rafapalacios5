
package taller4.pkg1problema4;
public class Banco {
    String nombre;
    int Sucursales;

    public Banco(String nombre, int Sucursales) {
        this.nombre = nombre;
        this.Sucursales = Sucursales;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSucursales() {
        return Sucursales;
    }

    public void setSucursales(int Sucursales) {
        this.Sucursales = Sucursales;
    } 
}
