package Main;

import javax.swing.JOptionPane;

import objects.Coches;
import objects.Motos;

public class mainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	 String matricula,marca, color,marcadelantera,marcatrasera, crear = JOptionPane.showInputDialog("Que quiere crear? \n1)Coche\n 2)Moto");
	 double diametrodelantero, diametrotrasero;
	 switch (crear) {
	 case "1":
		do 
			matricula = JOptionPane.showInputDialog("Matricula (1234AA / 1234AAA)");
		
		while(!comprobarMatricula(matricula));
		
		marca = JOptionPane.showInputDialog("Marca");
		color = JOptionPane.showInputDialog("Color");
		marcadelantera = JOptionPane.showInputDialog("marca ruedas delanteras");
		marcatrasera = JOptionPane.showInputDialog("marca ruedas traseras");
		
		do 
			diametrodelantero = Double.parseDouble(JOptionPane.showInputDialog("diametro ruedas delanteras"));
		
		while(!comprobarDiametro(diametrodelantero));
		
		do 
			diametrotrasero = Double.parseDouble(JOptionPane.showInputDialog("diametro ruedas traseras"));
		
		while(!comprobarDiametro(diametrotrasero));
		

		Coches c1 = new Coches(matricula,marca,color,marcadelantera,marcatrasera,diametrodelantero,diametrotrasero);

		System.out.println(c1);
		break;
		
	 case "2":
		
		do 
			matricula = JOptionPane.showInputDialog("Matricula (1234AA / 1234AAA)");
		
		while(!comprobarMatricula(matricula));
		
		marca = JOptionPane.showInputDialog("Marca");
		color = JOptionPane.showInputDialog("Color");
		marcadelantera = JOptionPane.showInputDialog("marca ruedas delanteras");
		marcatrasera = JOptionPane.showInputDialog("marca ruedas traseras");
		do 
			diametrodelantero = Double.parseDouble(JOptionPane.showInputDialog("diametro ruedas delanteras"));
		
		while(!comprobarDiametro(diametrodelantero));
		
		do 
			diametrotrasero = Double.parseDouble(JOptionPane.showInputDialog("diametro ruedas traseras"));
		
		while(!comprobarDiametro(diametrotrasero));
		

		Motos m1 = new Motos(matricula,marca,color,marcadelantera,marcatrasera,diametrodelantero,diametrotrasero);

		System.out.println(m1);
		
		break;

	 default:
		System.out.println("escriba 1 para crear un coche o 2 para crear una moto");
		break;
	 }
	 
	}
	
	public static boolean comprobarMatricula(String matr) {
		
		if (matr.toUpperCase().matches("^[0-9]{4}[A-Z]{2,3}$")) 
	        return true;
	    else
	    	System.out.println("matricula no valida");
	        return false;
	}
	
	public static boolean comprobarDiametro(double diametro) {
		
		if(diametro > 0.4 && diametro < 4)
	        return true;
	    else
			System.out.println("Diametro no valido");
	        return false;
	}

}