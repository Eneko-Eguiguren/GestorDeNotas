package principales;

public class AsignaturaECTS extends Asignatura{
	
	public int ects;
	
	public AsignaturaECTS(String nom, int ects) {
		super(nom);
		this.ects = ects;
	}
	
	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}
	
	public String toString() {
		return nombre + " (valor : " + ects+" ects)" ;
		
	}
	
}
