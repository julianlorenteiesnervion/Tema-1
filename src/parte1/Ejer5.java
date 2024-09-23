package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Mensaje de bienvenida y pregunta sobre el radio
		System.out.print("Bienvenido. Vamos a calcular la longitud y área de tu circunferencia.\n"
				+ "Para ello, proporciona el radio: ");
		
		// Creamos el Scanner
		Scanner radioReader = new Scanner(System.in);
		
		/* Declaramos la variable float para que el usuario pueda
		 introducir el radio con decimales */
		double radio;
		
		// Introducción del radio
		radio = radioReader.nextFloat();
		
		// Declaramos las variables de la longitud y área de la circunferencia
		double longitud;
		double area;
		
		// Realizamos las operaciones
		longitud = 2 * Math.PI * radio;
		area = Math.PI * (radio * radio);
		
		// Le imprimimos por pantalla al usuario la longitud y área de su circunferencia
		System.out.println("Tu circunferencia con radio " + radio + " tiene una longitud de " + longitud + " y un área de " + area + ".");
		

	}

}
