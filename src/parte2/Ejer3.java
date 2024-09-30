package parte2;

import java.util.*;

public class Ejer3 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int num;
		int num2;
		
		// Primer mensaje con lectura de los números introducidos
		System.out.print("Introduce un número: ");
		num = reader.nextInt();
		
		System.out.print("Introduce el otro número: ");
		num2 = reader.nextInt();
		
		// Operaciones
		num = num % num2;
		num = num2 - num;
		
		// Mensaje final
		System.out.println(num == num2 ? "No tienes que sumarle nada a tu número, ya es múltiplo de " + num2 + "." : "Tienes que sumarle " + num + " para que sea múltiplo de " + num2 + ".");

	}

}
