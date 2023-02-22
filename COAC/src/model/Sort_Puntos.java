package model;

import java.util.Comparator;

/**
 * Clase Sort_Puntos, utilizada para ordenar el array de agrupaciones en base a los puntos obtenidos en el concurso
 * sólo valido para agruapciones oficiales.
 * @author maria
 * @since 22-02-2022
 */
public class Sort_Puntos implements Comparator<Agrupacion> {

	/**
	 * Método de comparación sobreescrito
	 * Ordenar el array de agrupaciones por los puntos obtenidos en el concurso
	 * Válido para Agrupaciones oficiales, los romanceros (no oficiales) aparecerán al final de la ordenación
	 * @return <ul>
	 * 				<li>0: si los puntos son iguales</li>
	 * 				<li>+1: si los puntos de a1 son mayores a2</li>
	 * 				<li>-1: si los puntos de a1 son menores a2</li>
	 * 		</ul>
	 */
	@Override
	public int compare(Agrupacion a1, Agrupacion a2) {
		int comp = +1;

		if (a1 != null && a2 != null) {
			if (a1 instanceof AgrupacionOficial && a2 instanceof AgrupacionOficial) {
				comp = ((AgrupacionOficial) a1).getPuntos().compareTo(((AgrupacionOficial) a2).getPuntos());
			}
		}
		return comp;
	}

}
