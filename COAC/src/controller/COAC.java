package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import model.Sort_Autor;
import model.Sort_Musica_Letra;
import model.Sort_Puntos;

public class COAC {

	private Agrupacion[] agrupaciones;
	private Integrante[] integrantes;

	public COAC() {
		this(0);
	}

	public COAC(int tamaño) {
		agrupaciones = new Agrupacion[tamaño];
		integrantes = new Integrante[20];
	}

	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}
	
	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	public boolean inscribir_agrupacion(Agrupacion a) {
		boolean added = false;
		boolean isOK = false;
		// Verificamos que la agrupación no está ya incluida
		for (int x = 0; x < agrupaciones.length; x++) {
			if (agrupaciones[x] != null && agrupaciones[x].equals(a)) {
				isOK = true;
				break;
			}
		}
		// Lo añadimos en el primer hueco null del array
		if (!isOK) {
			for (int j = 0; j < agrupaciones.length; j++) {
				if (agrupaciones[j] == null) {
					agrupaciones[j] = a;
					added = true;
					break;
				}
			}
		}
		return added;
	}

	public boolean eliminar_agrupacion(Agrupacion a) {
		boolean deleted = false;
		for (int x = 0; x < agrupaciones.length; x++) {
			if (agrupaciones[x] != null && agrupaciones[x].equals(a)) {
				agrupaciones[x] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	public boolean inscribir_participante(Integrante a) {
		boolean added = false;
		boolean isOK = false;
		// Verificamos que la agrupación no está ya incluida
		for (int x = 0; x < integrantes.length; x++) {
			if (integrantes[x] != null && integrantes[x].equals(a)) {
				isOK = true;
				break;
			}
		}
		// Lo añadimos en el primer hueco null del array
		if (!isOK) {
			for (int j = 0; j < integrantes.length; j++) {
				if (integrantes[j] == null) {
					integrantes[j] = a;
					added = true;
					break;
				}
			}
		}
		return added;
	}

	public boolean eliminar_participante(Integrante a) {
		boolean deleted = false;
		for (int x = 0; x < integrantes.length; x++) {
			if (integrantes[x] != null && integrantes[x].equals(a)) {
				integrantes[x] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	//Obtener Array categorias
	public static Agrupacion[] obtenerOficiales(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof AgrupacionOficial) {
				 cont++;
			}
		}
		
		AgrupacionOficial[] agrupacionesOficiales = new AgrupacionOficial[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof AgrupacionOficial) {
				agrupacionesOficiales[cont++] = (AgrupacionOficial) agrupaciones[i] ;
			}
		}
		return agrupacionesOficiales;
	}
	
	public static Agrupacion[] obtenerChirigota(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Chirigota) {
				 cont++;
			}
		}
		
		Chirigota[] chirigota = new Chirigota[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Chirigota) {
				chirigota[cont++] = (Chirigota) agrupaciones[i] ;
			}
		}
		return chirigota;
	}
	
	public static Agrupacion[] obtenerComparsa(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Comparsa) {
				 cont++;
			}
		}
		
		Comparsa[] comparsa = new Comparsa[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Comparsa) {
				comparsa[cont++] = (Comparsa) agrupaciones[i] ;
			}
		}
		return comparsa;
	}
	
	public static Agrupacion[] obtenerCoro(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Coro) {
				 cont++;
			}
		}
		
		Coro[] coro = new Coro[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Coro) {
				coro[cont++] = (Coro) agrupaciones[i] ;
			}
		}
		return coro;
	}
	
	public static Agrupacion[] obtenerCuarteto(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Cuarteto) {
				 cont++;
			}
		}
		
		Cuarteto[] cuarteto = new Cuarteto[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Cuarteto) {
				cuarteto[cont++] = (Cuarteto) agrupaciones[i] ;
			}
		}
		return cuarteto;
	}
	
	public static Agrupacion[] obtenerRomancero(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Romancero) {
				 cont++;
			}
		}
		
		Romancero[] romancero = new Romancero[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Romancero) {
				romancero[cont++] = (Romancero) agrupaciones[i] ;
			}
		}
		return romancero;
	}
	
	//Ordenar	
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones);
	}
	
	public void ordenarIntegrantes() {
		Arrays.sort(integrantes);
	}

	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new Sort_Autor());
	}

	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new Sort_Musica_Letra());
	}
	
	public void ordenar_por_puntos() {
		Arrays.sort(obtenerOficiales(agrupaciones), new Sort_Puntos());
	}
	
	@Override
	public String toString() {
		String mensaje = "";
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] != null) {
				mensaje += (i+1) + ". " + agrupaciones[i].toString() + "\n";
			}
		}
		return mensaje;
	}
}
