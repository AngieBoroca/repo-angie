package arraylist;

import java.text.MessageFormat;
import java.util.Objects;

public class Ingrediente {
    private String nombre;
    private double precio = 0.0;

    public Ingrediente(String nombre) {
        this.nombre = nombre;
    }

    public Ingrediente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return Double.compare(that.precio, precio) == 0 && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Ingrediente'{'nombre=''{0}'', precio={1}'}'", nombre, precio);
    }
}
