package model;

public class Chirigota extends AgrupacionOficial implements Callejera{

	private Integer numCuples;

	public Chirigota() {
		super();
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}

	@Override
	public String toString() {
		return "Chirigota: " + super.toString() + " Número de Cuplés: " + getNumCuples();
	}

	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación de la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
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

	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá la Chirigota ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
