package evaluacion1;

import java.util.Scanner;

public class sacaparw {

	public static void main(String[] args) {
		/*
		  Pide un n�mero entero por teclado y muestra los
		  n�meros desde 1 hasta �l inclusive. Con MIENTRAS. 
				
		 */

		int numero, posicion;
		
		
		Scanner teclado; // informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de l a clase Scanner llamado teclado
		
		
		//leer nota
		System.out.println("Cantidad: ");
		numero = teclado.nextInt(); // asigno el valor leido por teclado a la variable n

		teclado.close(); // libero la memoria asignada al objeto llamado teclado
		
		//muestra los numeros desde el 1 hasta el inclusive
		//iniciando posicion
		posicion = 0;
		
		while (posicion <= numero) {
			//escribir posicion
			System.out.println(posicion);
			//actualizo posicion
			posicion = posicion + 2;
		}
		
	}

}
