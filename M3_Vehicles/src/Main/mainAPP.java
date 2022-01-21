package Main;

import javax.swing.JOptionPane;

import objects.Coches;

public class mainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	 String matricula,marca, color, crear = JOptionPane.showInputDialog("Que quiere crear? \n"
	 										  + "1)coche 2)moto");
		
	 switch (crear) {
	case "1":
		matricula = JOptionPane.showInputDialog("matricula");
		marca = JOptionPane.showInputDialog("marca");
		color = JOptionPane.showInputDialog("color");
		
		Coches c1 = new Coches(matricula,marca,color);
		
		break;
		
	case "2":
		
		break;

	default:
		System.out.println("escriba 1 para crear un coche o 2 para crear una moto");
		break;
	}
	 
	}

}
