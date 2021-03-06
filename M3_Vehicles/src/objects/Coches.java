package objects;

import java.util.Arrays;

public class Coches extends Vehiculos {

	private Rueda ruedasDelanteras[] = new Rueda [2];
	private Rueda ruedasTraseras[] = new Rueda [2];
	
	public Coches( String matricula, String marca, String color, String marcaD, String marcaT, double diametroD, double diametroT) {
		super(4, matricula, marca, color);
		ruedasDelanteras[0] = new Rueda('D',marcaD,diametroD);
		ruedasDelanteras[1] = new Rueda('D',marcaD,diametroD);
		ruedasTraseras[0] = new Rueda('T',marcaT,diametroT);
		ruedasTraseras[1] = new Rueda('T',marcaT,diametroT);
		
	}
	

	@Override
	public String toString() {

		return "Coches [numruedas=" + numruedas + ", matricula=" + matricula + ", marca=" + marca + ", color="
				+ color + "]" + "\nruedasDelanteras=\n" + ruedasDelanteras[0].toString() + ruedasDelanteras[1].toString() + "ruedasTraseras=\n"
				+ ruedasTraseras[0].toString() + ruedasTraseras[1].toString();
	}
	
	
	
}
