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
public class Genero extends Libros {

    private int numeroLibros;

    public Genero(String autor, String editorial, double precio, boolean disponible, int numeroLibros) {

        super(autor, editorial, precio, disponible);
        this.numeroLibros = numeroLibros;
    }

    public Genero() {
        
        super();

    }
    
    @Override
      public void libroDisponible(Libros libro) {

        if (libro!= null) {

            libro.setDisponible(true);
            
            System.out.println("El Genero esta disponible...");
        }

    }

    public int getNumeroLibros() {
        return numeroLibros;
    }

    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numeroLibros;
        return hash;
    }

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
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Genero{" + "numeroLibros=" + numeroLibros + '}';
    }

}
