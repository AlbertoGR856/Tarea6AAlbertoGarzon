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
public class CienciaFiccion {
    
    
    private int numeroPaginas;
    private String nombre;

    public CienciaFiccion(int numeroPaginas, String nombre) {
        this.numeroPaginas = numeroPaginas;
        this.nombre = nombre;
    }
    
    public CienciaFiccion(){
        
        
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.numeroPaginas;
        hash = 43 * hash + Objects.hashCode(this.nombre);
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
        final CienciaFiccion other = (CienciaFiccion) obj;
        if (this.numeroPaginas != other.numeroPaginas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CienciaFiccion{" + "numeroPaginas=" + numeroPaginas + ", nombre=" + nombre + '}';
    }
    
    
    
}
