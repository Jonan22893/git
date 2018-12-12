package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class ArrayListDiccionarioInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creo el objeto de clase scanner
				Scanner teclado= new Scanner( System.in);
				// Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
				ArrayList<String> diccionario = new ArrayList<String>();
				//necesidades previas
				int opcion;
				String palabra;
				int posicion;
				//Escribo el meni
				System.out.println("1.Añadir palabra ");
				System.out.println("2.Buscar palabra");
				System.out.println("3.Borrar Palabra ");
				System.out.println("4.Listar palabra ");
				System.out.println("0.Salir");
				System.out.println("Elige una opcion");
					opcion=teclado.nextInt();
				while(opcion!=0) {
					
				switch (opcion){
				case 1:
					//pido una palabra
					//limpio buffer
					teclado.nextLine();
					System.out.println("Escribe la palabra que quieras añadir");
					palabra=teclado.nextLine();
					if(diccionario.contains(palabra)) {
						System.out.println("La palabra "+ palabra +"ya existe");
					}
					else {
					diccionario.add(palabra);
					}
					break;
				case 2:
					//pido una palabra
					//limpio buffer
					teclado.nextLine();
					System.out.println("Escribe la palabra que quieras buscar");
					palabra=teclado.nextLine();
					//la busca en el diccionario
					if(diccionario.contains(palabra)) {
						System.out.println("La palabra" + palabra + "esta en el diccionario");
					}
					else {
						System.out.println("La palabra" + palabra + "que buscas no existe");
					}
					break;
				case 3:
					//limpio buffer
					teclado.nextLine();
					System.out.println("Escribe la palabra que quieras borrar");
					palabra=teclado.nextLine();
					if(diccionario.contains(palabra)) {
					diccionario.remove(palabra);
					System.out.println("La palabra"+ palabra +" ha sido eliminada");
					}
					else {
						System.out.println("la palabra"+ palabra +"que desea eliminar no esta");
					}
					break;
				case 4:
					//muestro todos los elementos del diccionario por pantalla
					//si es que tieen elementos
					//ordenados alfabeticamente
					Collections.sort(diccionario);
					Comparator<String> comparador = Collections.reverseOrder();
					Collections.sort(diccionario, comparador);
					for (posicion = 0; posicion < diccionario.size(); posicion++) {
						System.out.println(diccionario.get(posicion));
					}
					break;
				
				}
				System.out.println("Elige una opcion");
				opcion=teclado.nextInt();
				}
				teclado.close();
	}

}
