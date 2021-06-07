
public class Estudiante {
	String carnet;
	String nombre;
	
	public Estudiante() {}
	
	public Estudiante(String carnet, String nombre) {
		this.carnet = carnet;
		this.nombre = nombre;
	}
	
	public String getCarnet() {
		return carnet;
	}
	
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
