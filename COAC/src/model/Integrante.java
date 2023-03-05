package model;
/**
 * <h2>Clase Integrante, se utiliza para crear Integrante para su posterior gestión</h2>
 * @author maria
 * @since 05-03-2022
 */
public class Integrante {

	/**
	 * Atributo contador del número total de Integrantes creados
	 */
	private static Integer numeroParticipante = 0;
	/**
	 * Atributo nombre del integrante
	 */
	private String nombre;
	/**
	 * Atributo edad del integrante
	 */
	private Integer edad;
	/**
	 * Atributo localidad del integrante
	 */
	private String localidad;
	
	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto Integrante sumando uno al atributo numeroParticipante <i>Atributo contador del número total de Integrantes creados</i> 
	 */
	public Integrante() {
		numeroParticipante++;
		setNumeroParticipante(numeroParticipante);
	}

	/**
	 * Obtener el valor del número de integrantes
	 * @return número de integrantes totales creados
	 */
	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	/**
	 * Establecer el valor del número de integrantes
	 * @param número de integrantes <i>Contador del número total de Integrantes creados</i>
	 */
	private void setNumeroParticipante(Integer numeroParticipante) {
		Integrante.numeroParticipante = numeroParticipante;
	}

	/**
	 * Obtener el valor del nombre del integrante
	 * @return nombre del integrante
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establecer el valor del nombre del integrante
	 * @param nombre <i>Nombre del Integrante</i>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el valor de la edad del integrante
	 * @return edad del integrante
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * Establecer el valor del la edad del integrante
	 * @param edad <i>Edad del Integrante</i>
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}
	}

	/**
	 * Obtener el valor de la Localidad del integrante
	 * @return localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * Establecer el valor de la Localidad del integrante
	 * @param localidad <i>Localidad del Integrante</i>
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de un Integrante
	 * @return representación en texto de un Integrante
	 */
	@Override
	public String toString() {
		return "Integrante: Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Localidad: "
				+ getLocalidad();
	}
	
}
