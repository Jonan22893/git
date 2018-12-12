package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		ArrayList<Integer>Arraylistentero=new ArrayList<Integer>();
		int opcion;
		int n;
		int posicion;
		//Escribo el meni
		System.out.println("1.Añadir numero ");
		System.out.println("2.Buscar numero");
		System.out.println("3.Borrar numero ");
		System.out.println("4.Listar numero ");
		System.out.println("0.Salir");
		System.out.println("Elige una opcion");
			opcion=teclado.nextInt();
		while(opcion!=0) {
			
		switch (opcion){
		case 1:
			//Limpio el buffer
			teclado.nextInt();
			//pido un numero
			//Miro si tiene el numero
			System.out.println("Escribe el numero que quieras añadir");
			n=teclado.nextInt();
			if(Arraylistentero.contains(n)) {
				System.out.println("Error numero ya existente");
			}
			else {
				Arraylistentero.add(n);
			
			}
			break;
		case 2:
			break;
		case 3:
			//Limpio el buffer
			teclado.nextInt();
			//pido un numero
			//Miro si tiene el numero
			System.out.println("Escribe el numero que quieras añadir");
			n=teclado.nextInt();
			if(Arraylistentero.contains(n)) {
				Arraylistentero.remove(n);
			}
			break;
		case 4:
			break;
		
		}
		}
		
	}

}
