package javaBasic.arregloObjetos;

import java.util.ArrayList;

public class exampleArrayList {

	public static void main(String[] args) {
		ArrayList<CasaRefinada> myNumbers = new ArrayList<CasaRefinada>();
		myNumbers.add(new CasaRefinada("CasaEnorme", 40, 20));
		myNumbers.add(new CasaRefinada("CasaFome",  12, 30));
		for (int i = 0; i < myNumbers.size(); i++) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Este es el Nombre de mi casa: " + myNumbers.get(i).getNombre());
			System.out.println("Este es el Alto de mi casa: " +  myNumbers.get(i).getAlto());
			System.out.println("Este es el Ancho de mi casa: " +  myNumbers.get(i).getAncho());
			System.out.println("-----------------------------------------------------------------");
		}
	}

}
/*// Declaraci�n de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...) 
ArrayList<String> nombreArrayList = new ArrayList<String>(); 
//A�ade el elemento al ArrayList 
nombreArrayList.add("Elemento"); 
//A�ade el elemento al ArrayList en la posici�n 'n� 
nombreArrayList.add(n, "Elemento 2"); 
//Devuelve el numero de elementos del ArrayList 
nombreArrayList.size(); 
//Devuelve el elemento que esta en la posici�n '2' del ArrayList 
nombreArrayList.get(2); 
//Comprueba se existe del elemento ('Elemento') que se le pasa como parametro 
nombreArrayList.contains("Elemento"); 
//Devuelve la posici�n de la primera ocurrencia ('Elemento') en el ArrayList 
nombreArrayList.indexOf("Elemento"); 
//Devuelve la posici�n de la �ltima ocurrencia ('Elemento') en el ArrayList 
nombreArrayList.lastIndexOf("Elemento"); 
//Borra el elemento de la posici�n '5' del ArrayList 
nombreArrayList.remove(5); 
//Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro. 
nombreArrayList.remove("Elemento"); 
//Borra todos los elementos de ArrayList 
nombreArrayList.clear(); 
//Devuelve True si el ArrayList esta vacio. Sino Devuelve False 
nombreArrayList.isEmpty(); 
//Copiar un ArrayList 
ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone(); 
//Pasa el ArrayList a un Array Object[] array = nombreArrayList.toArray(); 
*/