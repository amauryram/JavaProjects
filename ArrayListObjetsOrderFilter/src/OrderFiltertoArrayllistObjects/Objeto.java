package OrderFiltertoArrayllistObjects;

public class Objeto {
	private String Nombre;
	private int Duracion;

	
	public Objeto(String nombre, int duracion) {
		Nombre = nombre;
		Duracion = duracion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getDuracion() {
		return Duracion;
	}
	public void setDuracion(int duracion) {
		Duracion = duracion;
	}
	
	@Override
	public String toString() {
		return this.getNombre();
	}

}
