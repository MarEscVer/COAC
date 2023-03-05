package model;
/**
 * <h2>Clase Romancero, se utiliza para crear Romancero para su posterior gestión</h2>
 * Hereda de la clase Agrupacion
 * Implementa la interfaz Callejera
 * @author maria
 * @since 05-03-2022
 */
public class Romancero extends Agrupacion implements Callejera{

	/**
	 * Atributo temática del cartelón del Romancero
	 */
	private String TematicaCartelon;

	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Romancero en base al constructor por defecto de su clase padre (Agrupacion)
	 * @see Agrupacion
	 */
	public Romancero() {
		super();
	}
	
	/**
	 * Obtener el valor de la temática del Cartelón del Romancero
	 * @return tematica del Cartelón
	 */
	public String getTematicaCartelon() {
		return TematicaCartelon;
	}

	/**
	 * Establecer el valor de la temática del cartelón del Romancero
	 * @param tematicaCartelon <i>Temática del cartelón del Romancero</i>
	 */
	public void setTematicaCartelon(String tematicaCartelon) {
		TematicaCartelon = tematicaCartelon;
	}
	
	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de un Romancero
	 * @return representación en texto de un Romancero
	 */
	@Override
	public String toString() {
		return "Romancero: " + super.toString() + " Temática del Cartelón: " + getTematicaCartelon();
	}

	/**
	 * El Romancero pasa a estar cantando la Presentación
	 * Se comprueba si tenemos el nombre del Romancero en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Romancero etá cantando la presentación
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Romancero ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
	/**
	 * El Romancero pasa a estar haciendo el Tipo
	 * Se comprueba si tenemos el nombre y el Tipo(disfraz) del Romancero en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que el Romancero está haciendo el Tipo
	 */
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "El Romancero " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}

	/**
	 * El Romancero pasa a estar en la calle
	 * Se comprueba si tenemos el nombre del Romancero en cuestión para establecer el mensaje concreto
	 * @see Callejera
	 * @return texto en el que se especifica que el Romancero está en la calle
	 */
	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá el Romancero ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
