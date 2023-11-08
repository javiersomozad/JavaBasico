package vehiculos3;

public class Persona {
	
	// atributos
	private String nombre, dni, descripcion;
	private int edad;
	private Vehiculo v;

	
	// constructores
	// sin vehiculo
	public Persona(String nom, int e) {
		nombre = nom;
		edad = e;
	}

	// con bici
	public Persona(String nom, int e, String modelo, double precio) {
		nombre = nom;
		edad = e;
		v = new Bici(modelo, precio);
	}

	// con moto
	public Persona(String nom, int e, String marca, int cc) {
		nombre = nom;
		edad = e;
		v = new Moto(marca, cc);
	}
	
	// metodos
	public void introducirDNI(String d) {
		dni = d;
	}
	
	public void introducirDescripcion(String des) {
		descripcion = des;
	}
	
	public Vehiculo ObtenerMiVehiculo() {
		return v;
	}

	public void mostrarDatos() {
		System.out.println("Nombre : " + nombre);
		System.out.println("DNI : " + dni);
		System.out.println("Descripcion : " + descripcion);
		System.out.println("Edad : " + edad);
	}

}
