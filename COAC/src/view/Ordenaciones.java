package view;

/**
 * <h2>Clase Ordenaciones, creada para gestionar la ordenación de Objetos en la vista</h2>
 * @author maria
 * @since 06-03-2022
 */
public class Ordenaciones {
	
	/**
	 * Ordenar por nombre el objeto COAC y listar todo por pantalla
	 * @see Listado
	 */
	public static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();
		Listado.listarTodo();
	}
	
	/**
	 * Ordenar por nombre del autor el objeto COAC y listar todo por pantalla
	 * @see Listado
	 */
	public static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();;
		Listado.listarTodo();
	}
	
	/**
	 * Ordenar por nombre el nombre del auutor de la música y el de la letra el objeto COAC y listar todo por pantalla
	 * @see Listado
	 */
	public static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();
		Listado.listarTodo();
	}
}
