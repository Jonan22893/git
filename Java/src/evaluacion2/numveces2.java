package evaluacion2;

import java.util.Scanner;

public class numveces2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pode numeros por pantalla de 0-9
		//calcula el numero de veces qye gab sido introducidos
		double media;
		int n, posicion, elementos;
		int[] arrayenteros=new int[10];
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce un valor");
		//Leo un valor
		System.out.println("Introduce un valor: ");
		n=teclado.nextInt();
		//Calcula el numero de veces que han sido introducidos
		//Finaliza la introduccion de datos
		while(n>=0 &&n<=9) {
			arrayenteros[0]=arrayenteros[n]+1;
			//LEo otro valor
			System.out.println("Introduce un valor: ");
				n=teclado.nextInt();
			
		}
		teclado.close();
		//Al finalizar la itroduccion de datos muestra por pantalla el número de veces que se ha introducido un numero
		posicion=0;
		while(posicion<10) {
			System.out.println(posicion+":"+arrayenteros[posicion]+"veces");
			posicion=posicion+1;
		}
	}

}
