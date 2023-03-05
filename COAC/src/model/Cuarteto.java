package model;
/**
 * <h2>Clase Cuarteto, se utiliza para crear Cuarteto para su posterior gestión</h2>
 * Hereda de la clase AgrupacionOficial
 * Implementa la interfaz Callejera
 * @author maria
 * @since 05-03-2022
 */
public class Cuarteto extends AgrupacionOficial implements Callejera{

	/**
	 * Atributo número de miembros en el Cuarteto
	 */
	private Integer NumMiembros;

	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Cuarteto en base al constructor por defecto de su clase padre (AgrupacionOficial)
	 * @see AgrupacionOficial
	 */
	public Cuarteto() {
		super();
	}

	/**
	 * Obtener el valor del número de miembros de un Cuarteto
	 * @return número de miembros
	 */
	public Integer getNumMiembros() {
		return NumMiembros;
	}

	/**
	 * Establecer el valor del número de miembros de un Cuarteto
	 * @param numMiembros <i>Número de miembros de un Cuarteto</i>
	 */
	public void setNumMiembros(Integer numMiembros) {
		NumMiembros = numMiembros;
	}

	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de un Cuarteto
	 * @return representación en texto de un Cuarteto
	 */
	@Override
	public String toString() {
		return "Cuarteto: " + super.toString() + " Número de Miembros: " + getNumMiembros();
	}
	
	/**
	 * El Cuarteto pasa a estar cantando la Presentación
	 * Se comprueba si tenemos el nombre del Cuarteto en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Cuarteto etá cantando la presentación
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Cuarteto ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
	/**
	 * El Cuarteto pasa a estar haciendo el Tipo
	 * Se comprueba si tenemos el nombre y el Tipo(disfraz) del Cuarteto en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Cuarteto está haciendo el Tipo
	 */
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "El Cuarteto " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}
	
	/**
	 * El Cuarteto pasa a estar camino del Falla
	 * Se comprueba si tenemos el nombre del Cuarteto en cuestión para establecer el mensaje concreto
	 * @see AgrupacionOficial
	 * @return texto en el que se especifica que el Cuarteto etá camino del Falla
	 */
	@Override
	public String caminitoDelFalla() {String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "El Cuarteto " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "El Cuarteto va caminito del Falla";
			}
		return mensaje;
	}

	/**
	 * El Cuarteto pasa a estar en la calle
	 * Se comprueba si tenemos el nombre del Cuarteto en cuestión para establecer el mensaje concreto
	 * @see Callejera
	 * @return texto en el que se especifica que el Cuarteto está en la calle
	 */
	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá el Cuarteto ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
