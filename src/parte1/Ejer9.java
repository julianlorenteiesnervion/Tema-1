package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// Creamos el Scanner y la variable para la edad
		Scanner readerEdad = new Scanner(System.in);
		
		int edad;
		
		// Le hacemos al usuario la pregunta para conocer su edad
		System.out.print("¡Buenas! Si me dices tu edad, yo te diré si eres "
				+ "mayor de edad o no: ");
		
		// Recogemos la edad
		edad = readerEdad.nextInt();
		
		// Declaramos una variable para la mayoría de edad
		String mayor;
		
		//
		if (edad >= 18) {
			mayor = "Sí";
		}	
		else {
			mayor = "No";
		}
		
		// Mensaje final
		System.out.println(mayor + " eres mayor de edad.");

	}

}
