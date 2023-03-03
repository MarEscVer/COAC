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
	 * @return valores de una Chirigota
	 */
	@Override
	public String toString() {
		return "Chirigota: " + super.toString() + " Número de Cuplés: " + getNumCuples();
	}

	/**
	 * Método sobreescrito heredado de clase padre (AgrupacionOficial)
	 * @return Presentación de la Chirigota
	 */
	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación de la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
	/**
	 * Método sobreescrito heredado de clase padre (AgrupacionOficial)
	 * @return Hacer Tipo por parte de la Chirigota
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
	 * Método sobreescrito heredado de clase padre (AgrupacionOficial)
	 * @return la Chirigota se pone en camino del Falla
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
	 * Método sobreescrito implementación de la interfaz Callejera
	 * @return Chirigota 
	 */
	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
