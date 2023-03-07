package OrderFiltertoArrayllistObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrays {


	public static void main(String Args[]) {
		Objeto clase1 = new Objeto("Espanol",20);
		Objeto clase2 = new Objeto("Matematicas",52);
		Objeto clase3 = new Objeto("Geometria",25);
		Objeto clase4 = new Objeto("Fisica",78);
		Objeto clase5 = new Objeto("Historia",12);

		ArrayList<Objeto> name = new ArrayList<>();
		name.add(clase1);
		name.add(clase2);
		name.add(clase3);
		name.add(clase4);
		name.add(clase5);
		
		System.out.println("Lista: "+name);
		
		
		//----------------------------------------------------------------------------------
		//----------------------------------------------------------------------------------
		//ORDENANDO POR COLLECTION: Permite ordenar la lista alterando la lista de objetos.-
		//----------------------------------------------------------------------------------
		//----------------------------------------------------------------------------------
		
		Collections.sort(name, Comparator.comparing(Objeto::getNombre));
		
		System.out.println("Lista Ordenada por nombre Asc: "+name);

		/*Ordenando lista de objetos por String de forma Ascendente*/

		Collections.sort(name, Comparator.comparing(Objeto::getNombre).reversed());
		
		System.out.println("Lista Ordenada por nombre Desc: "+name);
		


		/*Ordenando lista de objetos por Enteros*/
		
		Collections.sort(name, Comparator.comparing(Objeto::getDuracion));
		
		System.out.println("Lista ordenada Entero Asc: "+ name);

		/*Ordenando lista de objetos por Entero de forma Ascendente*/

		Collections.sort(name, Comparator.comparing(Objeto::getDuracion).reversed());
		
		System.out.println("Lista ordenada por Entero Desc: "+ name);
		

		//----------------------------------------------------------------------------------
		//----------------------------------------------------------------------------------
		//ORDENANDO POR STEAM: Permite ordenar y filtrar la lista CREANDO nueva lista de objetos.-
		//----------------------------------------------------------------------------------
		//----------------------------------------------------------------------------------
		
		
		// Ordena en relación al tiempo con comparator.comparingInt
		
		List<Objeto> nuevaListaTiempo =  name.stream().sorted(Comparator.comparingInt(Objeto::getDuracion)).collect(Collectors.toList());
		System.out.println("\nLista ordenada por tiempo con STREAM: "+nuevaListaTiempo);


		// Ordena en relación al NOMBRE con comparator.comparingInt ASC
		List<Objeto> nuevaListaNombre =  name.stream().sorted(Comparator.comparing(Objeto::getNombre)).collect(Collectors.toList());
		System.out.println("Lista ordenada por tiempo con STREAM ASC: "+nuevaListaNombre);
		
		// Ordena en relación al NOMBRE con comparator.comparingInt ASC FILTRANDO
		List<Objeto> nuevaListaNombrefiltro =  name.stream().filter(Objeto -> !Objeto.getNombre().equals("Geometria")).sorted(Comparator.comparing(Objeto::getNombre)).collect(Collectors.toList());
		System.out.println("Lista ordenada por tiempo con STREAM FILTRANDO: "+nuevaListaNombrefiltro);
				
		
	}
	
}
