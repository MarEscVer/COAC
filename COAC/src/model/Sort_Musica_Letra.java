package model;

import java.util.Comparator;

public class Sort_Musica_Letra implements Comparator<Agrupacion> {

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
