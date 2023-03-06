package view;

import model.*;

/**
 * <h2>Clase Agrupaciones, creada para gestionar el menú de gestión de Agrupaciones para el usuario en la vista</h2>
 * @author maria
 * @since 06-03-2022
 */
public class Agrupaciones {
	
	/**
	 * Mostrar el menú de los tipos de agrupaciones posibles en el proyecto
	 */
	private static void mostrarmenuTipoAgrupaciones() {
		Util.escribirLn("\n");
		Util.escribirLn("┌───────────────────────┐");
		Util.escribirLn("│ TIPOS DE AGRUPACIONES │");
		Util.escribirLn("└───────────────────────┘");
		Util.escribirLn("  1. Coro.");
		Util.escribirLn("  2. Comparsa.");
		Util.escribirLn("  3. Chirigota.");
		Util.escribirLn("  4. Cuarteto.");
		Util.escribirLn("  5. Romancero.");
	}

	/**
	 * Gestión para añadir una Agrupación
	 * Muestra el menú de tipos de agrupaciones y se reraliza la lectura de la opción decidida por el usuario
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Principal
	 */
	static void addAgrupacion() {
		int opc;
		do {
			mostrarmenuTipoAgrupaciones();
			opc = Util.leerInt("Opción: ");
			switch (opc) {
			case 1 -> addCoro();
			case 2 -> addComparsa();
			case 3 -> addChirigota();
			case 4 -> addcuarteto();
			case 5 -> addRomancero();
			}
			if(!Principal.preguntarMas()) {opc = 0;};
		} while (opc != 0);
	}
	
