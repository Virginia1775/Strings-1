import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 * Pedir al usuario una cadena y decir si empieza por el carácter ‘H’
 */
public class Ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();
		
		if (cadena.charAt(0)=='H') {
			System.out.println(" la cadena empieza en H");
		} else  {
			System.out.println("La cadena no comienza con H");
		}
	}

}
