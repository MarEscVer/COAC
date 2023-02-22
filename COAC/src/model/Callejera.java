package model;

/**
 * Interfaz Callejera para la implementación de un único método en diferentes clases (Agrupaciones)
 * @author maria
 * @since 22-02-2022
 */
public interface Callejera {

	/**
	 * Método abstracto cuya implementación se realizará en sus diversas clases hijas
	 * @see <ul>
	 *			<li>Chirigota</li>
	 *			<li>Comparsa</li>
	 *			<li>Romancero</li>
	 *			<li>Cuarteto</li>
	 *		</ul>
	 */
	public String amoAescucha();
	
}
