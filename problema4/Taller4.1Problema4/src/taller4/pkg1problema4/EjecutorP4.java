
package taller4.pkg1problema4;

public class EjecutorP4 {

    public static void main(String[] args) {
        // OBJETO 1
        Cliente cliente = new Cliente("Rafaella Eduarda", "Palacios Hidalgo", "1103783450");
        Banco obj = new Banco("Banco Pichincha", 6);
        Cheque obje = new Cheque(cliente, obj, 200.50);
        obje.calcularComisionBanco();
        System.out.println("----------OBJETO 1----------");
        System.out.println(obje.toString());

        // OBJETO 2
        Cliente cliente2 = new Cliente("Maria Esther", "Mendez Armijos", "1106012634");
        Banco obj1 = new Banco("Banco de Loja", 10);
        Cheque obje2 = new Cheque(cliente2, obj1);
        obje2.calcularComisionBanco();
        System.out.println("----------OBJETO 2----------");
        System.out.println(obje2.toString());      
    }
//Rafaella Palacios, Esther Mendez
   
}
