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
public class Horror extends Genero {

    //Atributo
    private int numeroCapitulos;

     //Constructor parametrizado. Es polimorfico ya que incluye la instrucción super()
    public Horror(String nombre, String autor, String editorial, double precio, boolean disponible, int numeroLibros, String tipoLibro, int numeroCapitulos) {

        super(nombre, autor, editorial, precio, disponible, numeroLibros, tipoLibro);
        this.numeroCapitulos = numeroCapitulos;
    }

    //Constructor por defecto
    public Horror() {

        super();

    }

     //Método sobreescrito de la clase padre Libros
    @Override
    public void libroDisponible(Libros libro) {

        if (libro != null) {

            libro.setDisponible(true);

            System.out.println("El libro del genero Horror esta disponible...");
        }

    }

    //Crea un método “metodoD” que sólo exista en la clase D.
    public void establecerNumeroCapitulos() {

        this.numeroCapitulos = 50;
    }

    //Método sobreescrito de la clase Genero
    @Override
    public void leerLibro() {

        System.out.println("Ha decidido leer el libro de Horror ");
    }

    //Getters y setters
    public int getNumeroPaginas() {
        return numeroCapitulos;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroCapitulos = numeroPaginas;
    }

    //Método hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numeroCapitulos;
        return hash;
    }

    //Método equals
    @Override
    public boolean equals(Object obj) {
       if (!super.equals(obj)) {

            return false;
        }
       
        final Horror other = (Horror) obj;
        if (this.numeroCapitulos != other.numeroCapitulos) {
            return false;
        }
        return true;
    }

    //Método toString. Es un método sobreescrito y polimorfico, con la instruccion super() se incluye los atributos de la clase padre e hija
    @Override
    public String toString() {
        return super.toString() + "Horror{" + "numeroPaginas=" + numeroCapitulos + '}';
    }

}
