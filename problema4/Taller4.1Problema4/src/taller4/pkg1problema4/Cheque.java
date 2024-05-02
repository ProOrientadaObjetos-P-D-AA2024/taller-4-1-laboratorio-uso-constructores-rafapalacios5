
package taller4.pkg1problema4;

public class Cheque {
    private Cliente cliente;
    private Banco banco;
    private double valorCheque, comisionBanco;

    public Cheque(Cliente cliente, Banco banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }
    public Cheque(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
        valorCheque = 1000.50;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public void setComisionBanco(double comisionBanco) {
        this.comisionBanco = comisionBanco;
    }
     public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.00003;
    }
     public String toString() {
        return "CHEQUE\n"
                + "Valor del cheque: " + valorCheque + "\n"
                + "Comision del banco: " + comisionBanco + "\n"
                + "CLIENTE\n"
                + "Nombres: " + getCliente().getNombres() + "\n"
                + "Apellidos: " + getCliente().getApellidos() + "\n"
                + "Cédula: " + getCliente().getCedula() + "\n"
                + "BANCO\n"
                + "Nombre: " + getBanco().getNombre() + "\n"
                + "Número de sucursales: " + getBanco().getSucursales() + "\n";
    }
}
//Esther Mendez,Rafaella Palacios