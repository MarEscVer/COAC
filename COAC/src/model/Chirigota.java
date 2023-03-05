package model;

/**
 * <h2>Clase Chirigota, se utiliza para crear Chirigotas para su posterior gestión</h2>
 * @author maria
 * @since 22-02-2022
 */
public class Chirigota extends AgrupacionOficial implements Callejera{

	/**
	 * Atributo Número de Cuplés cantados por la Chirigota
	 */
	private Integer numCuples;

	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Chirigota en base al constructor por defecto de su clase padre (AgrupaciónOficial)
	 * @see AgrupacionOficial
	 */
	public Chirigota() {
		super();
	}

	/**
	 * Obtener el valor del atributo números de Cuplés
	 * @return valor de numeros de Cuplés
	 */
	public Integer getNumCuples() {
		return numCuples;
	}
	
	/**
	 * Establecer el valor del atributo números de Cuplés
	 * @param numCuples <i>Número de Cuplés cantados por la Chirigota</i>
	 */
	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}

	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de una Chirigota
	 * @return representación en texto de una Chirigota
	 */
	@Override
	public String toString() {
		return "Chirigota: " + super.toString() + " Número de Cuplés: " + getNumCuples();
	}

	/**
	 * La Chirigota pasa a estar cantando la Presentación
	 * Se comprueba si tenemos el nombre de la Chirigota en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que la Chirigota etá cantando la presentación
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación de la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
	/**
	 * La Chirigota pasa a estar haciendo el Tipo
	 * Se comprueba si tenemos el nombre y el Tipo(disfraz) de la Chirigota en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que la Chirigota está haciendo el Tipo
	 */
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "La Chirigota " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}
	
	/**
	 * La Chirigota pasa a estar camino del Falla
	 * Se comprueba si tenemos el nombre de la Chirigota en cuestión para establecer el mensaje concret
	 * @see AgrupacionOficial
	 * @return texto en el que se especifica que la Chirigota etá camino del Falla
	 */
	@Override
	public String caminitoDelFalla() {
		String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "La Chirigota " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "La Chirigota va caminito del Falla";
			}
		return mensaje;
	}

	/**
	 * La Chirigota pasa a estar en la calle
	 * Se comprueba si tenemos el nombre de la Chirigota en cuestión para establecer el mensaje concreto
	 * @see Callejera
	 * @return texto en el que se especifica que la Chirigota está en la calle
	 */
	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
