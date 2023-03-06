package view.concurso;

import controller.COAC;
import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import view.Listado;
import view.Principal;
import view.Util;

/**
 * <h2>Clase Opción de la Gestión del Concurso</h2>
 * @author maria
 * @since 06-03-2022
 */
public class OpcionC {

	/**
	 * Gestión para establecer una Agrupación "Caminito del Falla"
	 * Se muestra al usuario un listado de todas las Agrupaciones Oficiales para que introduzca la posición de la seleccionada
	 * Se muestra por pantalla el mensaje estipulado para cada Objeto
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see AgrupacionOficial
	 */
	static void caminito() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		do {
			Listado.listarOficiales();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;

			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida =  ((Chirigota) aux[opc]).caminitoDelFalla();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).caminitoDelFalla();
			case "Coro" -> salida = ((Coro) aux[opc]).caminitoDelFalla();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).caminitoDelFalla();
			default -> salida = "";
			}
			
			System.out.println("\n" + salida);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para establecer una Agrupación "Hacer el tipo"
	 * Se muestra al usuario un listado de todas las Agrupaciones Oficiales para que introduzca la posición de la seleccionada
	 * Se muestra por pantalla el mensaje estipulado para cada Objeto
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see AgrupacionOficial
	 */
	static void hacerTipo() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		do {
			Listado.listarOficiales();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida =((Chirigota) aux[opc]).hacerTipo();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).hacerTipo();
			case "Coro" -> salida = ((Coro) aux[opc]).hacerTipo();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).hacerTipo();
			default -> salida = "";
			}
			
			System.out.println("\n" + salida);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para establecer una Agrupación "Cantar la Presentación"
	 * Se muestra al usuario un listado de todas las Agrupaciones Oficiales para que introduzca la posición de la seleccionada
	 * Se muestra por pantalla el mensaje estipulado para cada Objeto
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see AgrupacionOficial
	 */
	static void cantaPresentacion() {
		int opc;
		String salida;
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		do {
			Listado.listarOficiales();
			opc = Util.leerInt("\n¿Cuál quieres?: ");
			opc--;
			
			switch(aux[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> salida = ((Chirigota) aux[opc]).cantarPresentacion();
			case "Comparsa" -> salida = ((Comparsa) aux[opc]).cantarPresentacion();
			case "Coro" -> salida = ((Coro) aux[opc]).cantarPresentacion();
			case "Cuarteto" -> salida = ((Cuarteto) aux[opc]).cantarPresentacion();
			default -> salida = "";
			}
		
			System.out.println("\n" + salida);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para editar el atributo puntos de una Agrupación Oficial
	 * Muestra el listado de todas las Agrupaciones Oficiales para que el usuario introduzca la posición del que desea editar
	 * Se muestra el usuario los diferentes atributos para que los edite
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Principal
	 * @see AgrupacionOficial
	 * @see Listado
	 */
	static void editPuntos() {
		int opc;
		Agrupacion [] aux = COAC.obtenerOficiales(Principal.coac.getAgrupaciones());
		do {
			System.out.println();
			Listado.listarOficiales();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			datoOficial((AgrupacionOficial)(aux[opc - 1]));
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para inicializar o editar el atributo puntos de un Objeto AgrupacionOficial
	 * Se muestra el usuario dicho atributo: <ul>
	 * 		<li>Si pulsa enter deja el valor ya existente</li>
	 * 	 	<li>Si escribe un valor, actualiza el valor</li>
	 * </ul>
	 * @see AgrupacionOficial
	 * @see Util
	 */
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Puntos obtenidos" + ( (a.getPuntos() == null) ? ": " : "[" + a.getPuntos() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta != 0) a.setPuntos(respuesta);
	}
	
	/**
	 * Ordenar por la cantidad de puntos del objeto COAC (Agrupaciones Oficiales) y listar todo por pantalla
	 * @see Listado
	 */
	static void ordernarPunto() {
		Principal.coac.ordenar_por_puntos();
		Listado.listarOficiales();
	}
	
	/**
	 * Ordenar por el nombre del objeto COAC (Agrupaciones Oficiales) y listar todo por pantalla
	 * @see Listado
	 */
	static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();;
		Listado.listarOficiales();
	}
		
	/**
	 * Ordenar por el nombre del autor del objeto COAC (Agrupaciones Oficiales) y listar todo por pantalla
	 * @see Listado
	 */
	static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();;
		Listado.listarOficiales();
	}
	
	/**
	 * Ordenar por el nombre del autor de la Música o del autor de la Letra del objeto COAC (Agrupaciones Oficiales) y listar todo por pantalla
	 * @see Listado
	 */
	static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();;
		Listado.listarOficiales();
	}
}