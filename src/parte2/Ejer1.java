package parte2;

import java.util.*;

public class Ejer1 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		double num;
		
		// Mensaje y scanner para solicitar el número
		System.out.print("Bienvenido, introduce un número con decimales: ");
		num = reader.nextDouble();
		
		// Redondeo del número con decimales
		num = (int) num;
		
		System.out.println(num);
		
	}

}
