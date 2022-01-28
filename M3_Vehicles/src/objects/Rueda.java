package objects;

public class Rueda {
	private char tipo = 'D';
	private String marca;
	private double diametro;
	
	
	
	public Rueda(char tipo, String marca, double diametro) {
		if(tipo == 'D' || tipo == 'T')
			this.tipo = tipo;
		else
			System.out.println("Tipo no valido");
		
		this.marca = marca;
		if(diametro > 0.4 && diametro < 4)
			this.diametro = diametro;
		else
			System.out.println("Diametro no valido");
	}



	@Override
	public String toString() {
		return "Rueda [tipo=" + tipo + ", marca=" + marca + ", diametro=" + diametro + "]\n";
	}
	
	
	
}
