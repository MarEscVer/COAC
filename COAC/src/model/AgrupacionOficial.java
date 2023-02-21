package model;

public abstract class AgrupacionOficial extends Agrupacion {

	private Integer puntos;
	private Integrante[] participante;
	private Integer numeropart;

	public AgrupacionOficial() {
		super();
		setPuntos(0);
		participante = new Integrante[10];
	}
	
	public AgrupacionOficial(Integer numero) {
		super();
		setPuntos(0);
		participante = new Integrante[numero];
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

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
	
	public Integer getNumeropart() {
		return numeropart;
	}

	public void setNumeropart(Integer numeropart) {
		this.numeropart = numeropart;
	}

	public abstract String caminitoDelFalla();
	
	@Override
	public String toString() {
		return " Agrupacion Oficial: " + super.toString() + " Puntos Obtenidos: " + getPuntos();
	}
	
}
