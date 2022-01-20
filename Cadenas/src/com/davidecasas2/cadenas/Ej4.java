package com.davidecasas2.cadenas;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * Pedir al usuario una frase y un carácter, y decir en qué posiciones está ese carácter, 
 * o indicar que no está si procede. Usa indexOf.
 */
public class Ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();
		
		System.out.println("Introduce el caracter a buscar: ");
		char letra = entrada.nextLine().charAt(0);
		
		int posicion = cadena.indexOf(letra);
		if (posicion==-1) {
			System.out.println("No se ha encontrado la letra");
		}
		while (posicion!=-1) {
			System.out.printf("La letra %c está en la posición %d\n",
					letra, posicion);
			posicion = cadena.indexOf(letra, posicion+1);
		}
		
		
		

		
	}

}
