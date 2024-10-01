package parte2;

import java.util.*;

public class Ejer7 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable para las entradas infantiles introducidas
		double inputInfantil;
		
		// Variable para las entradas de adultos introducidas
		double inputAdulto;
		
		// Variable para el precio total
		double precioTotal;
		
		// Constantes de los precios
		final double precioInfantil = 15.50;
		final double precioAdulto = 20;
		
		// Mensajes y scanners para la introducción de datos
		System.out.print("Entradas infantiles: ");
		inputInfantil = reader.nextDouble();
		
		System.out.print("Entradas de adultos: ");
		inputAdulto = reader.nextDouble();
		
		// Operaciones
		precioTotal = (inputInfantil * precioInfantil) + (inputAdulto * precioAdulto);

		// Mensaje final
		System.out.print(precioTotal >= 100 ? "El importe total a cobrar es de " + precioTotal * 0.95 + "€." : "El importe total a cobrar es de " + precioTotal + "€.");
		
		reader.close();
	}

}
