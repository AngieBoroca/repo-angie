package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraListColores {
	
	public static void main(String[] args) {
		        //Crea una lista de colores utilizando la clase ArrayList que contenga los colores: “rojo”, “verde”, “azul”.
		    	ArrayList<String> colores = new ArrayList<String>();
		    	colores.add("rojo");
		    	colores.add("verde");
		    	colores.add("azul");
		    	
		        //Imprime cuántos elementos hay en la lista.
		    	System.out.println(colores); //Imprime los colores añadidos
		    	System.out.println(colores.size()); //Imprime el tamaño del ArrayList
		    	
		        //Añade al final de la lista el color “blanco”
		    	colores.add("blanco");
		    	
		        //Imprime cuántos elementos hay en la lista.
		    	System.out.println(colores);
		    	System.out.println(colores.size());
		    	
		        //Imprime cuál es el elemento de la primera y tercera posición de la lista.
		    	for (int i=0; i<colores.size(); i++) {
		    	}
		    		System.out.println(colores.get(0));
		    		System.out.println(colores.get(2));
		    		
		        //Recorre la lista haciendo uso del for tradicional for(int i=0; …) e imprime todos sus elementos.
		    		for (int i=0; i<colores.size(); i++) {
			    	}
		    		System.out.println(colores);
		    	
		        //Recorre la lista haciendo uso de java for-each loop for(data_type variable: arraylist_name)
		        // e imprime todos los elementos.
		    		for (String element : colores) {
		    		}
		    		System.out.println(colores);

		    		
		        //Recorre la lista haciendo uso del iterador java (Iterator<String> it = colores.iterator();)
		        // e imprime todos los elementos.
		    		Iterator<String> it = colores.iterator();
		    				while (it.hasNext()) {
		    					String color=it.next();
		    				}
		    				System.out.println(colores); 

		        //Escribe el código que compruebe si el color blanco está en la lista e imprime si está o no está por pantalla.
		    		String busqueda = "blanco";
		    		boolean existe = colores.contains(busqueda);
		    		if (existe) {
		    			System.out.println("El elemento "+busqueda +" está en la lista");
		    		} else {
		    			System.out.println("El elemento "+busqueda +" no está en la lista");
		    		}
		    				
		        //Elimina el color blanco de la lista.
		    		colores.remove("blanco");

		        //Imprime la lista y comprueba que el color blanco no está.
		    		System.out.println(colores);

		        //Elimina el color situado en la posición 2 de la lista.
		    		colores.remove(2);
		    		
		        //Imprime la lista y comprueba que el color azul no está.
		    		System.out.println(colores);

		        //Añade el color azul después del color rojo
		    		colores.add(1,"azul");
		    		System.out.println(colores);

		        //Sustituye el color azul por el color amarillo, haciendo uso del método set
		    		colores.set(1, "amarillo");
		    		System.out.println(colores);

		        //Ordena el contenido de la lista alfabéticamente de menor a mayor haciendo uso de Collections.sort
		    		Collections.sort(colores);
		    		System.out.println(colores);

		        //Elimina los colores que contengan la letra 'o' haciendo uso de removeIf y comprueba que sólo ha quedado el verde
		    		colores.removeIf(n->(n.contains("o")));
		    		for (int i=0; i<colores.size();i++) {	
		    		}
		    		System.out.println(colores);
		    		
	}

}
