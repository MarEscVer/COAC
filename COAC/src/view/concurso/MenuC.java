package view.concurso;

import view.Listado;
import view.Util;

public class MenuC {
	
	static void mostrarMenuConcurso() {
		Util.escribirLn("\n");
		Util.escribirLn("┌──────────────────────┐");
		Util.escribirLn("│ GESTION DEL CONCURSO │");
		Util.escribirLn("└──────────────────────┘");
		Util.escribirLn("Concurso:");
		Util.escribirLn("  1. Va camino del Falla.");
		Util.escribirLn("  2. Hacen el Tipo.");
		Util.escribirLn("  3. Canta la Presentación.");
		Util.escribirLn("  4. Asignar puntos.");
		Util.escribirLn("Listado de agrupaciones participantes:");
		Util.escribirLn("  5. Listar todos.");
		Util.escribirLn("  6. Listar Chirigotas.");
		Util.escribirLn("  7. Listar Coros.");
		Util.escribirLn("  8. Listar Cuartetos.");
		Util.escribirLn("  9. Listar Comparsas.");
		Util.escribirLn("Ordenación del listado:");
		Util.escribirLn(" 10. Ordenar por puntos.");
		Util.escribirLn(" 11. Ordenar por el nombre.");
		Util.escribirLn(" 12. Ordenar por el autor.");
		Util.escribirLn(" 13. Ordenar por autor de música/letra.");
	}
	
	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> OpcionC.caminito();
			case 2 -> OpcionC.hacerTipo();
			case 3 -> OpcionC.cantaPresentacion();
			case 4 -> OpcionC.editPuntos();
			case 5 -> Listado.listarOficiales();
			case 6 -> Listado.listarChirigotas();
			case 7 -> Listado.listarCoros();
			case 8 -> Listado.listarCuartetos();
			case 9 -> Listado.listarComparsas();
			case 10 -> OpcionC.ordernarPunto();
			case 11 -> OpcionC.ordenarNombre();
			case 12 -> OpcionC.ordenarAutor();
			case 13 -> OpcionC.ordenarMusicaLetra();
			}
		} while (opc != 0);
	}
}
