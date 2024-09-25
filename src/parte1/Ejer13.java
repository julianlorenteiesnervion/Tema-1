package parte1;

import java.util.*;

public class Ejer13 {

	public static void main(String[] args) {
		// Creación de Scanners
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		boolean lluvia;
		boolean biblio;
		boolean tareas;
		
		// Mensaje principal
		System.out.println("Bienvenido. En este programa sabrás si deberías salir a la calle o no.\n"
				+ "Responde a las preguntas mediante true o false para responder Sí o No.");
		
		// Primera pregunta
		System.out.print("\nPrimero de todo, ¿está lloviendo?: ");
		lluvia = reader.nextBoolean();
		
		// Segunda pregunta
		System.out.print("\n¿Has terminado tus tareas?: ");
		tareas = reader.nextBoolean();
		
		// Tercera pregunta
		System.out.print("\n¿Necesitas ir a la biblioteca para estudiar?: ");
		biblio = reader.nextBoolean();
		
		// Booleano para calcular la respuesta final
		System.out.println((biblio || tareas && !lluvia) ? "\nPuedes salir." : "\nNo puedes salir.");
		
		reader.close();
	}

}
