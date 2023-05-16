package pizzeria.cliente;

import pizzeria.pizza.Ingrediente;
import pizzeria.pizza.Pizza;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Pizzeria {

    static Integer NUM_PEDIDO = 0;
    static HashSet<Cliente> clientes;
    static ArrayList<Ingrediente> ingredientes;
    public static void main(String[] args){
        inicializarClientes();
        inicializarIngredientes();
   

        System.out.println("------BIENVENIDO A LA PIZZERIA LA PIZZA LOCA---------");
        Scanner scanner = new Scanner(System.in);

        //TODO pedir datos para identificar al cliente, buscar entre los existentes y si no,
        // crear uno nuevo pidiéndole los datos
        
        /* No me ha salido.
        System.out.println("Indique su teléfono: ");
        String busqueda = scanner.nextLine();
		Cliente a = buscarCliente(busqueda);
		if (a == null) {
			System.out.println("El cliente no existe, hay que crearlo: ");
    			System.out.println("Indique su nombre: ");
    			String nombre = scanner.nextLine();
    			System.out.println("Indique su apellido: ");
    			String apellido = scanner.nextLine();
    			System.out.println("Indique su telefono: ");
    			String telefono = scanner.nextLine();
    			System.out.println("Indique su dirección: ");
    			String direccion = scanner.nextLine();
    			clientes.add(new Cliente(nombre, apellido, telefono, direccion));
    			System.out.println(clientes.toString());
		} else {	
			System.out.println("El elemento "+busqueda +" está en la lista");    			
    		}

         */
        
		Cliente cliente = clientes.stream().filter(c-> c.getNombre() == "Homer").findFirst().orElse(null);
         

        ArrayList<Pizza> pizzas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique cuantas pizzas desea pedir: ");
        int numPizzas = sc.nextInt();
        for (int i=0; i<numPizzas; i++) {
            Pizza pizza = new Pizza();
            
            //TODO pedir tantas veces como sea necesario el tamaño de la pizza hasta que sea correcto

            System.out.println("Indique el tamaño de la pizza: PEQUEÑA, MEDIANA o GRANDE: ");
            String tamañoPizza = sc.next();
            Pizza.Tamaño tamaño = convierteTamaño(tamañoPizza);
            pizza.setTamaño(tamaño);
           
            
    		
            //TODO pedir el tipo de masa y asociarlo a la pizza

            int numIngredientes;
            System.out.println("Indique el número total de ingredientes de la pizza: ");
            numIngredientes = sc.nextInt();

            for (int j=0; j<numIngredientes; j++) {
                try {
                    System.out.println(MessageFormat.format("Introduzca el nombre del ingrediente {0} entre QUESO JAMON PIÑA TOMATE BACON: ", j));
                    String ingrediente = scanner.next();
                    pizza.getIngredientes().add(buscaIngrediente(ingrediente));
                    System.out.println(MessageFormat.format("Introduzca el nombre de la masa entre FINA ROLLING GORDA: ", j));
                    String masa = scanner.next();
                    //pizza.getMasa().add(buscaMasa(masa));
                }catch (Exception e){
                    e.printStackTrace();
                    System.out.println("El ingrediente introducido no es válido");
                    j--;
                }
            }

           pizzas.add(pizza);
        }
        //Creamos el pedido
        Pedido pedido = new Pedido(NUM_PEDIDO++, cliente, pizzas );
        pedido.calcularPrecio();
        //TODO mejorar el resumen del pedido (Pedido.toString())
        System.out.println(pedido);
        // Cleanup
        scanner.close();
    }

    private static Ingrediente buscaIngrediente(String ingrediente){
        //TODO implementar la búsqueda por nombre de ingrediente		
        return ingredientes.get(0);
    }
    
   
    private static Pizza.Tamaño convierteTamaño(String tamañoPizza){
        try{
            String tamañoPizzaUpper = tamañoPizza.toUpperCase();
            return Pizza.Tamaño.valueOf(tamañoPizzaUpper);
        } catch(Exception e){
            e.printStackTrace();
            return Pizza.Tamaño.PEQUEÑA;
        }
    }
    private static void inicializarClientes(){
        clientes = new HashSet<>();
        clientes.add(new Cliente("Maggie", "Simpson", "+7888888888", "Springfield 1"));
        clientes.add(new Cliente("Homer", "Simpson", "+7888888889", "Springfield 2"));
    }
    private static void inicializarIngredientes(){
        ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("QUESO", 0.3));
        ingredientes.add(new Ingrediente("TOMATE", 0.2));
        ingredientes.add(new Ingrediente("JAMON", 0.2));
        ingredientes.add(new Ingrediente("PIÑA", 0.2));
        ingredientes.add(new Ingrediente("BACON", 0.2));
    }
}
