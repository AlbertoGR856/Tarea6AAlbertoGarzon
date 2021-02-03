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
public class Horror {
    
    private int numeroPaginas;

    public Horror(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    
    public Horror(){
        
        
        
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numeroPaginas;
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
        if (this.numeroPaginas != other.numeroPaginas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horror{" + "numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
    
}
