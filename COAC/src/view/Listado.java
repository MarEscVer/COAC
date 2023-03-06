package view;

import controller.COAC;
import model.Agrupacion;

/**
 * <h2>Clase Listado, creada para gestionar el listado de Objetos para la vista</h2>
 * @author maria
 * @since 06-03-2022
 */
public class Listado {
	
	/**
	 * Mostrar por pantalla un listado de todas las Agrupaciones incluidas en un Array que no sean nulas
	 * @param a <i>Array de Agrupaciones</i>
	 */
	public static void listar(Agrupacion[] a) {
		int cont = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println((cont++) + ". " + a[i]);
			}
		}
	}
	
	/**
	 * Mostrar por pantalla un listado de todas las Agrupaciones de un COAC
	 */
	static void listarTodo() {	
		Agrupacion [] aux = Principal.coac.getAgrupaciones();
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todas las Chirigotas de un COAC
	 */
	public static void listarChirigotas() {
		Agrupacion [] aux = COAC.obtenerChirigota(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todos los Coros de un COAC
	 */
	public static void listarCoros() {	
		Agrupacion [] aux = COAC.obtenerCoro(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todos los Cuartetos de un COAC
	 */
	public static void listarCuartetos() {	
		Agrupacion [] aux = COAC.obtenerCuarteto(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todas las Comparsas de un COAC
	 */
	public static void listarComparsas() {	
		Agrupacion [] aux = COAC.obtenerComparsa(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todos los Riomanceros de un COAC
	 */
	public static void listarRomanceros() {
		Agrupacion [] aux = COAC.obtenerRomancero(Principal.coac.getAgrupaciones());
		listar(aux);
	}
	
	/**
	 * Mostrar por pantalla un listado de todas las Agrupaciones Oficiales de un COAC
	 */
	public static void listarOficiales() {
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		listar(aux);
	}
}
