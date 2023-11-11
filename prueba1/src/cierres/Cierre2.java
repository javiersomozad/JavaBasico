package cierres;

public class Cierre2 {
	public static void main(String args[])
	{
		int a = 12;
		int b = 88;

		// implementation of closure in lambda expression
		temp(a, new Operation() {
			public void operate(int n)
			{
				System.out.println("Result is: " + (n + b));
			}
		});
	}

	private static void temp(int i, Operation op)
	{
		op.operate(i);
	}
}
