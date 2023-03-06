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
import model.Sort_Integrantes_Nombre;
import model.Sort_Musica_Letra;
import model.Sort_Nombre;
import model.Sort_Puntos;

/**
 * <h2>Clase COAC, se utiliza para crear COAC (Concurso de Agrupaciones Carnavalescas) y su gestión</h2>
 * @author maria
 * @since 06-03-2022
 */
public class COAC {

	private static final int AGRUPACIONESDEFECTO = 10;
	/**
	 * Constante que indica el número máximo de integrantes por defecto de un objeto COAC
	 */
	private static final int INTEGRANTESDEFECTO = 20;
	/**
	 * Atributo Agrupaciones, array de agrupaciones que compiten en el Concurso
	 */
	private Agrupacion[] agrupaciones;
	/**
	 * Atributo Integrantes, array de Integrantes que compiten en el Concurso
	 */
	private Integrante[] integrantes;

	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto COAC llamando constructor con un parametro e indicando como tamaño
	 * del array agrupaciones con el número por defecto <i>AGRUPACIONESDEFECTO</i>
	 */
	public COAC() {
		this(AGRUPACIONESDEFECTO);
	}

	/**
	 * Constructor con un parámetro
	 * Crea el objeto COAC especificando el tamaño máximo de agrupaciones a guardar en el array <i>agrupaciones</i>
	 * Inicializa el array de integrantes con el número por defecto <i>INTEGRANTESDEFECTO</i>
	 */
	public COAC(int tamaño) {
		agrupaciones = new Agrupacion[tamaño];
		integrantes = new Integrante[INTEGRANTESDEFECTO];
	}

	/**
	 * Obtener el valor del atributo array de Agrupaciones
	 * @return valor de agrupaciones
	 */
	public Agrupacion[] getAgrupaciones() {
		return agrupaciones;
	}

	/**
	 * Establecer el valor al atributo array de Agrupaciones
	 * @param agrupaciones <i>Array de Agrupaciones</i>
	 */
	public void setAgrupaciones(Agrupacion[] agrupaciones) {
		this.agrupaciones = agrupaciones;
	}
	
	/**
	 * Obtener el valor del atributo array de Integrantes
	 * @return valor de Integrantes
	 */
	public Integrante[] getIntegrantes() {
		return integrantes;
	}

	/**
	 * Establecer el valor al atributo array de Integrantes
	 * @param integrantes <i>Array de Integrantes</i>
	 */
	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}

	/**
	 * Inscribir una Agrupación en el Array de Agrupaciones
	 * Comprueba que la Agrupación no exista en el array y, si es así, la añade
	 * @see Agrupacion
	 * @param a <i>Objeto Agrupación</i>
	 * @return <ul>
	 * 				<li>true: se ha podido añadir la agrupación</li>
	 * 				<li>false: no se ha podido añadir la agrupación</li>
	 * 			</ul>
	 */
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

	/**
	 * Eliminar una Agrupación en el Array de Agrupaciones
	 * Comprueba que la Agrupación exista en el array y, si es así, la elimina
	 * @see Agrupacion
	 * @param a <i>Objeto Agrupación</i>
	 * @return <ul>
	 * 				<li>true: se ha podido eliminar la agrupación</li>
	 * 				<li>false: no se ha podido eliminar la agrupación</li>
	 * 			</ul>
	 */
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
	
	/**
	 * Inscripbir un Integrante en el Array de Integrantes del Concurso
	 * Comprueba que el integrante no exista en el array y, si es así, lo añade
	 * @see Integrante
	 * @param i <i>Objeto Integrante</i>
	 * @return <ul>
	 * 				<li>true: se ha podido añadir el integrante</li>
	 * 				<li>false: no se ha podido añadir el integrante</li>
	 * 			</ul>
	 */
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

	/**
	 * Eliminar un Integrante en el Array de Integrantes del Concurso
	 * Comprueba que el integrante exista en el array y, si es así, lo elimina
	 * @param i <i>Objeto Integrante</i>
	 * @see Integrante
	 * @return <ul>
	 * 				<li>true: se ha podido eliminar el integrante</li>
	 * 				<li>false: no se ha podido eliminar el integrante</li>
	 * 			</ul>
	 */
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
	
	/**
	 * Obtener un Array de todas las Agrupaciones Oficiales existentes en un COAC
	 * Primero contamos el número de Agrupaciones Oficiales que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá las Agrupaciones Oficiales
	 * Tercero añadimos al nuevo array todas las Agrupaciones Oficiales que contiene el COAC
	 * @see AgrupacionOficial
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Agrupaciones Oficiales
	 */
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
	
	/**
	 * Obtener un Array de todas las Chirigotas existentes en un COAC
	 * Primero contamos el número de Chirigotas que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá las Chirigotas
	 * Tercero añadimos al nuevo array todas las Chirigotas que contiene el COAC
	 * @see Chirigotas
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Chirigotas
	 */
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
	
	/**
	 * Obtener un Array de todas las Comparsa existentes en un COAC
	 * Primero contamos el número de Comparsa que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá las Comparsa
	 * Tercero añadimos al nuevo array todas las Comparsa que contiene el COAC
	 * @see Comparsa
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Comparsa
	 */
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
	
	/**
	 * Obtener un Array de todos los Coro existentes en un COAC
	 * Primero contamos el número de Coro que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá los Coro
	 * Tercero añadimos al nuevo array todos los Coro que contiene el COAC
	 * @see Coro
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Coro
	 */
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
	
	/**
	 * Obtener un Array de todos los Cuarteto existentes en un COAC
	 * Primero contamos el número de Cuarteto que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá los Cuarteto
	 * Tercero añadimos al nuevo array todos los Cuarteto que contiene el COAC
	 * @see Cuarteto
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Cuarteto
	 */
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

	/**
	 * Obtener un Array de todos los Romancero existentes en un COAC
	 * Primero contamos el número de Romancero que contiene el COAC
	 * Segundo inicializamos un nuevo Array que contendrá los Romancero
	 * Tercero añadimos al nuevo array todos los Romancero que contiene el COAC
	 * @see Romancero
	 * @param agrupaciones <i>Array de Objetos Agrupaciones</i>
	 * @return Array de Romancero
	 */
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
	
	/**
	 * Ordenar el Array de Agrupaciones por Nombre
	 * @see Sort_Nombre
	 */
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones, new Sort_Nombre());
	}
	
	/**
	 * Ordenar el Array de Integrantes por Nombre
	 * @see Sort_Integrantes_Nombre
	 */
	public void ordenarIntegrantes() {
		Arrays.sort(integrantes, new Sort_Integrantes_Nombre());
	}

	/**
	 * Ordenar el Array de Agrupaciones por nombre del Autor
	 * @see Sort_Autor
	 */
	public void ordenar_por_autor() {
		Arrays.sort(agrupaciones, new Sort_Autor());
	}

	/**
	 * Ordenar el Array de Agrupaciones por nombre del Autor de Música y, si no, Letra
	 * @see Sort_Musica_Letra
	 */
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupaciones, new Sort_Musica_Letra());
	}
	
	/**
	 * Ordenar el Array de Agrupaciones (solo Oficiales) por los Puntos obtenidos
	 * @see Sort_Puntos
	 */
	public void ordenar_por_puntos() {
		Arrays.sort(obtenerOficiales(agrupaciones), new Sort_Puntos());
	}
	
	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de un COAC
	 * @return representación en texto de un COAC
	 */
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
