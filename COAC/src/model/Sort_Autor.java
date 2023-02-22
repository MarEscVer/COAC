package model;

import java.util.Comparator;

/**
 * Clase Sort_Autor, utilizada para ordenar el array de agrupaciones en base a los nombres de autor de las Agrupaciones
 * @author maria
 * @since 22-02-2022
 */
public class Sort_Autor implements Comparator<Agrupacion>{

	/**
	 * Método de comparación sobreescrito
	 * Ordenar el array de agrupaciones por el nombre del autor de la agrupación
	 * @return <ul>
	 * 				<li>0: si los nombres de los autores son iguales</li>
	 * 				<li>+1: si el nombre del autor de a1 es alfabeticamente superior al de a2</li>
	 * 				<li>-1: si el nombre del autor de a1 es alfabeticamente inferior al de a2</li>
	 * 		</ul>
	 */
	@Override
	public int compare(Agrupacion a1, Agrupacion a2) {
		int comp= 0;
		if(a1 != null && a2!=null) {
			comp = a1.getAutor().compareTo(a2.getAutor());
		}
		return comp;
	}
	
}
