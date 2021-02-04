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
public class Genero extends Libros {

    //Atributos
    private int numeroLibros;
    private String tipoLibro;

    //Constructor parametrizado. Es polimorfico ya que incluye la instrucción super()
    public Genero(String nombre, String autor, String editorial, double precio, boolean disponible, int numeroLibros, String tipoLibro) {

        super(nombre, autor, editorial, precio, disponible);
        this.numeroLibros = numeroLibros;
        this.tipoLibro = tipoLibro;
    }

    //Constructor por defecto
    public Genero() {

        super();

    }

    //Método sobreescrito de la clase padre Libros
    @Override
    public void libroDisponible(Libros libro) {

        if (libro != null) {

            libro.setDisponible(true);

            System.out.println("El libro esta disponible...");
        }

    }

    //Crea un método “metodoB” que sólo exista en la clase B. No está sobrescrito.
    public void establecerNumerosLibros() {

        this.numeroLibros = 100;
    }

    //Crea un método “metodoB2” en B que se vaya a sobrescribir en C y D. 
    public void leerLibro() {

        System.out.println("Ha decidido leer un genero ");
    }

    //Getters y setters
    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public String getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    //Método hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.numeroLibros;
        hash = 83 * hash + Objects.hashCode(this.tipoLibro);
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
        final Genero other = (Genero) obj;
        if (this.numeroLibros != other.numeroLibros) {
            return false;
        }
        if (!Objects.equals(this.tipoLibro, other.tipoLibro)) {
            return false;
        }
        return true;
    }

    //Método toString. Es un método sobreescrito y polimorfico, con la instruccion super() se incluye los atributos de la clase padre e hija
    @Override
    public String toString() {
        return super.toString() + "Genero{" + "numeroLibros=" + numeroLibros + ", tipoLibro=" + tipoLibro + '}';
    }

}
