package pizzeria.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	/**Generamos una clase Cliente para guardar los datos de los clientes de la pizzería.
	 * Incluye los atributos, los constructores y los métodos.
	 * @author media
	 * @param Tiene 4 atributos de tipo String: nombre, apellido, teléfono y dirección.
	 * Teléfono lo consideramos de tipo string ya que podemos necesitar añadir el símbolo + a la composición de números.
	 */
    private String nombre;

    private String apellido;

    private String telefono;

    private String direccion;
    
    /**
     * Se generan dos constructores:
     * Uno vacío por si debemos pedir los datos del cliente o no queremos añadirlos todos al instanciar el objeto. Cliente().
     * Otro con los parámetros que son obligatorios añadir al instanciar el objero. Cliente(String nombre, String apellido, String telefono, String direccion).
     */

    public Cliente() {
    	
    }
    
    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Como los atributos son privados debemos crear los setters y getters para poder acceder a ellos.
     * @param y return: En los métodos set se indica el atributo y su tipo que se requiere recoger. No devuelve nada.
     * @return En los métodos get se añade un return para poder leer el valor del atributo, que puede ser int, string, double.
     * 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Para poder devolver los datos del objeto llamamos al método de tipo String toString en el que podemos añadir los atributos
     * y la descripción como nos convenga. 
     * @param String nombre, String apellido, String telefono y String direccion.
     * @return En este caso se devuelve qué tipo de objeto estamos devolviendo Cliente,
     * abrimos llaves para añadir los atributos seguidos de sus valores. Cerramos la descripción del objeto con otra llave }.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
    
}
