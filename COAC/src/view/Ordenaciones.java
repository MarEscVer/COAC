package view;

public class Ordenaciones {
	
	// Error elementos nulos
	public static void ordenarNombre() {
		Principal.coac.ordenar_por_nombre();
		Listado.listarTodo();
	}
	
	public static void ordenarAutor() {
		Principal.coac.ordenar_por_autor();;
		Listado.listarTodo();
	}
	
	public static void ordenarMusicaLetra() {
		Principal.coac.ordenar_por_autor_musica_letra();
		Listado.listarTodo();
	}
}
