package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creamos los Scanners
		Scanner readerNombre = new Scanner(System.in);
		Scanner readerEdad = new Scanner(System.in);
		
		// Declaramos las variables
		String nombre;
		int edad;
		
		// Damos un mensaje de bienvenida y preguntamos por el nombre
		System.out.print("Bienvenido, ¿cuál es tu nombre?: ");
		
		// Recogemos el nombre con el Scanner
		nombre = readerNombre.nextLine();
		
		// Imprimimos otro mensaje para preguntar por la edad
		System.out.print("¿Y cuál es tu edad?: ");
		
		// Recogemos la edad con el Scanner
		edad = readerEdad.nextInt();
		
		// Mostramos el mensaje final
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor"
				+ " eres!");

	}

}
