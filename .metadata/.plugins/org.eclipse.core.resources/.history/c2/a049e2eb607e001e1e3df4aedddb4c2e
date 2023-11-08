package vehiculos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Persona sin vehiculo
		Persona persona1 = new Persona("Juan", 23);
		
		// Persona con Bici
		Persona persona2 = new Persona("Manuel", 27, "Mountain Bike", 999.99);

		// Persona con Moto
		Persona persona3 = new Persona("Jose", 25, "Honda", 500);

		// introduzco datos de las personas
		persona1.introducirDNI("1234");
		persona1.introducirDescripcion("Esta persona no tiene Vehiculo");

		persona2.introducirDNI("1235");
		persona2.introducirDescripcion("Esta persona tiene bici");

		persona3.introducirDNI("1236");
		persona3.introducirDescripcion("Esta persona tiene moto");
		
		// mostrar datos
		persona1.mostrarDatos();
		System.out.println();
		
		persona2.mostrarDatos();
		System.out.println("Bici : " + persona2.ObtenerBici().obtenerModelo());
		System.out.println("Precio : " + persona2.ObtenerBici().obtenerPrecio());
		System.out.println();
		
		persona3.mostrarDatos();
		System.out.println("Moto : " + persona3.ObtenerMoto().obtenerMarca());
		System.out.println("CC : " + persona3.ObtenerMoto().obtenerCC());		
		System.out.println();
		
	}
}
