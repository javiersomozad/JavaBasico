package cierres;

//programa para demostrar como se trabaja con expresiones lambda
public class App3 {

	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	private int operate(int a, int b, FuncInter1 fobj)
	{
		return fobj.operation(a, b);
	}

	public static void main(String args[])
	{
		FuncInter1 add = (int x, int y) -> x + y;

		FuncInter1 multiply = (int x, int y) -> x * y;

		App3 tobj = new App3();

		System.out.println("La suma es : "
						+ tobj.operate(6, 3, add));

		System.out.println("La multiplicación es : "
						+ tobj.operate(6, 3, multiply));

		// ahora la expresión lambda con un solo parametro
		FuncInter2 fobj = message
			-> System.out.println("Hello " + message);
		fobj.sayMessage("Geek");
	}
}
