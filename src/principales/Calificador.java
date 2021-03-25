package principales;

public class Calificador {
	
	String nombre;
	int porcentaje;
	TiposCalificadores tipo;
	
	public Calificador(String nombre, int porcentaje, TiposCalificadores tipo) {
		this.nombre = nombre;
		this.porcentaje = porcentaje;
		this.tipo = tipo;
	}

	public TiposCalificadores getTipo() {
		return tipo;
	}

	public void setTipo(TiposCalificadores tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
