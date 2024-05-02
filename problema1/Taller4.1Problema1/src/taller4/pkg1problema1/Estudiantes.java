
package taller4.pkg1problema1;

public class Estudiantes {
    private String nombreE;
    private double calificacion1, calificacion2, calificacion3, promedio;
    private Universidades uni;
    
    public Estudiantes(String nombreE, double calificacion1, double calificacion2, double calificacion3, double promedio, Universidades uni) {
        this.nombreE = nombreE;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = promedio;
        this.uni = uni;
    }
    
    
    public Estudiantes(String nombreE, double calificacion1, double calificacion2, double promedio, Universidades uni) {
        this(nombreE, calificacion1, calificacion2, uni);
    }

    public Estudiantes(String nombreE, double calificacion1, double calificacion2, Universidades uni) {
        this.nombreE = nombreE;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.promedio = promedio;
        calificacion3=8.5;
        this.uni = uni;
    }
    
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }


    public Universidades getUni() {
        return uni;
    }

    public void setUni(Universidades uni) {
        this.uni = uni;
    }
    
    public String toString() {
        return "ESTUDIANTE\n"
                + "Nombre: " + nombreE + "\n"
                + "Calificación de materia 1: " + calificacion1 + "\n"
                + "Calificación de materia 2: " + calificacion2 + "\n"
                + "Calificación de materia 3: " + calificacion3 + "\n"
                + "Promedio: " + promedio + "\n"
                + "UNIVERSIDAD\n"
                + "Nombre: " + getUni().getNombre() + "\n"
                + "Dirección: " + getUni().getDireccion() + "\n";
    }

}
    
