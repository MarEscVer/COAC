package model;

/**
 * <h2>Clase Comparsa, se utiliza para crear Comparsa para su posterior gestión</h2>
 * Hereda de la clase AgrupacionOficial
 * @author maria
 * @since 05-03-2022
 */
public class Comparsa extends AgrupacionOficial {
 
	/**
	 * Atributo empresa de Atrezo de la Comparsa
	 */
	private String empresaAtrezo;

	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Comparsa en base al constructor por defecto de su clase padre (Agrupacion)
	 * @see AgrupacionOficial
	 */
	public Comparsa() {
		super();
	}
	
	/**
	 * Obtener el valor de la empresa de Atrezo de la Comparsa
	 * @return empresa de Atrezo
	 */
	public String getEmpresaAtrezo() {
		return empresaAtrezo;
	}

	/**
	 * Establecer el valor de la empresa de Atrezo de la Comparsa
	 * @param empresaAtrezo <i>Empresa de Atrezo de la Comparsa</i>
	 */
	public void setEmpresaAtrezo(String empresaAtrezo) {
		this.empresaAtrezo = empresaAtrezo;
	}

	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de una Comparsa
	 * @return representación en texto de una Comparsa
	 */
	@Override
	public String toString() {
		return "Comparsa: " + super.toString() + " Empresa de atrezo: " + getEmpresaAtrezo();
	}

	/**
	 * La Comparsa pasa a estar cantando la Presentación
	 * Se comprueba si tenemos el nombre de la Comparsa en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que la Comparsa etá cantando la presentación
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación de la Comparsa ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}

	/**
	 * La Comparsa pasa a estar haciendo el Tipo
	 * Se comprueba si tenemos el nombre y el Tipo(disfraz) de la Comparsa en cuestión para establecer el mensaje concreto
	 * @see Agrupacion
	 * @return texto en el que se especifica que la Comparsa está haciendo el Tipo
	 */
	@Override
	public String hacerTipo() {
		String mensaje = "";
		if(super.getNombre()!= null && super.getTipo() != null) {
			mensaje = "La Comparsa " + super.getNombre() + " va de " + super.getTipo();
			} else {
				mensaje = "Información no conocida";
			}
		return mensaje;
	}
	
	/**
	 * La Comparsa pasa a estar camino del Falla
	 * Se comprueba si tenemos el nombre de la Comparsa en cuestión para establecer el mensaje concret
	 * @see AgrupacionOficial
	 * @return texto en el que se especifica que la Comparsa etá camino del Falla
	 */
	@Override
	public String caminitoDelFalla() {
		String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "La Comparsa " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "La Comparsa va caminito del Falla";
			}
		return mensaje;
	}

}
