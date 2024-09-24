package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Mensaje de bienvenida
		System.out.print("Bienvenido, vamos a realizar ciertas operaciones.\n\n"
				+ "Para ello, vas a introducir dos números.\n"
				+ "Introduce el primer número: ");
		
		// Creamos los Scanners
		Scanner readernum1 = new Scanner(System.in);
		Scanner readernum2 = new Scanner(System.in);
		
		/* Declaramos las variables, que serán float por si el usuario
		quiere introducir algún número decimal */
		float num1;
		float num2;
		
		// Ahora, introducirá el primer número
		num1 = readernum1.nextFloat();
		
		// Segundo número
		System.out.println("Has introducido el número " + num1);
		System.out.print("Introduce ahora el segundo número: ");
		
		num2 = readernum2.nextFloat();
		
		// Mensaje final con el resultado de las operaciones
		System.out.println("\nAquí están los resultados de las operaciones:\n"
				+ "Suma de " + num1 + " + " + num2 + ": " + (num1 + num2) + "\n"
						+ "Resta de " + num1 + " - " + num2 + ": " + (num1 - num2) + "\n"
								+ "Multiplicación de " + num1 + " * " + num2 + ": " + (num1 * num2) + "\n"
										+ "División de " + num1 + " / " + num2 + ": " + (num1 / num2));
	}

}
