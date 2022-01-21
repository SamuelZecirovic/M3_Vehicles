package objects;

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
	
	public boolean comprobarMatricula(String matr) {
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2,3}$")) {
	        System.out.println("Matrícula válida");
	        return true;

	    }else{

	        System.out.println("Matrícula inválida");
	        return false;
	    }
	}
}
