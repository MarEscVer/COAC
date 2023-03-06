package view.participantes;

import view.Util;

/**
 * <h2>Clase Menu de los Participantes</h2>
 * @author maria
 * @since 06-03-2022
 */
public class MenuP {
	
	/**
	 * Mostrar el menú de la Gestión de los Participantes
	 */
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
	
	/**
	 * Gestión del Menu de los Participantes
	 * Muestra del menú y lectura de la opción decidida por el usuario
	 * Bucle que finaliza cuando el usuario introduce "0"
	 * @see OpcionP
	 */
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
