package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayListIngredientes {
	
    public static void main(String[] args) {
        //Crea dos listas de ingredientes (ArrayList<Ingrediente>), que contengan:
        //Lista 1: “Jamón”, “Mozzarela”, “Piña”, “Chorizo”, “Tomate”. (no indicar el precio)
        ArrayList<Ingrediente> lista1 = new ArrayList<>();
        lista1.add(new Ingrediente("Jamón"));
        lista1.add(new Ingrediente("Mozzarela"));
        lista1.add(new Ingrediente("Piña"));
        lista1.add(new Ingrediente("Chorizo"));
        lista1.add(new Ingrediente("Tomate"));
        
        
        //Imprime la lista 1 utilizando el método imprimirLista y llamándolo con lista1 como argumento
        imprimirLista(lista1);

        //Lista 2: “Tomate”, “Mozzarela”, “Orégano”, "Chorizo". (no indicar el precio)
        ArrayList<Ingrediente> lista2 = new ArrayList<>();
        lista2.add(new Ingrediente("Tomate"));
        lista2.add(new Ingrediente("Mozzarela"));
        lista2.add(new Ingrediente("Orégano"));
        lista2.add(new Ingrediente("Chorizo"));
        

        //Imprime la lista 2 utilizando el método imprimirLista y pasando la lista2 como argumento
        imprimirLista(lista2);


        //Ordena la lista por nombre de ingrediente de forma ascendente utilizando el método sort con expresiones lambda
        // Pista: lista1.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));
        // NOTA: NO hay que modificar la clase Ingrediente
        lista1.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        lista2.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));

        //imprime la lista
        imprimirLista(lista1);
        imprimirLista(lista2);
        
        //Ordena la lista según el nombre del ingrediente de forma descendente utilizando el método anterior
        // NOTA: NO hay que modificar la clase Ingrediente
        lista1.sort((o1, o2) -> o2.getNombre().compareTo(o1.getNombre()));
        lista2.sort((o1, o2) -> o2.getNombre().compareTo(o1.getNombre()));

        //imprime la lista
        imprimirLista(lista1);
        imprimirLista(lista2);
        
        //Escribe el código que haga que se borren los elementos de la lista1 que no estén contenidos en la lista 2
        // (Pista: busca un método de la clase de ArrayList que implementa esta funcionalidad)
        lista1.retainAll(lista2);
        imprimirLista(lista1);
        
        
        //Establece el precio de los ingredientes de forma aleatoria para lista1
        Iterator<Ingrediente> it = lista1.iterator();
        Random random = new Random();
        while(it.hasNext()){
            it.next().setPrecio(1.2 * random.nextDouble());
        }
        
        //imprime la lista
        imprimirLista(lista1);


        //Ordena los ingredientes de lista 1 según el precio de forma ascendente utilizando el método sort con lambdas
        //Pista: para comparar el precio de tipo double usar Double.compare(ingrediente1.getPrecio(),ingrediente2.getPrecio())
        lista1.sort((o1, o2) -> Double.compare(o1.getPrecio(),o2.getPrecio()));
        
        //imprimir lista1 ordenada por precio ascendente
        imprimirLista(lista1);

        //Ordena los ingredientes de lista 1 según el precio de forma descendente utilizando el método anterior
        lista1.sort((o1, o2) -> Double.compare(o2.getPrecio(),o1.getPrecio()));

        //imprimir lista1 ordenada por precio ascendente
        imprimirLista(lista1);

        //Establece a 0 el precio del ingrediente Tomate (para ello implementa la búsqueda del ingrediente tomate y
        // despues usa setPrecio)
        //Pista: para la búsqueda, utiliza lista1.stream().filter(<tu código aquí>).findFirst().orElse(null)

        lista1.stream().filter(Ingrediente->"Tomate".equals(Ingrediente.getNombre())).findFirst().orElse(null);
        
        //NO ME SALE
        

        //Elimina de la lista1 los ingredientes con precio igual a 0 haciendo uso del método removeIf
        lista1.removeIf(o->(o.equals(0)));
		for (int i=0; i<lista1.size();i++) {	
		}
        imprimirLista(lista1);
		
		//NO ME SALE!!!!

        //Añade a la lista otro ingrediente con nombre Mozzarela, tendremos dos ingredientes con el mismo nombre
		lista1.add(new Ingrediente("Mozzarela"));
		
        //Implementa el código que retorne todos los ingredientes con nombre Mozzarela, utilizando
        //lista1.stream().filter(ingrediente -> <your code here>).collect(Collectors.toList())
		lista1.stream().filter(Ingrediente->"Mozzarela".equals(Ingrediente.getNombre())).findFirst().orElse(null);
		//No me sale
		
        //imprime la lista
        

    }

    private static void imprimirLista(ArrayList<Ingrediente> lista){
        StringBuffer sb = new StringBuffer();
        for(Ingrediente ingrediente : lista){
            sb.append(ingrediente.toString());
            sb.append(", ");
        }
        System.out.println(sb);
    }
}
