package view;

import controller.COAC;
import model.Agrupacion;

public class Listado {
	
	public static void listar(Agrupacion[] a) {
		int cont = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println((cont++) + ". " + a[i]);
			}
		}
	}
	
	static void listarTodo() {	
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		listar(aux);
	}
	
	public static void listarChirigotas() {
		Agrupacion [] aux = COAC.obtenerChirigota(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	public static void listarCoros() {	
		Agrupacion [] aux = COAC.obtenerCoro(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	public static void listarCuartetos() {	
		Agrupacion [] aux = COAC.obtenerCuarteto(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	public static void listarComparsas() {	
		Agrupacion [] aux = COAC.obtenerComparsa(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	public static void listarRomanceros() {
		Agrupacion [] aux = COAC.obtenerRomancero(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	public static void listarOficiales() {
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		listar(aux);
	}
}
