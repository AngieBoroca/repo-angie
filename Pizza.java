package pizzeria.pizza;

import java.util.ArrayList;

/*
 * Se crea una clase Pizza con 8 atributos:
 * @param: 2 enumerados que son la masa y el tamaño. 
 * Un string de nombre. Un atributo masa de tipo Masa. Un ArrayList de ingredientes. Un atributo tamaño de tipo Tamaño.
 * Y dos doubles de precio, el del tamaño y el de la masa que hemos incorporado para poder añadir este atributo a los cálculos de
 * precio en la Clase Pedido.
 */

public class Pizza {
    public enum Masa {FINA, ROLLING, GORDA}
    public enum Tamaño {PEQUEÑA, MEDIANA, GRANDE}
    private String nombre;
    private Masa masa;
    private ArrayList<Ingrediente> ingredientes;
    private Tamaño tamaño;
    private double precioTamaño;
    private double precioMasa; 

    /*
     * Los constructores solicitan los ingredientes como un ArrayList.
     */
    public Pizza() {
        this.ingredientes = new ArrayList<>();
    }

    public Pizza(String nombre, Masa masa, Tamaño tamaño) {
        this.nombre = nombre;
        this.masa = masa;
        this.tamaño = tamaño;
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Masa getMasa() {
        return masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }
    
    public void setPrecioTamaño(double precio) {
        this.precioTamaño = precioTamaño;
    }

    public double getPrecioTamaño() {
        return precioTamaño;
    }
    
    public void setPrecioMasa(double precio) {
        this.precioMasa = precioMasa;
    }

    public double getPrecioMasa() {
        return precioMasa;
    }
    
    /*
     * El método equals permite encontrar un objeto en una colección.
     * @param: Parámetro de entrada de tipo Object. Aquí lo hemos llamado Object o.
     * Compara si dos objetos son iguales y tienen el mismo nombre a tarvés de una serie de comparaciones. Si el objetoes igual a sí mismo devuelve true y false si es diferente.
     * @return: Si el nombre, la masa y los ingredientes no son los especificados, debe devolver un boolean con resultado false.
     */
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (!nombre.equals(pizza.nombre)) return false;
        if (masa != pizza.masa) return false;
        if (!ingredientes.equals(pizza.ingredientes)) return false;
        return tamaño == pizza.tamaño;
    }
    
    /*
     * El método hasCode() complementa el método equals. 
     * @param: Primero se comparan los objetos a través de 
     * este método dando como resultado un valor entero. Si los dos objetos comparados comparten el mismo hashCode
     * se implementa el método equals para hacer una comparación más extensa.
     * @result: valor de tipo entero. 
     */

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + masa.hashCode();
        result = 31 * result + ingredientes.hashCode();
        result = 31 * result + tamaño.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", ingredientes=" + ingredientes +
                ", tamaño=" + tamaño +
                '}';
    }
}
