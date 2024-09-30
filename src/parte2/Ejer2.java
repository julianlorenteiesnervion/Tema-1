package parte2;

import java.util.*;

public class Ejer2 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int num;
		
		// Primer mensaje con lectura del número introducido
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		// Operaciones
		num = num % 7;
		num = 7 - num;
		
		// Mensaje final
		System.out.println(num == 7 ? "No tienes que sumarle nada a tu número, ya es múltiplo de 7." : "Tienes que sumarle " + num + " para que sea múltiplo de 7.");

	}

}
