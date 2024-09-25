package parte1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// Creamos los Scanners para las manzanas y las peras
		Scanner readerManzanas = new Scanner(System.in);
		Scanner readerPeras = new Scanner(System.in);
		
		// Declaramos las variables para las manzanas y las peras
		float manzanas;
		float peras;
		
		// Pregunta inicial y lectura sobre los kg de manzanas
		System.out.print("Bienvenido. Introduce la cantidad (en kg) de manzanas: ");
		manzanas = readerManzanas.nextFloat();

		// Pregunta y lectura sobre los kg de peras
		System.out.print("\nAhora, introduce la cantidad (en kg) de peras: ");
		peras = readerPeras.nextFloat();
		
		// Mensaje final para indicar el importe total
		System.out.println("\nSabiendo que " + manzanas + " kg de manzanas cuesta " + (manzanas * 2.35) + "€\n"
				+ "y " + peras + " kg de peras cuesta " + (peras * 1.95) + "€, el importe total es de " + ((manzanas * 2.35) + (peras * 1.95)) + "€.");

	}

}