	/**
	 * Gestión para eliminar una Agrupación
	 * Muestra el listado de todas las Agrupaciones para que el usuario introduzca la posición de la que desea eliminar
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Principal
	 * @see Listado
	 */
	static void delAgrupacion() {
		int opc;
		do {
			Listado.listarTodo();
			opc = Util.leerInt("¿cuál quieres borrar?: ");
			Principal.coac.eliminar_agrupacion(Principal.coac.getAgrupaciones()[opc-1]);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para editar una Agrupación
	 * Muestra el listado de todas las Agrupaciones para que el usuario introduzca la posición de la que desea editar
	 * Se muestra el usuario los diferentes atributos para que los edite (dependiendo del Objeto concreto)
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see Principal
	 * @see Listado
	 */
	static void editAgrupacion() {
		int opc;
		do {
			System.out.println();
			Listado.listarTodo();
			opc = Util.leerInt("¿Cuál quieres editar?: ");
			opc --;
			datosAgrupaciones((Principal.coac.getAgrupaciones()[opc]));
			
			switch(Principal.coac.getAgrupaciones()[opc].getClass().getCanonicalName()) {
			case "Chirigota" -> datochirigota((Chirigota) (Principal.coac.getAgrupaciones()[opc]));
			case "Comparsa" -> datocomparsa((Comparsa) (Principal.coac.getAgrupaciones()[opc]));
			case "Coro" -> datocoro((Coro) (Principal.coac.getAgrupaciones()[opc]));
			case "Cuarteto" -> datocuarteto((Cuarteto) (Principal.coac.getAgrupaciones()[opc]));
			case "Romancero" -> datoromancero((Romancero) (Principal.coac.getAgrupaciones()[opc]));
			default -> opc = Util.leerInt("¿Cuál quieres editar?: "); 
			}
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
	/**
	 * Gestión para añadir una Chirigota
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * @see Chirigota
	 * @see Principal
	 */
	static void addChirigota() {
		Chirigota ch = new Chirigota();
		datosAgrupaciones(ch);
		datochirigota(ch);
		Principal.coac.inscribir_agrupacion(ch);
	}
	
	/**
	 * Gestión para añadir un Coro
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * @see Coro
	 * @see Principal
	 */
	static void addCoro() {
		Coro c = new Coro();
		datosAgrupaciones(c);
		datocoro(c);
		Principal.coac.inscribir_agrupacion(c);
	}
	
	/**
	 * Gestión para añadir una Comparsa
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * @see Comparsa
	 * @see Principal
	 */
	static void addComparsa() {
		Comparsa com = new Comparsa();
		datosAgrupaciones(com);
		datocomparsa(com);
		Principal.coac.inscribir_agrupacion(com);
	}
	
	/**
	 * Gestión para añadir un Cuarteto
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * @see Cuarteto
	 * @see Principal
	 */
	static void addcuarteto() {
		Cuarteto cu = new Cuarteto();
		datosAgrupaciones(cu);
		datocuarteto(cu);
		Principal.coac.inscribir_agrupacion(cu);
	}
	
	/**
	 * Gestión para añadir un Romancero
	 * Se muestra el usuario los diferentes atributos para que los rellene
	 * @see Romancero
	 * @see Principal
	 */
	static void addRomancero() {
		Romancero r = new Romancero();
		datosAgrupaciones(r);
		datoromancero(r);
		Principal.coac.inscribir_agrupacion(r);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Agrupacion
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Agrupacion
	 * @see Util
	 * @param a <i>Agrupacion</i>
	 */
	private static void datosAgrupaciones(Agrupacion a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Nombre" + ( (a.getNombre() == null) ? ": " : "[" + a.getNombre() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setNombre(respuesta);
		
		pregunta = "Autor" + ( (a.getAutor() == null) ? ": " : "[" + a.getAutor() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutor(respuesta);
		
		pregunta = "Autor de la Música" + ( (a.getAutor_musica() == null) ? ": " : "[" + a.getAutor_musica() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutor_musica(respuesta);
		
		pregunta = "Autor de la Letra" + ( (a.getAutor_letra() == null) ? ": " : "[" + a.getAutor_letra() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setAutor_letra(respuesta);
		
		pregunta = "Tipo" + ( (a.getTipo() == null) ? ": " : "[" + a.getTipo() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setTipo(respuesta);

	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Agrupacion Oficial
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see AgrupacionOficial
	 * @see Util
	 * @param a <i>AgrupacionOficial</i>
	 */
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Integrantes" + ( (a.getNumeropart() == null) ? ": " : "[" + a.getNumeropart() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta != 0) a.setNumeropart(respuesta);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Chirigota
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Chirigota
	 * @see Util
	 * @param a <i>Chirigota</i>
	 */
	private static void datochirigota(Chirigota a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Cuplés" + ( (a.getNumCuples() == null) ? ": " : "[" + a.getNumCuples() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumCuples(respuesta);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Coro
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Coro
	 * @see Util
	 * @param a <i>Coro</i>
	 */
	private static void datocoro(Coro a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Bandurrias" + ( (a.getBandurrias() == null) ? ": " : "[" + a.getBandurrias() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setBandurrias(respuesta);
		
		pregunta = "Número de Guitarras" + ( (a.getGuitarras() == null) ? ": " : "[" + a.getGuitarras() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setGuitarras(respuesta);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Comparsa
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Comparsa
	 * @see Util
	 * @param a <i>Comparsa</i>
	 */
	private static void datocomparsa(Comparsa a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Empresa de Atrezo" + ( (a.getEmpresaAtrezo() == null) ? ": " : "[" + a.getEmpresaAtrezo() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setEmpresaAtrezo(respuesta);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Cuarteto
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Cuarteto
	 * @see Util
	 * @param a <i>Cuarteto</i>
	 */
	private static void datocuarteto(Cuarteto a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Miembros" + ( (a.getNumMiembros() == null) ? ": " : "[" + a.getNumMiembros() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumMiembros(respuesta);
	}
	
	/**
	 * Gestión para inicializar o editar los atributos de un Objeto Romancero
	 * Se muestra el usuario los diferentes atributos: <ul>
	 * 		<li>Si pulsa enter dejar el valor ya existente en ese atributo</li>
	 * 	 	<li>Si escribe un valor, actualizar el valor en ese atributo</li>
	 * </ul>
	 * @see Romancero
	 * @see Util
	 * @param a <i>Romancero</i>
	 */
	private static void datoromancero(Romancero a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Tematica del Cartelón" + ( (a.getTematicaCartelon() == null) ? ": " : "[" + a.getTematicaCartelon() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setTematicaCartelon(respuesta);
	}
}
