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
public class Libros {

    //Atributos
    private String nombre;
    private String autor;
    private String editorial;
    private double precio;
    private boolean disponible;

    //Constructor parametrizado
    public Libros(String nombre, String autor, String editorial, double precio, boolean disponible) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.disponible = disponible;
    }

    //Constructor por defecto
    public Libros() {

    }

    //Inventa un método “metodoA” en la clase A que se vaya a sobrescribir en B,C y D. 
    //No puede ser ningún método heredado de Object, como toString, equals, etc. 
    public void libroDisponible(Libros libro) {

        if (libro != null) {

            libro.setDisponible(true);

            System.out.println("El libro esta disponible...");
        }

    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Método hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.autor);
        hash = 97 * hash + Objects.hashCode(this.editorial);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 97 * hash + (this.disponible ? 1 : 0);
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
        final Libros other = (Libros) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        return true;
    }
   

    //Método toString
    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

}
