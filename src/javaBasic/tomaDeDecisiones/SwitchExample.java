package javaBasic.tomaDeDecisiones;

import java.io.IOException;

public class SwitchExample {
	
	public static void main(String[] args) throws IOException {
		String opc = "1";		
		SwitchExample swit = new SwitchExample();
		swit.opcion(opc);
		
	}
	
	public void opcion(String opc) {
		switch(opc){
		case "1":
			System.out.println("Seleccionaste la opci�n 1");
			break;
		case "2":
			System.out.println("Seleccionaste la opci�n 2");
			break;
		case "3":
			System.out.println("Seleccionaste la opci�n 3");
			break;
		}
	}
}

