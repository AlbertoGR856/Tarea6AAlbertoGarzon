/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaa6;

/**
 *
 * @author GR6
 */
public class Prueba {

    public static void main(String[] args) {

        Libros miLibro = new Libros("Harry Potter y la piedra filosofal", "J.K. Rowling", "AUSTRAL", 14.56, true);
        Libros miLibro2 = new Libros("El Retorno del rey", "Tolkien", "EDITORIAL PLANETA", 18.99, false);

        Genero miGenero = new Genero("El nombre del viento", "Patrick Rothfuss", "EDITORIAL PLANETA", 20.99, true, 25, "Fantasia");
        Genero miGenero2 = new Genero("La sombra del viento", "Patrick Rothfuss", "EDITORIAL ARIEL", 21.99, false, 100, "Fantasia");

        CienciaFiccion miCienciaFiccion = new CienciaFiccion("El juego de Ender", " Orson Scott Card", "AUSTRAL", 10.12, true, 75, "Ciencia Ficcion", 300);
        CienciaFiccion miCienciaFiccion2 = new CienciaFiccion("Fahrenheit 451", "Ray Bradbury", "EDICIONES CORÍN TELLADO", 17.45, false, 13, "Ciencia Ficcion", 400);

        Horror miHorror = new Horror("Frankenstein o el moderno Prometeo", "Mary Shelley", "EDICIONES LUCIÉRNAGA", 19.99, true, 45, "Horror", 500);
         Horror miHorror2 = new Horror("Drácula", "Bram Stoker", "EDICIONES PENÍNSULA", 25.00, true, 85, "Horror", 450);
    }

}
