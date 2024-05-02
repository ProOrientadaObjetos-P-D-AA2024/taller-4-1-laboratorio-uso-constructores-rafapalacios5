
package taller4.pkg1problema3;

public class Automotor {
    private String cedulaD;
    private int anioF;
    private double valorV, valorM;
    private Fabrica fab;

    public Automotor(String cedulaD, int anioF, double valorV, Fabrica fab) {
        this.cedulaD = cedulaD;
        this.anioF = anioF;
        this.valorV = valorV;
        this.fab = fab;
    }

    public Automotor(String cedulaD, int anioF, Fabrica fab) {
        this.cedulaD = cedulaD;
        this.anioF = anioF;
        this.fab = fab;
    }

    public String getCedulaD() {
        return cedulaD;
    }

    public void setCedulaD(String cedulaD) {
        this.cedulaD = cedulaD;
    }

    public int getAnioF() {
        return anioF;
    }

    public void setAnioF(int anioF) {
        this.anioF = anioF;
    }

    public double getValorV() {
        return valorV;
    }

    public void setValorV(double valorV) {
        this.valorV = valorV;
    }

    public double getValorM() {
        return valorM;
    }

    public void setValorM(double valorM) {
        this.valorM = valorM;
    }
    public void calcularValorMatricula() {
        valorM = 0.00002 * valorV * (2024 - anioF);
    }

    public Fabrica getFab() {
        return fab;
    }

    public void setFab(Fabrica fab) {
        this.fab = fab;
    }
    public String toString() {
        return "AUTOMOTOR\n"
                + "Cedula dueño: " + cedulaD + "\n"
                + "Año de fabricacion: " + anioF + "\n"
                + "Valor del vehículo: " + valorV + "\n"
                + "Valor de la matrícula: " + valorM + "\n"
                + "FABRICANTE\n"
                + "Nombre: " + getFab().getNombreF() + "\n"
                + "Ciudad de origen: " + getFab().getCiudadO() + "\n";
    }
}
