package parte1;

import java.util.*;

public class Ejer14 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		float primerTrimestre;
		float segundoTrimestre;
		float tercerTrimestre;
		float notaMedia;
		
		// Mensajes y lecturas para solicitar las notas
		System.out.print("Hola. Para calcular tu nota media, tendrás que introducir las notas de los trimestres.\n"
				+ "\nPrimer trimestre: ");
		primerTrimestre = reader.nextFloat();
		
		System.out.print("Segundo trimestre: ");
		segundoTrimestre = reader.nextFloat();
		
		System.out.print("Tercer trimestre: ");
		tercerTrimestre = reader.nextFloat();
		
		// Calcular la nota media
		notaMedia = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;

		// Mensaje final para indicarle al usuario la nota media
		System.out.print("\nBoletín de calificaciones: " + (int) notaMedia + "\nExpediente académico: " + notaMedia);

	}

}
