package genericos;

public class Genericos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elemento[] miTabla = new Elemento[5];
		miTabla[0] = new Elemento(0,"elemento 1");
		miTabla[1] = new Elemento(0,"elemento 2");
		miTabla[2] = new Elemento(0,"elemento 3");
		miTabla[3] = new Elemento(0,"elemento 4");
		miTabla[4] = new Elemento(0,"elemento 5");

		for (Elemento ele : miTabla) {
			System.out.println(ele.toString());
		}
	}

}
