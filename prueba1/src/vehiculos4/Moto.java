package vehiculos4;

public class Moto implements Vehiculo  {
	// Atributos
	String marca;
	int cc;
	
	// constructor
	public Moto (String marca, int cc) {
		this.marca = marca;
		this.cc = cc;
	}
	
	// metodos
	public String obtenerMarca() {
		return marca;
	}
	
	public int obtenerCC( ) {
		return cc;
	}
	
	public String obtenerVehiculo() {
		String miCadena ="Moto : " + marca + "\nCC : " + cc;
		return miCadena;
	}
}
