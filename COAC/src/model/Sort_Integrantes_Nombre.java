package model;

import java.util.Comparator;

public class Sort_Integrantes_Nombre implements Comparator<Integrante>{

	@Override
	public int compare(Integrante a1, Integrante a2) {
		int comp= 0;
		if(a1 != null && a2!=null) {
			comp = a1.getNombre().compareTo(a2.getNombre());
		}
		return comp;
	}
	
}
