package principales;

public class Asignatura {
	
	public String nombre;
	public int nota;
	
	public Asignatura(String nom) {
		this.nombre = nom;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
