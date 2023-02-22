package model;

import java.util.Comparator;

public class Sort_Nombre implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion a1, Agrupacion a2) {
		int comp= 0;
		if(a1 != null && a2!=null) {
			comp = a1.getNombre().compareTo(a2.getNombre());
		}
		return comp;
	}
	
}
