public class Nodo {
	private int indice;
	private Estudiante objeto;
	private Nodo siguiente;
	
	public Nodo (Estudiante objeto, Nodo siguiente) {
		this.objeto = objeto;
		this.siguiente = siguiente;
	}
	
	public Estudiante getObjeto() {
		return objeto;
	}
	
	public void setObjeto(Estudiante objeto) {
		this.objeto = objeto;
	}
	
	public Nodo getNodo() {
		return siguiente;
	}
	
	public void setNodo(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}
