package parte2;

import java.util.*;

public class Ejer8 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable para la longitud en metros
		double longM;
		
		// Variable para la longitud en centímetros
		double longCm;
		
		// Mensaje por pantalla para solicitar la longitud en metros
		System.out.print("Introduce la longitud en metros: ");
		longM = reader.nextDouble();
		
		// Operación para la conversión de metros a centímetros
		longCm = longM * 100;
		
		// Mensaje final para indicarle al usuario la longitud en centímetros
		System.out.print("La longitud válida para el ranking es de " + (int) longCm + "cm.");
		
		reader.close();

	}

}
