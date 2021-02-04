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

    private int numeroLibros;
    private String tipoLibro;

    public Genero(String autor, String editorial, double precio, boolean disponible, int numeroLibros, String tipoLibro) {

        super(autor, editorial, precio, disponible);
        this.numeroLibros = numeroLibros;
        this.tipoLibro = tipoLibro;
    }

    public Genero() {

        super();

    }

    @Override
    public void libroDisponible(Libros libro) {

        if (libro != null) {

            libro.setDisponible(true);

            System.out.println("El libro esta disponible...");
        }

    }

    public void establecerLibrosGenero() {

        this.numeroLibros = 100;
    }
    
    
    
    public void leerLibro(){
        
        System.out.println("Ha decidido leer el tipo de libro: " +tipoLibro);
    }

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.numeroLibros;
        hash = 83 * hash + Objects.hashCode(this.tipoLibro);
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
        if (!Objects.equals(this.tipoLibro, other.tipoLibro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Genero{" + "numeroLibros=" + numeroLibros + ", tipoLibro=" + tipoLibro + '}';
    }

}
