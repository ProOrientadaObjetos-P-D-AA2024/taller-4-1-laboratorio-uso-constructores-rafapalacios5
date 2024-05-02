/*Se requiere representar una entidad que permita crear objetos con características como: 
nombre de estudiante, calificación de materia 1, calificación de materia 2, calificación de materia 3, 
promedio de calificaciones y universidad (este atributo se considera como un objeto de tipo Universidad, 
que tiene atributos como: nombre de universidad y dirección)*/
package taller4.pkg1problema1;

public class EjecutorP1 {

    public static void main(String[] args) {
        //OBJETO 1
        Universidades obj = new Universidades ("UTPL", "LOJA");
        Estudiantes obje = new Estudiantes ("Esther Mendez", 9,9.8, 5.3,obj);
        obje.calcularPromedio();
        System.out.println("----------OBJETO 1----------");
        System.out.println(obje.toString());

        //OBJETO 2
        Universidades obj1 = new Universidades("SAN FRANCISCO", "QUITO");
        Estudiantes obje1 = new Estudiantes("Rafaella Palacios", 9.5, 8.5, obj1);
        obje1.calcularPromedio();
        System.out.println("----------OBJETO 2----------");
        System.out.println(obje1.toString());

    }
    
}
//Rafaella Palacios, Esther Méndez
