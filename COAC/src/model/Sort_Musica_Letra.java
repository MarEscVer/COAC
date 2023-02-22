package model;

import java.util.Comparator;

/**
 * Clase Sort_Musica_Letra, utilizada para ordenar el array de agrupaciones en base a los nombres de autor de la música y letra de las Agrupaciones
 * @author maria
 * @since 22-02-2022
 */
public class Sort_Musica_Letra implements Comparator<Agrupacion> {

	/**
	 * Método de comparación sobreescrito
	 * Ordenar el array de agrupaciones por el nombre del autor de las letras de la agrupación y, en caso de ser iguales, por el nombre del autor de letras
	 * @return <ul>
	 * 				<li>0: si los nombres de los autores son iguales</li>
	 * 				<li>+1: si el nombre del autor de la música de a1 es alfabeticamente superior al de a2 o en caso que sean iguales, el nombre del autor de letras de a1 es alfabeticamente superior al de a2 </li>
	 * 				<li>-1: si el nombre del autor de la música de a1 es alfabeticamente inferior al de a2 o en caso que sean iguales, el nombre del autor de letras de a1 es alfabeticamente inferior al de a2</li>
	 * 		</ul>
	 */
	@Override
	public int compare(Agrupacion a1, Agrupacion a2) {
		int comp = 0;
		if (a1 != null && a2 != null) {
			comp = a1.getAutor_musica().compareTo(a2.getAutor_musica());
			if (comp == 0) {
				comp = a1.getAutor_letra().compareTo(a2.getAutor_letra());
			}
		}
		return comp;
	}
}
