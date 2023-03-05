package model;
/**
 * <h2>Clase Coro, se utiliza para crear Coros para su posterior gestión</h2>
 * Hereda de la clase AgrupacionOficial
 * @author maria
 * @since 05-03-2022
 */
public class Coro extends AgrupacionOficial{

	/**
	 * Atributo número de bandurrias en el Coro
	 */
	private Integer bandurrias;
	/**
	 * Atributo número de guitarras en el Coro
	 */
	private Integer guitarras;
	
	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Coro en base al constructor por defecto de su clase padre (AgrupacionOficial)
	 * @see AgrupacionOficial
	 */
	public Coro() {
		super();
	}
	
	/**
	 * Obtener el valor del atributo bandurrias de un Coro
	 * @return número de bandurrias
	 */
	public Integer getBandurrias() {
		return bandurrias;
	}
	
	/**
	 * Establecer el valor del atributo bandurrias de un Coro
	 * @param bandurrias <i>Número de Bandurrias de un Coro</i>
	 */
	public void setBandurrias(Integer bandurrias) {
		this.bandurrias = bandurrias;
	}
	
	/**
	 * Obtener el valor del atributo guitarras de un Coro
	 * @return número de guitarras
	 */
	public Integer getGuitarras() {
		return guitarras;
	}
	
	/**
	 * Establecer el valor del atributo guitarras de un Coro
	 * @param guitarras <i>Número de Guitarras de un Coro</i>
	 */
	public void setGuitarras(Integer guitarras) {
		this.guitarras = guitarras;
	}

	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de un Coro
	 * @return representación en texto de un Coro
	 */
	@Override
	public String toString() {
		return "Coro: " + super.toString() + " Número de Bandurrias: " + getBandurrias() + ", Número de Guitarras: " + getGuitarras();
	}

	/**
	 * El Coro pasa a estar cantando la Presentación
	 * Se comprueba si tenemos el nombre del Coro en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Coro etá cantando la presentación
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Coro ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}

	/**
	 * El Coro pasa a estar haciendo el Tipo
	 * Se comprueba si tenemos el nombre y el Tipo(disfraz) del Coro en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Coro etá haciendo el Tipo
	 */
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "El Coro " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}

	/**
	 * El Coro pasa a estar camino del Falla
	 * Se comprueba si tenemos el nombre del Coro en cuestión para establecer el mensaje concret
	 * @see AgrupacionOficial
	 * @return texto en el que se especifica que el Coro etá camino del Falla
	 */
	@Override
	public String caminitoDelFalla() {
		String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "El Coro " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "El Coro va caminito del Falla";
			}
		return mensaje;
	}
	
}
