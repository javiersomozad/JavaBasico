package genericos1;

public class Genericos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elemento[] miTabla = new Elemento[5];
		miTabla[0] = new Elemento("clave 0",1);
		miTabla[1] = new Elemento(1,"Elemento 2");
		miTabla[2] = new Elemento("clave 2",3);
		miTabla[3] = new Elemento("clave 3",4);
		miTabla[4] = new Elemento("clave 4",5);

		for (Elemento ele : miTabla) {
			System.out.println(ele.toString());
		}
	}

}
