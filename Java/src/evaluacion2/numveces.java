package evaluacion2;

import java.util.Scanner;

public class numveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double media;
			int n, posicion, elementos;
			int[] arrayenteros=new int[5];
			Scanner teclado=new Scanner(System.in);
			System.out.println("introduce un valor");
			n=teclado.nextInt();
			elementos=0;
			while(elementos<5 && n>=0) {
				arrayenteros[elementos]=n;
				elementos=elementos+1;
				if(elementos<5) {
					System.out.println("Introduce un valor");
					n=teclado.nextInt();
					
				}
			}
			//Libero memoria asignada al objeto llamado teckadi
			teclado.close();
			posicion=0;
			media=0.0;
while(posicion<elementos) {
	media=media+arrayenteros[posicion];
	posicion=posicion+1;
}
media=media/elementos;
System.out.println("La media es" + media);
}

}
