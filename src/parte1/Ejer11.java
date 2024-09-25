package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// Creamos el Scanner para las pesetas
		Scanner readerPesetas = new Scanner(System.in);
		
		// Declaramos las variables para las pesetas y para los euros
		float pesetas;
		float euros;
		
		// Mensaje por pantalla para el usuario
		System.out.print("Bienvenido, introduce un valor en pesetas\n"
				+ "y yo te lo traduciré a euros: ");
		
		// Scanneo el valor introducido
		pesetas = readerPesetas.nextFloat();
		
		// Operaciones
		euros = pesetas / 166;
		
		// Mensaje final
		System.out.print("\n" + pesetas + " pesetas son " + euros + "€.");

	}

}
