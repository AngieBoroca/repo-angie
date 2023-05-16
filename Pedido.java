package pizzeria.cliente;

import pizzeria.pizza.Ingrediente;
import pizzeria.pizza.Pizza;
import java.util.ArrayList;

/**
 * Generamos una clase de tipo Pedido, para los pedidos que entren en la pizzería. 
 * Describimos sus atributos, constructores y métodos. 
 * Procederemos a documentar aquellos que sean distintos a la clase Cliente.
 */
public class Pedido {
	/*
	 * @param: Contamos con 8 atributos. Un id de tipo entero, un cliente de tipo Cliente, pizzas de tipo ArraList, precio de tipo double
	 * y después los precios de 3 tipos de pizza según su tamaño.
	 */
    Integer id;
    Cliente cliente;
    ArrayList<Pizza> pizzas;
    double precio = 0;

    double PRECIO_PIZZA_PEQUEÑA = 6;
    double PRECIO_PIZZA_MEDIANA = 8;
    double PRECIO_PIZZA_GRANDE = 10;
    
    /*
     * Añado 3 atributos más de tipo double para incluir los precios de los tipos de masa, 
     * ya que se piden en el método CalcularPrecio.
     */
    double PRECIO_MASA_FINA = 3;
    double PRECIO_MASA_ROLLING = 5;
    double PRECIO_MASA_GORDA = 7;
    

    public Pedido(){

    }

    public Pedido(Integer id, Cliente cliente, ArrayList<Pizza> pizzas) {
        this.id = id;
        this.cliente = cliente;
        this.pizzas = pizzas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    /*
     * Método para calcular el precio del pedido teniendo en cuenta 3 parámetros:
     * @param: Por una lado, el precio del pedido en función del tamaño, se agrega el precio en función del tipo de masa y 
     * finalmente, se suma el precio en función del ingrediente.
     * @return: Es un método de tipo void por lo que no devolverá un resultado sino que lo asigna a la variable precio. 
     */
    public void calcularPrecio() {
        //TODO incluir en los cálculos de precio una variación según el tipo de masa
        for (Pizza pizza : getPizzas()) {
            precio+= pizza.getTamaño() == Pizza.Tamaño.PEQUEÑA ? PRECIO_PIZZA_PEQUEÑA : pizza.getTamaño() == Pizza.Tamaño.MEDIANA ? PRECIO_PIZZA_MEDIANA : PRECIO_PIZZA_GRANDE;
            precio+= pizza.getMasa() == Pizza.Masa.FINA ? PRECIO_MASA_FINA : pizza.getMasa() == Pizza.Masa.ROLLING ? PRECIO_MASA_ROLLING : PRECIO_MASA_GORDA;
            for (Ingrediente ingrediente : pizza.getIngredientes()) {
                precio += (ingrediente.getPrecio()+pizza.getPrecioTamaño()+pizza.getPrecioMasa());
            }
        }
    }

    /*
     * Método para devolver el precio del pedido tras haberlo calculado y asignado en el método anterior.
     * @return: devuelve un double de precio.
     */
    public double getPrecio() {
        calcularPrecio();
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", pizzas=" + pizzas +
                ", precio=" + precio +
                '}';
    }
}
