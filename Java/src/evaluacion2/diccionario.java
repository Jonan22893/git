package evaluacion2;

import java.util.Scanner;

public class diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//REcibe palabras por teclado
		//las almacena en un array de strings
		//hasta que llega una cadena vacia que no
		//o el array este lleno
		String cadena;
		int elementos=0, posicion;
		String Diccionario []=new String[10];
		//creo el objeto Scanner teclado 
		Scanner teclado=new Scanner(System.in);
		//leo cadena
		System.out.println("Introduce una cadena: ");
		cadena=teclado.nextLine();
		while(!cadena.isEmpty()&& elementos<10) {
			//añado cadena añ diccionario
			///de manera ordenada			i
			
			//buscar la posicion
			posicion=0;
			while(posicion<elementos) {
				//compruebo la posicion
				if(cadena.compareTo(Diccionario[posicion])<0) {
					//si es la posicion
					break;
				}
				//voy a la siguiente posicion
				posicion=posicion+1;
			}
			//desplazo lops elementos desde la posicion 
			for(int posmov=elementos;posmov>posicion;posicion--) {
				Diccionario[posmov]=Diccionario[posmov-1];
			}
			//Inserto la cadena en la posicon
			Diccionario[posicion]=cadena;
			//Incremento el numero de elementos
			elementos=elementos+1;
			//leo otra cadena
			System.out.println("Introduce una cadena: ");
			cadena=teclado.nextLine();
		}
		//libero la memoria asognada al objeto scanner
		teclado.close();
		//muestro el contenido
		for(posicion=0;posicion<elementos; posicion++) {
			System.out.println(Diccionario[posicion]);
		}
	}

}
