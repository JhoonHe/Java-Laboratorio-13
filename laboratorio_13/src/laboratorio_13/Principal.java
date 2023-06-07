package laboratorio_13;

import javax.swing.JOptionPane;

public class Principal {

	Flecha flecha1, flecha2, flecha3, flecha4, flecha5;
	
	public static void main(String[] args) {
		
		new Principal();
	}
	
	public Principal() {
		
		String color = "";
		int longitud = 0;
		
		flecha1 = new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longitud = 34;
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(12, "negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha"));
		color = JOptionPane.showInputDialog("Ingrese el color de la flecha");
		flecha4 = new Flecha (longitud, color);
		flecha4.construirFlecha();
		flecha4.imprimirEspacio();
	
	}

}

