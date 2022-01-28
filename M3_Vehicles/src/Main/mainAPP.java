package Main;

import javax.swing.JOptionPane;

import objects.Camiones;
import objects.Coches;
import objects.Motos;
import objects.Titular;

public class mainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//crear usuarios	
	String nombre = JOptionPane.showInputDialog("nombre titular"),
		   apellidos = JOptionPane.showInputDialog("apellidos titular"),
		   fechanacimiento = JOptionPane.showInputDialog("fecha de nacimiento del titular"),
		   licencia = JOptionPane.showInputDialog("tipo licencia \nC (coches) \nM (motos) \nCA(camiones)"),
		   caducidad = JOptionPane.showInputDialog("caducidad licencia"),
		   id = JOptionPane.showInputDialog("id licencia");
	boolean seguro = false, garaje =false, correcto = true;
	int opcion = 0;
	//tiene seguro?
	do {
		opcion = Integer.parseInt(JOptionPane.showInputDialog("el titular tiene seguro? \n1) si \n2) no"));
		correcto = true;
		if (opcion == 1) {
			seguro = true;
		}else if (opcion == 2) {
			seguro = false;
		}else {
			correcto = false;
		}
	}while(correcto == false);
	
	//tiene garaje?
	do {
		opcion = Integer.parseInt(JOptionPane.showInputDialog("el titular tiene garaje? \n1) si \n2) no"));
		correcto = true;
		if (opcion == 1) {
			garaje = true;
		}else if (opcion == 2) {
			garaje = false;
		}else {
			correcto = false;
		}
	}while(correcto == false);

	Titular t1 = new Titular(nombre,apellidos,fechanacimiento,licencia,id,caducidad,seguro,garaje);
	
	// crear vehiculo	
	 String matricula,marca, color,marcadelantera,marcatrasera, crear = JOptionPane.showInputDialog("Que quiere crear? \n1)Coche\n 2)Moto\n 3)Camion");
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

	 case "3":
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
			

			Camiones ca1 = new Camiones(matricula,marca,color,marcadelantera,marcatrasera,diametrodelantero,diametrotrasero);

			System.out.println(ca1);
			break;
	 default:
		System.out.println("escriba 1 para crear un coche o 2 para crear una moto");
		break;
	 }
	 
	}
	
	
	
	
	//funciones para comprobar que los datos esten correctos
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