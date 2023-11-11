package cierres;
// programa de JAVA para demostrar el uso de expresiones lambda

//Una simple interface funcional (una interface con un unico metodo adstracto
interface FuncInterface
{
	// la función astracta
	void abstractFun(int x);

	// otra función pero esta no es adstracta, de estas puede tener las que quiera.
	default void normalFun()
	{
	System.out.println("Hello");
	}
}

class App1
{
	public static void main(String args[])
	{
		// la expresion lamda se implementa ahora !!
		// odbiamente el metodo que se implenta es abstracFun() 
		//que es el unico adstracto
		FuncInterface fobj = (int x)->System.out.println(2*x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
		fobj.normalFun();
	}
}

