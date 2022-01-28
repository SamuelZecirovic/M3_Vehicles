package objects;

public class Camiones extends Vehiculos{

	private Rueda ruedasDelanteras[] = new Rueda [2];
	private Rueda ruedasTraseras[] = new Rueda [2];
	
	public Camiones( String matricula, String marca, String color, String marcaD, String marcaT, double diametroD, double diametroT) {
		super(4, matricula, marca, color);
		ruedasDelanteras[0] = new Rueda('D',marcaD,diametroD);
		ruedasDelanteras[1] = new Rueda('D',marcaD,diametroD);
		ruedasTraseras[0] = new Rueda('T',marcaT,diametroT);
		ruedasTraseras[1] = new Rueda('T',marcaT,diametroT);
		
	}
	
	public Rueda[] getRuedasDelanteras() {
		return ruedasDelanteras;
	}

	public void setRuedasDelanteras(Rueda[] ruedasDelanteras) {
		this.ruedasDelanteras = ruedasDelanteras;
	}

	public Rueda[] getRuedasTraseras() {
		return ruedasTraseras;
	}

	public void setRuedasTraseras(Rueda[] ruedasTraseras) {
		this.ruedasTraseras = ruedasTraseras;
	}



	@Override
	public String toString() {

		return "Camoines [numruedas=" + numruedas + ", matricula=" + matricula + ", marca=" + marca + ", color="
				+ color + "]" + "\nruedasDelanteras=\n" + ruedasDelanteras[0].toString() + ruedasDelanteras[1].toString() + "ruedasTraseras=\n"
				+ ruedasTraseras[0].toString() + ruedasTraseras[1].toString();
	}
	
}
