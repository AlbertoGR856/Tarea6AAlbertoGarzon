/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaa6;

import java.util.Objects;

/**
 *
 * @author GR6
 */
public class CienciaFiccion extends Genero {

    //Atributo
    private int numeroPaginas;

     //Constructor parametrizado. Es polimorfico ya que incluye la instrucción super()
    public CienciaFiccion(String nombre, String autor, String editorial, double precio, boolean disponible, int numeroLibros, String tipoLibro, int numeroPaginas) {

        super(nombre,autor, editorial, precio, disponible, numeroLibros, tipoLibro);
        this.numeroPaginas = numeroPaginas;

    }

    //Constructor por defecto
    public CienciaFiccion() {

        super();
    }

     //Método sobreescrito de la clase padre Libros
    @Override
    public void libroDisponible(Libros libro) {

        if (libro != null) {

            libro.setDisponible(true);

            System.out.println("El libro del genero Ciencia ficción esta disponible...");
        }

    }

    //Crea un método “metodoC” que sólo exista en la clase C. 
    public void establecerNumeroPaginas() {

        this.numeroPaginas = 400;
    }

    //Método sobreescrito de la clase Genero
    @Override
    public void leerLibro() {

        System.out.println("Ha decidido leer el libro de Ciencia Ficcion " );
    }

      //Getters y setters
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

      //Método hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.numeroPaginas;
        return hash;
    }

     //Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CienciaFiccion other = (CienciaFiccion) obj;
        if (this.numeroPaginas != other.numeroPaginas) {
            return false;
        }
        return true;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "CienciaFiccion{" + "numeroPaginas=" + numeroPaginas + '}';
    }

}
