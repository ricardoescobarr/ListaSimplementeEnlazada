
public class ListaEnlazadaSimple {
	private int indice;
	private Estudiante objeto;
	private Nodo primero;
	
	public ListaEnlazadaSimple() {
		objeto = new Estudiante();
		indice = 0;
		primero = null;
	}
	
	public void borrar(String carnet) {
		if(primero == null) {
			System.out.println("¡El listado esta vacío!");
		}else {
			if(primero.getObjeto().getCarnet().equals(carnet)) {
				primero = primero.getNodo();
				indice--;
			}else {
				Nodo actual = primero;
				while(actual.getNodo() != null && actual.getNodo().getObjeto().getCarnet() != carnet) {
					actual = actual.getNodo();
					if(actual.getNodo() == null) {
						System.out.println("El carnet: "+ carnet +" no se encuentra en el listado.");
					}else {
						actual.setNodo(actual.getNodo().getNodo());
						primero = actual;
						indice--;
					}
				}
			}
		}
	}
	
	public void agregar(Estudiante objeto) {
		Nodo nuevo = new Nodo(objeto, null);
		if (primero == null) {
			primero = nuevo;
		} else {
			Nodo actual = primero;
			while(actual.getNodo() != null) {
				actual = actual.getNodo();
			}
			actual.setNodo(nuevo);
			indice++;
		}
		System.out.println("Se agrego al final");
	}
	
	public void listado() {
		Nodo actual = primero;
		while(actual.getNodo() != null) {
			System.out.println(actual.getObjeto().getNombre());
			actual = actual.getNodo();
		}
		System.out.println(actual.getObjeto().getNombre());
	}
	
	

}
