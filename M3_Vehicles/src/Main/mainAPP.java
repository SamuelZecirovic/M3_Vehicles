package Main;

import javax.swing.JOptionPane;

import objects.Coches;

public class mainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	 String matricula,marca, color, crear = JOptionPane.showInputDialog("Que quiere crear? \n1)Coche\n2)Moto");
		
	 switch (crear) {
	case "1":
		do 
			matricula = JOptionPane.showInputDialog("Matricula");
		
		while(!comprobarMatricula(matricula));
		
		marca = JOptionPane.showInputDialog("Marca");
		color = JOptionPane.showInputDialog("Color");
		
		Coches c1 = new Coches(matricula,marca,color,"aaa","aaa",2,2);

		System.out.println(c1);
		break;
		
	case "2":
		
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
	        return false;
	    
	}

}