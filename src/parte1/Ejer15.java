package parte1;

import java.util.*;

public class Ejer15 {

	public static void main(String[] args) {
		// Scanner
		Scanner reader = new Scanner(System.in);
		
		// Constantes y variables
		float precio;
		final int IVA = 21;
		
		// Mensaje para solicitar el precio
		System.out.print("Introduce el precio de tu producto para calcular su precio con IVA: ");
		precio = reader.nextFloat();
		
		// Mensaje final con IVA sumado
		System.out.print("El precio de su producto + IVA es de: " + (precio + (precio * 21 / 100)) + "€.");

	}

}
