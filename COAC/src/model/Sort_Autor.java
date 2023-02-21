package model;

import java.util.Comparator;

public class Sort_Autor implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion a1, Agrupacion a2) {
		int comp= 0;
		if(a1 != null && a2!=null) {
			comp = a1.getAutor().compareTo(a2.getAutor());
		}
		return comp;
	}
	
}
