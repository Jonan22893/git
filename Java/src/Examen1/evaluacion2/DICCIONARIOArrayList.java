package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class DICCIONARIOArrayList {

	public static void main(String[] args) {
		// Recibe palabras por teclado y las almacena en un array de Strings en orden
		// alfab�tico ascendente hasta que llega una cadena vac�a que no ser� tenida en
		// cuenta (isEmpty()) o el array est� lleno. Una vez finalizado el proceso
		// muestra el contenido del array por pantalla.

		// Necesidades previas
		int elementos, posicion;
		String C;
		ArrayList<String> diccionario = new ArrayList<String>();

		// Definir teclado
		Scanner teclado = new Scanner(System.in);

		// Pide cadena
		System.out.printf("Introduce una cadena: ");
		C = teclado.nextLine();

		//compruebo que no esta el array lleno o la cadena vacia
		elementos = 0;
		while (!(C.isEmpty())) {
			
			//a�ado la cadena al diccionario de manera ordenada
			
			//busacar la posicion
			posicion = 0;
			while (posicion < elementos) {
				
				//compruebo si es la posicion
				if (C.compareTo(diccionario.get(posicion)) < 0) {
					
					//salgo de la repetitiva
					break;
				}
				
				//incremento posicion
				posicion = posicion + 1;
			}
			
			//desplazo los elementos una posicion a la derecha
			for (int posmov=elementos;posmov>posicion;posmov--) {
				diccionario[posmov] = diccionario[posmov-1];
			}
			
			//inserto la cadena en la posicion
			diccionario.set(posicion, C);
			
			//incremento elementos
			elementos = elementos + 1;
			
			//leo otra cadena
			if (elementos < 5) {
				System.out.printf("Introduce una cadena: ");
				C = teclado.nextLine();
			}
		}
		
		//libero memoria signada a teclado
		teclado.close();
		
		//mostrar el contenido de diccionario
		posicion = 0;
		while (posicion < elementos) {
			System.out.printf(diccionario.get(posicion) + " ");
			posicion = posicion + 1;
		}

	}

}
