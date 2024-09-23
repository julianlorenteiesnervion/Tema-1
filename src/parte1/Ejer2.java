package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario su edad
		System.out.print("Introduzca su edad: ");

		// Declaramos la variable age
		int age;

		// Esperamos a que el usuario introduzca el dato
		age = sc.nextInt();

		// Mostramos por pantalla la edad que tendrá el próximo año
		System.out.println("Su edad el año que viene será de " + age + 1 + " años.");
	}

}
