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
public class Genero {
    
    private int numeroLibros;

    public Genero(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }

    public Genero(){
        
        
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
        return "Genero{" + "numeroLibros=" + numeroLibros + '}';
    }
   
    
    
    
    
}
