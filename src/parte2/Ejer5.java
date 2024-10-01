package parte2;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Scanners
		Scanner reader = new Scanner(System.in);
		
		// Variable para los segundos
		int secs;
		
		// Variable para las horas finales
		int hours;
		
		// Variable para los minutos finales
		int mins;
		
		// Variable para los segundos finales
		int finalSecs;
		
		// Mensaje para solicitar los segundos
		System.out.print("Introduce tu cantidad de segundos: ");
		secs = reader.nextInt();
		
		// Operaciones
		hours = secs / 3600;
		mins = (secs % 3600) / 60;
		finalSecs = (secs % 3600) % 60;
		
		// Mensaje final
		System.out.println(hours + "h " + mins + "min " + finalSecs + "s.");
		
		reader.close();

	}

}
