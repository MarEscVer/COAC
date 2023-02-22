package model;

/**
 * <h2>Clase Agrupación, se utiliza para crear Agrupaciones para su posterior gestión</h2>
 * @author maria
 * @since 17-02-2022
 */

public abstract class Agrupacion implements Comparable<Agrupacion>{

	/**
	 * Atributo Nombre de la Agrupación
	 */
	private String nombre;
	/**
	 * Atributo Nombre de pila del autor de la Música de la Agrupación
	 */
	private String autor_musica;
	/**
	 * Atributo Nombre de pila del autor de las Letras de la Agrupación
	 */
	private String autor_letra;
	/**
	 * Atributo Nombre de pila del autor de la Agrupación
	 */
	private String autor;
	/**
	 * Atributo Tipo(disfraz) con el cual participa la Agrupación
	 */
	private String tipo;
	/**
	 * Atributo estático usado como contador de número de Agrupaciones que son creadas
	 */
	private static Integer numAgrupaciones = 0;

	
	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Agrupación y aumenta en uno el contador de Agrupaciones <i>numAgrupaciones</i>
	 */
	public Agrupacion() {
		numAgrupaciones ++;
	}
	
	/**
	 * Método para obtener el valor del atributo nombre de una Agrupación
	 * @return valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer valor al atributo nombre de una Agrupación
	 * @param nombre <i>Nombre de la Agrupación</i>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el valor del atributo nombre del autor de la música de una Agrupación
	 * @return valor de autor_musica
	 */
	public String getAutor_musica() {
		return autor_musica;
	}

	/**
	 * Método para establecer valor al atributo nombre del autor de la música de una Agrupación
	 * @param autor_musica <i>Nombre del Autor de la Música</i>
	 */
	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}

	/**
	 * Método para obtener el valor del atributo nombre del autor de letras de una Agrupación
	 * @return autor_letra
	 */
	public String getAutor_letra() {
		return autor_letra;
	}

	/**
	 * Método para establecer valor al atributo nombre del autor de letras de una Agrupación
	 * @param autor_letra <i>Nombre del Autor de la Letra</i>
	 */
	public void setAutor_letra(String autor_letra) {
		this.autor_letra = autor_letra;
	}

	/**
	 * Método para obtener el valor del atributo tipo(disfraz) de una Agrupación
	 * @return valor tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para establecer valor al atributo tipo de una Agrupación
	 * @param tipo <i>Tipo/Disfraz de la Agrupación</i>
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método para obtener el valor del atributo autor de una Agrupación
	 * @return valor de autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método para establecer valor al atributo nombre del autor de una Agrupación
	 * @param autor <i>Nombre del Autor</i>
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Método para obtener el número total de Agrupaciones creadas
	 * @return valor de numAgrupaciones
	 */
	public Integer getNumAgrupaciones() {
		return numAgrupaciones;
	}

	/**
	 * Método abstracto cuya implementación se realizará en sus diversas clases hijas
	 * @see <ul>
	 * 			<li>Chirigota</li>
	 * 			<li>Comparsa</li>
	 * 			<li>Coro</li>
	 * 			<li>Cuarteto</li>
	 * 			<li>Romancero</li>
	 * 		</ul>
	 */
	public abstract String cantarPresentacion();
	
	/**
	 * Método abstracto cuya implementación se realizará en sus diversas clases hijas
	 * @see <ul>
	 * 			<li>Chirigota</li>
	 * 			<li>Comparsa</li>
	 * 			<li>Coro</li>
	 * 			<li>Cuarteto</li>
	 * 			<li>Romancero</li>
	 * 		</ul>
	 */
	public abstract String hacerTipo();
	
	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de una Agrupación
	 * @return valores de una Agruapción
	 */
	@Override
	public String toString() {
		return " Nombre: " + getNombre() + ", Autor: " + getAutor() + ", Autor de Música: " + getAutor_musica()
				+ ", Autor de Letras: " + getAutor_letra() + ", Tipo: " + getTipo();
	}

	/**
	 * Método de ordenación por defecto en base al nombre de las Agrupaciones
	 */
	@Override
	public int compareTo(Agrupacion a) {
		return this.getNombre().compareTo(a.getNombre());
	}
}
