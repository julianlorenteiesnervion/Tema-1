package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		//Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos por pantalla la pregunta
		System.out.print("Buenas, introduce un número: ");
		
		//Espera a que el usuario introduzca el número
		int num = sc.nextInt();
		
		//Imprime por pantalla el siguiente texto + el número introducido
		System.out.println("Has introducido el número " + num);
	}

}
