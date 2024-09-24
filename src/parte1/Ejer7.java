package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos los Scanners
		Scanner readerNombre = new Scanner(System.in);
		Scanner readerDireccion = new Scanner(System.in);
		Scanner readerTelefono = new Scanner(System.in);
		
		// Declaramos las variables para los datos
		String nombre;
		String direccion;
		int telefono;
		
		// Mensaje para el nombre
		System.out.print("Hola, introduce tu nombre: ");
		
		// Recogemos el nombre con el Scanner
		nombre = readerNombre.nextLine();
		
		// Mensaje para la dirección
		System.out.print("Introduce tu dirección: ");
		
		// Recogemos la dirección
		direccion = readerDireccion.nextLine();
		
		// Mensaje para el teléfono
		System.out.print("Introduce tu número de teléfono: ");
		
		// Recogemos el número de teléfono
		telefono = readerTelefono.nextInt();
		
		// Mostramos el mensaje final con los datos
		System.out.println("\nNombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telefono);

	}

}
