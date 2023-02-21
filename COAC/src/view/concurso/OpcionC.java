package view.concurso;

import controller.COAC;
import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import view.Listado;
import view.Principal;
import view.Util;

public class OpcionC {
	
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
	
	static void datoOficial(AgrupacionOficial a) {
		String pregunta;
		int respuesta;
		
		pregunta = "Puntos obtenidos" + ( (a.getPuntos() == null) ? ": " : "[" + a.getPuntos() + "]: ");
		respuesta = Util.leerInt(pregunta);
		if(respuesta != 0) a.setPuntos(respuesta);
	}
	
	static void ordernarPunto() {
		Principal.coac.ordenar_por_puntos();
		Listado.listarOficiales();
	}
	
	//Error elementos nulos
	static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();;
		Listado.listarOficiales();
	}
		
	static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();;
		Listado.listarOficiales();
	}
		
	static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();;
		Listado.listarOficiales();
	}
}