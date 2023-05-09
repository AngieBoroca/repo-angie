package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class Letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> letras = new ArrayList<>();
		ListIterator<String> itr = null; 
		letras.add("A");
		letras.add("B");
		letras.add("C");
		letras.add("D");
		letras.add("E");
		
		// Recorremos la lista de principio a fin. Usamos ListIterator porque nos permite hacer el recorrido a la inversa también
		itr = letras.listIterator();  
        System.out.println("In actual order :");  
		while (itr.hasNext()) {
			System.out.println(itr.next()+",");
		}
		
		// Recorremos la lista de final a inicio
		System.out.println("Letras de fin a inicio : ");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous()+",");
		}
	
	}

}
