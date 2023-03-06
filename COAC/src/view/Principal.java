package view;

import controller.COAC;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import view.concurso.MenuC;
import view.participantes.MenuP;

/**
 * <h2>Clase Principal</h2>
 * @author maria
 * @since 06-03-2022
 */
public class Principal {
	
	/**
	 * Constante que indica número para inicializar el Objeto COAC
	 */
	static final int TOTAL = 20;
	/**
	 * Inicialización del Objeto COAC
	 * @see COAC
	 */
	public static COAC coac = new COAC(TOTAL);

	
	public static void main(String[] args) {

		/**
		 * Creación de Objeto Chirigota e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Chirigota
		 */
		Chirigota o1 = new Chirigota();
		o1.setNombre("Este año venimos con Esperanza");
		o1.setAutor_letra("Moisés y José Antonio");
		o1.setAutor_musica("José Antonio");
		o1.setAutor("José Antonio");
		coac.inscribir_agrupacion(o1);
		
		/**
		 * Creación de Objeto Comparsa e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Comparsa
		 */
		Comparsa o3 = new Comparsa();
		o3.setNombre("El Andalú");
		o3.setAutor_letra("José Manuel");
		o3.setAutor_musica("Ramón");
		o3.setAutor("Ramón");
		coac.inscribir_agrupacion(o3);
		
		/**
		 * Creación de Objeto Coro e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Coro
		 */
		Coro o5 = new Coro();
		o5.setNombre("La Voz");
		o5.setAutor_letra("Luis Manuel y Juan Manuel");
		o5.setAutor_musica("Luis Manuel y Juan Manuel");
		o5.setAutor("Laura Rivero");
		coac.inscribir_agrupacion(o5);
		
		/**
		 * Creación de Objeto Cuarteto e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Cuarteto
		 */
		Cuarteto o7 = new Cuarteto();
		o7.setNombre("Los Vigilantes de la Laja");
		o7.setAutor_letra("Manuel y Francisco Joshua");
		o7.setAutor_musica("Alejandro");
		o7.setAutor("LuManuelcia");
		coac.inscribir_agrupacion(o7);
		
		/**
		 * Creación de Objeto Romancero e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Romancero
		 */
		Romancero o9 = new Romancero();
		o9.setNombre("Dia a dia");
		o9.setAutor_letra("Tomás");
		o9.setAutor_musica("Joaquin");
		o9.setAutor("Manolo");
		coac.inscribir_agrupacion(o9);
		
		/**
		 * Creación de Objeto Integrante e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Integrante
		 */
		Integrante i1 = new Integrante();
		i1.setEdad(50);
		i1.setLocalidad("Cadiz");
		i1.setNombre("Juan");
		coac.inscribir_participante(i1);
		
		/**
		 * Creación de Objeto Integrante e inicizialización de atributos para realizar pruebas en el proyecto
		 * Inscripción de la misma en el COAC
		 * @see Integrante
		 */
		Integrante i2 = new Integrante();
		i2.setEdad(30);
		i2.setLocalidad("Cadiz");
		i2.setNombre("Pepe");
		coac.inscribir_participante(i2);
		
		/**
		 * Llamada al método de gestión de los menús de vista
		 */
		gestionPrograma();
	}

	/**
	 * Gestión principal de la vista del Proyecto
	 * Muestra del menú y lectura de la opción decidida por el usuario
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see MenuP
	 * @see MenuC
	 * @see Agrupaciones
	 * @see Listado
	 * @see Ordenaciones
	 */
	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> MenuP.opcParticipantes();
			case 2 -> Agrupaciones.addAgrupacion();
			case 3 -> Agrupaciones.delAgrupacion();
			case 4 -> Agrupaciones.editAgrupacion();
			case 5 -> MenuC.opcConcurso();
			case 6 -> Listado.listarTodo();
			case 7 -> Listado.listarChirigotas();
			case 8 -> Listado.listarCoros();
			case 9 -> Listado.listarCuartetos();
			case 10 -> Listado.listarComparsas();
			case 11 -> Listado.listarRomanceros();
			case 12 -> Ordenaciones.ordenarNombre();
			case 13 -> Ordenaciones.ordenarAutor();
			case 14 -> Ordenaciones.ordenarMusicaLetra();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	/**
	 * Mostrar el menú del Proyecto principal
	 */
	private static void mostrarMenuPrincipal() {
		Util.escribirLn("\n");
		Util.escribirLn("╔═══════════════════════════════════╗");
		Util.escribirLn("║      GESTION DE AGRUPACIONES      ║");
		Util.escribirLn("╚═══════════════════════════════════╝");
		Util.escribirLn("  1. Gestión de Participantes.");
		Util.escribirLn("  2. Añadir una agrupación.");
		Util.escribirLn("  3. Eliminar una agrupación.");
		Util.escribirLn("  4. Editar datos de una agrupación.");
		Util.escribirLn("  5. Gestión del Concurso.");
		Util.escribirLn("Listado de agrupaciones:");
		Util.escribirLn("  6. Listar todas.");
		Util.escribirLn("  7. Listar Chirigotas.");
		Util.escribirLn("  8. Listar Coros.");
		Util.escribirLn("  9. Listar Cuartetos.");
		Util.escribirLn(" 10. Listar Comparsas.");
		Util.escribirLn(" 11. Listar Romanceros.");
		Util.escribirLn("Ordenar el listado:");
		Util.escribirLn(" 12. Ordenar por el nombre.");
		Util.escribirLn(" 13. Ordenar por el autor.");
		Util.escribirLn(" 14. Ordenar por el autor de música/letra.");
	}
	
	/**
	 * Finalización del programa
	 */
	private static void finDelPrograma() {
		Util.escribirLn("\nFin del programa.");
		System.exit(0);
	}
	
	/**
	 * Preguntar al usuario si quiere realizar de nuevo la misma acción
	 * @return <ul>
	 * 				<li>True: El usuario quiere realizarla</li>
	 * 				<li>False: El usuario no quiere realizarla</li>
	 * 			</ul>
	 */
	public static boolean preguntarMas() {
		boolean isOk = true;
		String resp = Util.leerString("\n¿Una más? (S/N): ");
		isOk = (resp.equalsIgnoreCase("s")) ? true : false;
		return isOk;
	}

}
