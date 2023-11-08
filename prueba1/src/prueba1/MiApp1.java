package prueba1;

import java.util.Scanner;
public class MiApp1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero :");
		numero = leer.nextInt();
		System.out.println(" el numero introducido es :" + numero);
		
		leer.close();
	}

}
