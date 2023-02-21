package model;

public class Integrante {

	private static Integer numeroParticipante = 0;
	private String nombre;
	private Integer edad;
	private String localidad;
	
	public Integrante() {
		numeroParticipante++;
		setNumeroParticipante(numeroParticipante);
	}

	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	private void setNumeroParticipante(Integer numeroParticipante) {
		Integrante.numeroParticipante = numeroParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Integrante: Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Localidad: "
				+ getLocalidad() + "Número de Integrante: " + getNumeroParticipante();
	}
	
}
