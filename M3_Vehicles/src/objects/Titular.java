package objects;

public class Titular extends Conductor{

	private boolean seguro, garaje;

	public Titular(String nombre, String apellidos, String fechanacimiento, String licencia, String id,
			String caducidad, boolean seguro, boolean garaje) {
		super(nombre, apellidos, fechanacimiento, licencia, id, caducidad);
		this.seguro = seguro;
		this.garaje = garaje;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	@Override
	public String toString() {
		return "Titular [seguro=" + seguro + ", garaje=" + garaje + "]";
	}
	
	
	
}
