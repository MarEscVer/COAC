package view.participantes;

import view.Util;

public class MenuP {
	static void mostrarMenuParticipantes() {
		Util.escribirLn("\n");
		Util.escribirLn("┌──────────────────────────┐");
		Util.escribirLn("│ GESTION DE PARTICIPANTES │");
		Util.escribirLn("└──────────────────────────┘");
		Util.escribirLn("  1. Añadir un participante.");
		Util.escribirLn("  2. Eliminar un participante.");
		Util.escribirLn("  3. Editar un participante.");
		Util.escribirLn("  4. Listar todos los particpantes.");
		Util.escribirLn("  5. Ordenar por nombre.");
	}
	
	public static void opcParticipantes() {
		int opc;
		do {
			mostrarMenuParticipantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> OpcionP.addIntegrante();
			case 2 -> OpcionP.delIntegrante();
			case 3 -> OpcionP.editIntegrante();
			case 4 -> OpcionP.listarIntegrantes();
			case 5 -> OpcionP.listarIntegrantes();
			}
		} while (opc != 0);
	}
}
