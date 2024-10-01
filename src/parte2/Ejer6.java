package parte2;

import java.util.*;

public class Ejer6 {

	public static void main(String[] args) {
		// Creación Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable para los milímetros
		int mm;
		
		// Variable para los centímetros
		int cm;
		
		// Variable para los metros
		int m;
		
		// Variable final para la longitud total en cm
		int finalCm;
		
		// Mensajes para la solicitud de los datos
		System.out.print("Introduce los milímetros: ");
		mm = reader.nextInt();
		
		System.out.print("Introduce los centímetros: ");
		cm = reader.nextInt();
		
		System.out.print("Introduce los metros: ");
		m = reader.nextInt();
		
		// Operaciones para la conversión de mm y metros a cm
		finalCm = mm / 10 + cm + m * 100;
		
		// Mensaje final con la longitud en cm
		System.out.print("\nLa longitud total son " + finalCm + "cm.");
		
		reader.close();

	}

}
