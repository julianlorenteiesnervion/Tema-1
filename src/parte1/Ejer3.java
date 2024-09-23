package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// Pregunta por pantalla
		System.out.print("¿En qué año estás?: ");
		
		// Creamos el scanner para el año actual
		Scanner year = new Scanner(System.in);
		
		// Declaramos la variable actualYear
		int actualYear;
		
		// Esperamos a que el usuario introduzca el año actual
		actualYear = year.nextInt();
		
		/* Año de nacimiento
		Pregunta por pantalla */
		System.out.print("¿En qué año naciste?: ");
		
		// Creamos el scanner para el año de nacimiento
		Scanner born = new Scanner(System.in);
		
		// Declaramos la variable bornYear
		int bornYear;
		
		// Esperamos a que el usuario introduzca su año de nacimiento
		bornYear = born.nextInt();
		
		/*Imprimimos por pantalla su edad, calculándola con
		los datos que nos ha proporcionado el usuario*/
		System.out.println("Tienes " + (actualYear - bornYear) + " años.");
		
	}

}
