package cierres;

import java.io.*;

interface NumToMonth {
	public String convertToMonth(int x);
}

class Cierre1 {

	public static void main(String[] args)
	{
		// Expresión Lambda
		NumToMonth obj = new NumToMonth() {
			String[] months
				= { "Enero", "Febrero", "Marzo", "Abril",
					"Mayo", "Junio", "Julio", "Agosto",
					"Septiembre", "Octubre", "Noviembre", "Diciembre" };

			public String convertToMonth(int n)
			{
				return (n > 0 && n <= months.length)
					? months[n - 1]
					: null;
			};
		};

		System.out.println(obj.convertToMonth(8));
	}
}
