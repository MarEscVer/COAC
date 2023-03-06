package view.participantes;

import model.Integrante;
import view.Principal;
import view.Util;

/**
 * <h2>Clase Opción de la Gestión de Participantes</h2>
 * @author maria
 * @since 06-03-2022
 */
public class OpcionP {

	/**
	 * Gestión para añadir un Integrante
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Integrante
	 * @see Principal
	 */
	public static void addIntegrante() {
		int opc = 1;
		do {
			Integrante i = new Integrante();
			datosIntegrantes(i);
			Principal.coac.inscribir_participante(i);
			if(!Principal.preguntarMas()) {opc = 0;};
		} while (opc != 0);
	}
	
	/**
	 * Gestión para eliminar un Integrante
	 * Muestra el listado de todos los Integrantes para que el usuario introduzca la posición del que desea eliminar
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Integrante
	 * @see Principal
	 */
	public static void delIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.leerInt("¿cuál quieres borrar?: ");
			opc --;
			Principal.coac.eliminar_participante(Principal.coac.getIntegrantes()[opc]);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para editar un Integrante
	 * Muestra el listado de todos los Integrante para que el usuario introduzca la posición del que desea editar
	 * Se muestra el usuario los diferentes atributos para que los edite
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Principal
	 * @see Integrante
	 */
	static void editIntegrante() {
		int opc;
		do {
			listarIntegrantes();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			opc --;
			datosIntegrantes((Principal.coac.getIntegrantes()[opc]));
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Integrante
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter deja el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualiza el valor en ese atributo</li>
	 * </ul>
	 * @see Integrante
	 * @see Util
	 * @param a <i>Integrante a incializar/editar atributos</i>
	 */
	public static void datosIntegrantes(Integrante a) {
		String pregunta;
		String respuesta;
		int res;
		
		pregunta = "Nombre" + ( (a.getNombre() == null) ? ": " : "[" + a.getNombre() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setNombre(respuesta);
		
		pregunta = "Edad" + ( (a.getEdad() == null) ? ": " : "[" + a.getEdad() + "]: ");
		res = Util.leerInt(pregunta);
		if(respuesta.length() != 0) a.setEdad(res);
		
		pregunta = "Localidad" + ( (a.getLocalidad() == null) ? ": " : "[" + a.getLocalidad() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setLocalidad(respuesta);
	}
	
	/**
	 * Mostrar por pantalla un listado de todos los Integrantes incluidas en un Array que no sean nulos
	 * @param a <i>Array de Integrantes</i>
	 */
	public static void listar(Integrante[] a) {
		int cont = 1;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != null) {
				System.out.println((cont++) + ". " + a[i]);
			}
		}
	}
	
	/**
	 * Mostrar por pantalla un listado de todos los Integrantes de un COAC
	 */
	static void listarIntegrantes() {
		Integrante [] aux = Principal.coac.getIntegrantes();
		listar(aux);
	}
	
	/**
	 * Ordenar por nombre los integrantes del objeto COAC y listar todo por pantalla
	 */
	public void ordenar() {
		Principal.coac.ordenarIntegrantes();
		listarIntegrantes();
	}
}
