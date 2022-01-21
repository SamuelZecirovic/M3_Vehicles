package objects;

public class Vehiculos {

	protected static int numruedas;
	protected String matricula, marca, color;
	
	public int getNumruedas() {
		return numruedas;
	}

	public void setNumruedas(int numruedas) {
		this.numruedas = numruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehiculos(int numruedas, String matricula, String marca, String color) {
		super();
		this.numruedas = numruedas;
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculos [numruedas=" + numruedas + ", matricula=" + matricula + ", marca=" + marca + ", color="
				+ color + "]";
	}
	
	
	
	
}
