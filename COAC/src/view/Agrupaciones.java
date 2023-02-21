package view;

import model.*;

public class Agrupaciones {
	
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
	
	static void delAgrupacion() {
		int opc;
		do {
			Listado.listarTodo();
			opc = Util.leerInt("¿cuál quieres borrar?: ");
			Principal.coac.eliminar_agrupacion(Principal.coac.getAgrupaciones()[opc-1]);
			if(!Principal.preguntarMas()) {opc = 0;}
		} while (opc != 0);
	}
	
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
	
	static void addChirigota() {
		Chirigota ch = new Chirigota();
		datosAgrupaciones(ch);
		datochirigota(ch);
		Principal.coac.inscribir_agrupacion(ch);
	}
	
	static void addCoro() {
		Coro c = new Coro();
		datosAgrupaciones(c);
		datocoro(c);
		Principal.coac.inscribir_agrupacion(c);
	}
	
	static void addComparsa() {
		Comparsa com = new Comparsa();
		datosAgrupaciones(com);
		datocomparsa(com);
		Principal.coac.inscribir_agrupacion(com);
	}
	
	static void addcuarteto() {
		Cuarteto cu = new Cuarteto();
		datosAgrupaciones(cu);
		datocuarteto(cu);
		Principal.coac.inscribir_agrupacion(cu);
	}
	
	static void addRomancero() {
		Romancero r = new Romancero();
		datosAgrupaciones(r);
		datoromancero(r);
		Principal.coac.inscribir_agrupacion(r);
	}
	
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
	
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Integrantes" + ( (a.getNumeropart() == null) ? ": " : "[" + a.getNumeropart() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta != 0) a.setNumeropart(respuesta);
	}
	
	private static void datochirigota(Chirigota a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Cuplés" + ( (a.getNumCuples() == null) ? ": " : "[" + a.getNumCuples() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumCuples(respuesta);
	}
	
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
	
	private static void datocomparsa(Comparsa a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Empresa de Atrezo" + ( (a.getEmpresaAtrezo() == null) ? ": " : "[" + a.getEmpresaAtrezo() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setEmpresaAtrezo(respuesta);
	}
	
	private static void datocuarteto(Cuarteto a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Número de Miembros" + ( (a.getNumMiembros() == null) ? ": " : "[" + a.getNumMiembros() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta > 0) a.setNumMiembros(respuesta);
	}
	
	private static void datoromancero(Romancero a) {
		String pregunta;
		String respuesta;
		
		pregunta = "Tematica del Cartelón" + ( (a.getTematicaCartelon() == null) ? ": " : "[" + a.getTematicaCartelon() + "]: ");
		respuesta = Util.leerString(pregunta);
		if(respuesta.length()>0) a.setTematicaCartelon(respuesta);
	}
}
