package model;

import java.util.Comparator;

/**
 * Clase Sort_Integrantes_Nombre, utilizada para ordenar el array de agrupaciones en base a los nombres de autor de las Agrupaciones
 * @author maria
 * @since 22-02-2022
 */
public class Sort_Integrantes_Nombre implements Comparator<Integrante>{

	/**
	 * Método de comparación sobreescrito
	 * Ordenar el array de integrantes por el nombre del Participante de una Agrupación
	 * @return <ul>
	 * 				<li>0: si los nombres de los autores son iguales</li>
	 * 				<li>+1: si el nombre del participante a1 es alfabeticamente superior al de a2</li>
	 * 				<li>-1: si el nombre del participante a1 es alfabeticamente inferior al de a2</li>
	 * 		</ul>
	 */
	@Override
	public int compare(Integrante a1, Integrante a2) {
		int comp= 0;
		if(a1 != null && a2!=null) {
			comp = a1.getNombre().compareTo(a2.getNombre());
		}
		return comp;
	}
	
}
