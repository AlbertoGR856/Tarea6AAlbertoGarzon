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

    private int numeroCapitulos;

    public Horror(String autor, String editorial, double precio, boolean disponible, int numeroLibros, int numeroPaginas, String nombre, int numeroCapitulos) {

        super(autor, editorial, precio, disponible, numeroLibros);
        this.numeroCapitulos = numeroPaginas;
    }

    public Horror() {
        
        super();

    }

    public int getNumeroPaginas() {
        return numeroCapitulos;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroCapitulos = numeroPaginas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numeroCapitulos;
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
        final Horror other = (Horror) obj;
        if (this.numeroCapitulos != other.numeroCapitulos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horror{" + "numeroPaginas=" + numeroCapitulos + '}';
    }

}
