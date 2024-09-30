package parte2;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Scanners
		Scanner reader = new Scanner(System.in);
		
		// Variables
		int secs;
		int hours;
		int mins;
		
		// Mensaje para solicitar los segundos
		System.out.print("Introduce tu cantidad de segundos: ");
		secs = reader.nextInt();
		
		// Operaciones
		hours = secs / 3600;
		mins = secs / 60;
		
		// Mensaje final
		System.out.println(hours + "h " + (mins < 60 ? mins : mins - 60) + "min");

	}

}
