package cierres;

import java.util.ArrayList;

class App2 {
	public static void main(String args[])
	{
		// Crea un ArrayList con estos elementos
		// {1, 2, 3, 4}
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);

		// Usa una expresion lambda para imprimir todos los elementos 
		// del ArrayList arrL
		arrL.forEach(n -> System.out.println(n));

		// Usa una expresion lambda para imprimir solo los elementos pares
		arrL.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}
}
