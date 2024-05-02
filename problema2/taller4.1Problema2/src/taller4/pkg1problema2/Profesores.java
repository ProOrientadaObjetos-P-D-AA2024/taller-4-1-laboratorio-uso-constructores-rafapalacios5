
package taller4.pkg1problema2;

public class Profesores {
    private String nombre, apellido, cedula;
    private double sueldob, sueldot;
    private Provincias prov;

    public Profesores(String nombre, String apellido, String cedula, double sueldob, Provincias prov) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldob = sueldob;
        this.prov = prov;
    }
    
    public Profesores(String nombre, String apellido, double sueldob, Provincias prov) {
        this.nombre = nombre;
        this.apellido = apellido;
        cedula="1106012634";
        this.sueldob = sueldob;
        this.prov = prov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldob() {
        return sueldob;
    }

    public void setSueldob(double sueldob) {
        this.sueldob = sueldob;
    }

    public double getSueldot() {
        return sueldot;
    }

    public void setSueldot(double sueldot) {
        this.sueldot = sueldot;
    }
    
     public void calcularSueldo() {
        sueldot = (sueldob * 0.20) + sueldob;
    }

    public Provincias getProv() {
        return prov;
    }

    public void setProv(Provincias prov) {
        this.prov = prov;
    }
    public String toString() {
        return "PROFESOR\n"
                + "Nombre : " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Cedula de identidad: " + cedula + "\n"
                + "Sueldo basico: " + sueldob + "\n"
                + "Sueldo total: " + sueldot + "\n"
                + "PROVINCIA\n"
                + "Nombre: "+getProv().getNProvincia()+ "\n"
                + "Numero de habitantes: "+getProv().getNumHabitantes()+ "\n";
    }
    
}
