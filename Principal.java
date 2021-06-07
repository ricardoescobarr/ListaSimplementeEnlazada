public class Principal {

	public static void main(String[] args) {
		ListaEnlazadaSimple registros = new ListaEnlazadaSimple();
		System.out.println("CREAMOS LOS REGISTROS INICIALES");
		registros.agregar(new Estudiante("0000-21-001", "Bryan Folgar"));
		registros.agregar(new Estudiante("0000-21-002", "Alexander Mota"));
		registros.agregar(new Estudiante("0000-21-003", "Emanuel Mota"));
		System.out.println("");
		System.out.println("MOSTRAMOS EL LISTADO");
		registros.listado();
		System.out.println("");
		System.out.println("Eliminar el carnet 0000-21-002");
		registros.borrar("0000-21-002");
		System.out.println("Eliminar el carnet 0000-21-003");
		registros.borrar("0000-21-003");
		System.out.println("");
		System.out.println("LISTAMOS NUEVAMENTE LOS ESTUDIANTES");
		registros.listado();
	}

}