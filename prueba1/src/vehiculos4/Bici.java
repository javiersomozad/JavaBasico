package vehiculos4;

public class Bici implements Vehiculo {
	// Atributos
	String modelo;
	double precio;
	
	// constructor
	public Bici (String m, double p) {
		modelo = m;
		precio = p;
	}
	
	// metodos
	public String obtenerModelo() {
		return modelo;
	}
	
	public double obtenerPrecio( ) {
		return precio;
	}
	
	public String obtenerVehiculo() {
		String miCadena = "Bici : " + modelo + "\nPrecio : " + precio;
		return miCadena;
	}
}
