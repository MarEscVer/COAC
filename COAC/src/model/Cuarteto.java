package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{

	private Integer NumMiembros;

	public Cuarteto() {
		super();
	}

	public Integer getNumMiembros() {
		return NumMiembros;
	}

	public void setNumMiembros(Integer numMiembros) {
		NumMiembros = numMiembros;
	}

	@Override
	public String toString() {
		return "Cuarteto: " + super.toString() + " Número de Miembros: " + getNumMiembros();
	}

	@Override
	public String cantarPresentacion() {
		String mensaje = "Cantando la presentación del Cuarteto ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
	
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
	
	@Override
	public String caminitoDelFalla() {String mensaje = "";
		if(super.getNombre()!= null) {
			mensaje = "El Cuarteto " + super.getNombre() + " va caminito del Falla";
			} else {
				mensaje = "El Cuarteto va caminito del Falla";
			}
		return mensaje;
	}

	@Override
	public String amoAescucha() {
		String mensaje = "Amo a escuchá el Cuarteto ";
		if(super.getNombre()!= null) {mensaje += super.getNombre();}
		return mensaje;
	}
}
