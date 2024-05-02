/*Los profesores de un instituto tienen algunas características: 
  nombre, apellido, sueldo básico, sueldo total, cédula y provincia de nacimiento 
  (este atributo se considera como un objeto de tipo Provincia, que tiene como atributos: 
   nombre de Provincia y número de habitantes). 
   El sueldo total es igual al sueldo básico más el 20% del sueldo básico.*/
package taller4.pkg1problema2;

public class EjecutorP2 {

    public static void main(String[] args) {
        
         //OBJETO 1
        Provincias obj = new Provincias("Loja", 214855);
        Profesores obje = new Profesores("Rafaella", "Palacios", "1104872559", 950.25, obj);
        obje.calcularSueldo();
        System.out.println("----------OBJETO 1----------");
        System.out.println(obje.toString());

        //OBJETO 2
        Provincias obj1 = new Provincias("Guayas", 4391923);
        Profesores obje1 = new Profesores("Esther", "Mendez", 1000.5, obj1);
        obje1.calcularSueldo();
        System.out.println("----------OBJETO 2----------");
        System.out.println(obje1.toString());
    }
    
}
//Rafaella Palacios, Esther Mendez
