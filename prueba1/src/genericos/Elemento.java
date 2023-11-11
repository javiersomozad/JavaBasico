package genericos;

public class Elemento {
	int clave;
	String valor;

	public Elemento(int clave, String valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Elemento [clave=" + clave + ", valor=" + valor + "]";
	}	
}
