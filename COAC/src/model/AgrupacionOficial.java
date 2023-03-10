package model;

/**
 * <h2>Clase AgrupaciónOficial, se utiliza para crear Agrupaciones Oficiales para su posterior gestión</h2>
 * Hereda de la clase Agrupación
 * @author maria
 * @since 22-02-2022
 */
public abstract class AgrupacionOficial extends Agrupacion {

	/**
	 * Atributo Puntos obtenidos en el Concurso por la Agrupación Oficial
	 */
	private Integer puntos;
	/**
	 * Atributo Participantes (array) de la Agrupación Oficial
	 */
	private Integrante[] participante;
	/**
	 * Atributo Número de participantes reales totales de la Agrupación Oficial (incluidos en el array)
	 */
	private Integer numeropart;
	
	/**
	 * Constructor por defecto, sin parámetros
	 * Crea el objeto AgrupaciónOficial en base al constructor por defecto de su clase padre (Agrupación)
	 * Declaración e inicialización del Array de participantes a un tamaño por defecto determinado
	 * @see Agrupacion
	 */
	public AgrupacionOficial() {
		super();
		setPuntos(0);
		participante = new Integrante[10];
	}
	
	/**
	 * Constructor con un parámetro
	 * Crea el objeto AgrupaciónOficial en base al constructor por defecto de su clase padre (Agrupación)
	 * Declaración e inicialización del Array de participantes en base al parámetro insertado
	 * @see Agrupacion
	 * @param numero <i>Número de participantes máximos de la Agrupación Ofifial</i>
	 */
	public AgrupacionOficial(Integer numero) {
		super();
		setPuntos(0);
		participante = new Integrante[numero];
	}

	/**
	 * Obtener el valor del atributo puntos de una Agrupación Oficial
	 * @return valor de puntos
	 */
	public Integer getPuntos() {
		return puntos;
	}

	/**
	 * Establecer el valor del atributo puntos de una Agrupación Oficial
	 * @param puntos <i>Puntos obtenidos en el Concurso por la Agrupación Ofifial</i>
	 */
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	/**
	 * Insertar un Integrante en el Array de Participantes de una Agrupación Oficial
	 * Comprueba que el integrante no exista en el array y, si es así, lo añade
	 * @param i <i>Objeto Integrante</i>
	 * @return <ul>
	 * 				<li>true: se ha podido añadir el integrante</li>
	 * 				<li>false: no se ha podido añadir el integrante</li>
	 * 			</ul>
	 */
	public boolean insertarIntegrante(Integrante i) {
		boolean added = false;
		boolean isOK = false;
		// Verificamos que el integrante no está ya incluido
		for (int x = 0; x < participante.length; x++) {
			if (participante[x] != null && participante[x].equals(i)) {
				isOK = true;
				break;
			}
		}
		//Lo añadimos en el primer hueco null del array
		if (!isOK) {
			for (int j = 0; j < participante.length; j++) {
				if (participante[j] == null) {
					participante[j] = i;
					added = true;
					break;
				}
			}
		}
		return added;
	}
	
	/**
	 * Eliminar un Integrante en el Array de Participantes de una Agrupación Oficial
	 * Comprueba que el integrante exista en el array y, si es así, lo elimina
	 * @param i <i>Objeto Integrante</i>
	 * @return <ul>
	 * 				<li>true: se ha podido eliminar el integrante</li>
	 * 				<li>false: no se ha podido eliminar el integrante</li>
	 * 			</ul>
	 */
	public boolean eliminarIntegrante(Integrante i) {
		boolean deleted = false;
		for (int x = 0; x < participante.length; x++) {
			if (participante[x] != null && participante[x].equals(i)) {
				participante[x] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	/**
	 * Obtener el valor del atributo numeropart de una Agrupación Oficial
	 * @return valor de numeropart
	 */
	public Integer getNumeropart() {
		return numeropart;
	}
	
	/**
	 * Establecer el valor del atributo numeropart de una Agrupación Oficial
	 * @param numeropart <i>Número de participantes reales totales de la Agrupación Oficial</i>
	 */
	public void setNumeropart(Integer numeropart) {
		this.numeropart = numeropart;
	}
	
	/**
	 * Método abstracto cuya implementación se realizará en sus diversas clases hijas
	 * @see Chirigota
	 * @see Comparsa
	 * @see Romancero
	 * @see Cuarteto
	 */
	public abstract String caminitoDelFalla();
	
	/**
	 * Método sobreescrito para la identificación de los valores de los diferentes atributos de una Agrupación Oficial
	 * @return valores de una Agruapción Oficial
	 */
	@Override
	public String toString() {
		return " Agrupacion Oficial: " + super.toString() + " Puntos Obtenidos: " + getPuntos();
	}
	
}
