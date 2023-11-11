package genericos1;

public class Elemento <K,V>{
	K clave;
	V valor;

	public Elemento(K clave, V valor) {
		super();
		this.clave = clave;
		this.valor = valor;
	}
	public K getClave() {
		return clave;
	}
	public void setClave(K clave) {
		this.clave = clave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Elemento [clave=" + clave + ", valor=" + valor + "]";
	}	
}
