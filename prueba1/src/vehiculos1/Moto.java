package vehiculos1;

public class Moto extends vehiculo  {
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
}
