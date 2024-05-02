
package taller4.pkg1problema3;

public class EjecutorP3 {

    public static void main(String[] args) {
        // OBJETO 1
        Fabrica obj = new Fabrica("KIA", "Japon");
        Automotor obje = new Automotor("1103713450", 1996, 20000, obj);
        obje.calcularValorMatricula();
        System.out.println("----------OBJETO 1----------");
        System.out.println(obje.toString());

        // OBJETO 2
        Fabrica obj1 = new Fabrica("CHERRY", "CHINA");
        Automotor obje1 = new Automotor("0992105521", 2014, obj1);
        obje1.calcularValorMatricula();
        System.out.println("----------OBJETO 2----------");
        System.out.println(obje1.toString());

    }
    
}
//Rafaella Palacios, Esther Mendez
