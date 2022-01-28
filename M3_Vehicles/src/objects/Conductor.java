package objects;

public class Conductor extends Persona {

	protected String caducidad, id;
	
	public Conductor(String nombre, String apellidos, String fechanacimiento, String licencia, String id,
		  String caducidad) {
		super(nombre, apellidos, fechanacimiento, licencia);
		this.id = id;
		this.caducidad = caducidad;
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Conductor [id=" + id  + ", nombre=" + nombre + ", caducidad="
				+ caducidad + "]";
	}
	
	
	
	
}
