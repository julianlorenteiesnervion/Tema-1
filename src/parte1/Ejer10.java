package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Creamos el Scanner y las variables para el número
		Scanner readerNum = new Scanner(System.in);
		
		int num;
		int newnum;
		String resultado;
		
		// Le preguntamos el número
		System.out.print("Hola, dime un número: ");
		
		// Recogemos el número
		num = readerNum.nextInt();
		
		// Declaramos una variable para decir si es par o impar
		String parimpar;
		
		// Operación para calcular si el número es par o impar
		newnum = num%2;
		
		// Comprobación del número
		if (newnum == 0) {
			resultado = "par";
		}	
		else {
			resultado = "impar";
		}
		
		// Mensaje final
		System.out.println("Tu número introducido es " + resultado + ".");

	}

}
