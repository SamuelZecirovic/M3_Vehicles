package objects;

public class Motos extends Vehiculos {
	
	private Rueda ruedasDelanteras[] = new Rueda [1];
	private Rueda ruedasTraseras[] = new Rueda [1];

	public Motos( String matricula, String marca, String color, String marcaD, String marcaT, double diametroD, double diametroT) {
		super(2, matricula, marca, color);
		ruedasDelanteras[0] = new Rueda('D',marcaD,diametroD);
		ruedasTraseras[0] = new Rueda('T',marcaT,diametroT);
		
	}

	@Override
	public String toString() {

		return "Coches [numruedas=" + numruedas + ", matricula=" + matricula + ", marca=" + marca + ", color="
				+ color + "]" + "\nruedasDelanteras=\n" + ruedasDelanteras[0].toString() + "ruedasTraseras=\n"
				+ ruedasTraseras[0].toString();
	}

}
