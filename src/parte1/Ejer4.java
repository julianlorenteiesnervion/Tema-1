package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Preguntar por la primera nota
		System.out.print("Bienvenido, introduce tu primera nota: ");
		
		// Creamos el Scanner
		Scanner nota1 = new Scanner(System.in);
		
		// Declaramos la variable float para la primera nota
		float not1;
		
		// El usuario introduce la primera nota
		not1 = nota1.nextFloat();
		
		// Ahora, pedimos la segunda nota
		System.out.print("Introduce la segunda nota: ");
		
		// Creamos el segundo Scanner
		Scanner nota2 = new Scanner(System.in);
		
		// Declaro otra variable float para la segunda nota
		float not2;
		
		// El usuario introduce la segunda nota
		not2 = nota2.nextFloat();
		
		// Declaramos la nota media con una variable float para así poder mostrar los decimales
		float notaMedia;
		
		// Calculamos la nota media
		notaMedia = ((not1 + not2) / 2 );
		
		// Mostramos la nota media
		System.out.println("La nota media es " + notaMedia);
		

	}

}
