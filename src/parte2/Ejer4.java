package parte2;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		// Scanners
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		int a;
		int b;
		int c;
		int x;
		int y;
		
		// Pregunta por los números a, b y c
		System.out.print("Introduce a: ");
		a = reader.nextInt();
		
		System.out.print("\nIntroduce b: ");
		b = reader.nextInt();
		
		System.out.print("\nIntroduce c: ");
		c = reader.nextInt();
		
		System.out.print("\nIntroduce x: ");
		x = reader.nextInt();
		
		// Operaciones
		y = a * (x*x) + b * x + c;
		
		// Mensaje final
		System.out.print("\nEl resultado de tu polinomio es y = " + y + ".");

	}

}
