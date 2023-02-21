package model;

import java.util.Comparator;

public class Sort_Puntos implements Comparator<Agrupacion> {

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
